import sys
class Interpreter(object):
	"""
	Runtime environment to execute the intermediate code.
	Attributes:
	lines: The intermediate code separated as lines
	stack: The stack to help in implementation
	symbol_table: Dictionary that contains the variables with their values
	line_no: Current line number of the code that is executed
	"""

	def __init__(self, lines = []):
		self.lines = lines
		self.stack = []
		self.symbol_table = {}
		self.line_no = 0

	def run(self):
		while self.line_no < len(self.lines):
			self.run_each_line()

	def run_each_line(self):
		line = self.lines[self.line_no]
		self.line_no += 1
		arguments = line.split()
		instruction = arguments.pop(0)
		if hasattr(self, instruction):
			getattr(self, instruction)(arguments)

	def obtain_value(self, args):
		if isinstance(args, (int, bool)):
			return args
		if isinstance(args, list):
			args[0] = args[0].replace("[","")
			args[0] = args[0].replace("]","")
			var = args[0]
		else:
			var = args
		if var in self.symbol_table:
			return self.symbol_table[var]
		try:
			return int(var)
		except Exception:
			pass
		if var == 'FALSE':
			return False
		if var == 'TRUE':
			return True

	def BEGIN(self, args):
		pass

	def PRINT(self, args):
		print self.obtain_value(args)

	def WRITE(self, args):
		self.stack.append(args)

	def GET(self, args):
		self.stack.append(raw_input("Enter value: "))

	def SAVEINT(self, args):
		if not self.stack:
			self.symbol_table[args[0]] = 0
		else:
			self.symbol_table[args[0]] = self.obtain_value(self.stack.pop())

	def SAVEBOOL(self,args):
		if not self.stack:
			self.symbol_table[args[0]] = False
		else:
			self.symbol_table[args[0]] = self.obtain_value(self.stack.pop())

	def IFTRUEGOTO(self, args):
		cond = self.obtain_value(self.stack.pop())
		if cond:
			self.line_no = int(args[0]) - 1

	def IFFALSEGOTO(self, args):
		cond = self.obtain_value(self.stack.pop())
		if not cond:
			self.line_no = int(args[0]) - 1

	def obtain_values_from_stack(self):
		right_val = self.obtain_value(self.stack.pop())
		left_val = self.obtain_value(self.stack.pop())
		return right_val, left_val

	def ADD(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val + right_val)

	def SUBTRACT(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val - right_val)

	def MULTIPLY(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val * right_val)

	def DIVIDE(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val / right_val)

	def MODULUS(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val % right_val)

	def GREATER(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val > right_val)

	def LESSER(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val < right_val)

	def GREATEROREQUAL(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val >= right_val)

	def LESSEROREQUAL(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val <= right_val)

	def EQUALS(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val == right_val)

	def NOTEQUALS(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val != right_val)

	def AND(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val and right_val)

	def OR(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val or right_val)

	def IS(self, args):
		right_val, left_val = self.obtain_values_from_stack()
		self.stack.append(left_val == right_val)

	def END(self, args):
		pass


fp = open(sys.argv[1], "r")
int_file = fp.read()
lines = int_file.split('\n')
del lines[-1]
interpreter = Interpreter(lines)
interpreter.run()
