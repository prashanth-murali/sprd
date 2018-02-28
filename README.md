
SRPD - A Simple Programming Language.

Tools used:

1. The compiler and runtime can be built using MacOS/Windows/Unix/Linux. 
2. Antlr v4.7 was used to generate the parser and lexer from the grammar.
3. Grammar was a .g4 file based on Antlr.
4. Intermediate code was generated from implementing the generated Listener interface.
5. Python was used to write the runtime environment.


Installation:

1. Download Compiler.jar and Interpreter.py from the executable directory of the project.
2. Write a program in SPRD language and save it to a file with a filename.
3. Execute: java -jar Compiler.jar filename
4. An abstract syntax tree gets generated that is a tree representation of the parsing.
5. Along with this, an intermediate.isprd file gets generated in the directory of execution
that has the intermediate code for the language.
6. Execute: python Interpreter.py filename.isprd
7. This will gives us the output of the program.

