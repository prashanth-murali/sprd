// Generated from SPRD.g4 by ANTLR 4.4
package Grammar;
 
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPRDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, BOOLEANCOMP=11, IS=12, IF=13, ELSE=14, WHILE=15, BOOL=16, INTEGER=17, 
		IDENTIFIER=18, WHITESPACE=19, COMMENT=20, PRIORITYONEOP=21, PRIORITYTWOOP=22, 
		INTEGERCOMPARISION=23, AND=24, OR=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'Get'", "'int'", "'print'", "'('", "')'", "'{'", "','", 
		"'}'", "'='", "'bool'", "BOOLEANCOMP", "'is'", "'if'", "'else'", "'while'", 
		"BOOL", "INTEGER", "IDENTIFIER", "WHITESPACE", "COMMENT", "PRIORITYONEOP", 
		"PRIORITYTWOOP", "INTEGERCOMPARISION", "'&&'", "'||'"
	};
	public static final int
		RULE_begin = 0, RULE_program = 1, RULE_compareInteger = 2, RULE_compareBoolean = 3, 
		RULE_comparisionExpr = 4, RULE_bExpr = 5, RULE_bSubExpr = 6, RULE_bTerm = 7, 
		RULE_subBTerm = 8, RULE_bFactor = 9, RULE_expr = 10, RULE_subExpr = 11, 
		RULE_term = 12, RULE_subTerm = 13, RULE_factor = 14, RULE_intDeclaration = 15, 
		RULE_boolDeclaration = 16, RULE_intAssignment = 17, RULE_boolAssignment = 18, 
		RULE_whileLoopConstruct = 19, RULE_whileCond = 20, RULE_loopBody = 21, 
		RULE_ifElseConstruct = 22, RULE_ifStatement = 23, RULE_ifCond = 24, RULE_ifBody = 25, 
		RULE_elseStatement = 26, RULE_elseBody = 27, RULE_printFunc = 28, RULE_scanFunc = 29;
	public static final String[] ruleNames = {
		"begin", "program", "compareInteger", "compareBoolean", "comparisionExpr", 
		"bExpr", "bSubExpr", "bTerm", "subBTerm", "bFactor", "expr", "subExpr", 
		"term", "subTerm", "factor", "intDeclaration", "boolDeclaration", "intAssignment", 
		"boolAssignment", "whileLoopConstruct", "whileCond", "loopBody", "ifElseConstruct", 
		"ifStatement", "ifCond", "ifBody", "elseStatement", "elseBody", "printFunc", 
		"scanFunc"
	};

	@Override
	public String getGrammarFileName() { return "SPRD.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ArrayList<String> variableNames = new ArrayList<String>();
		private Map<String, String> variableType = new HashMap<String, String>();
	   
	    private boolean variableDefined(String name){
	    	//System.out.println(v ariableNames);
	    	//System.out.println(variableType);
	    	
	    		boolean doesContain = variableNames.contains(name);
	    		return doesContain;
	    		
	    }

	    private void defineVariable(String name,String type){
	        variableNames.add(name);
	        variableType.put(name,type);
	    }
	    
	    private boolean isBooleanVariable(String name){
	    	String type = variableType.get(name);
	    	return type.equals("bool");
	    }

	public SPRDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BeginContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<IntDeclarationContext> intDeclaration() {
			return getRuleContexts(IntDeclarationContext.class);
		}
		public IfElseConstructContext ifElseConstruct(int i) {
			return getRuleContext(IfElseConstructContext.class,i);
		}
		public List<WhileLoopConstructContext> whileLoopConstruct() {
			return getRuleContexts(WhileLoopConstructContext.class);
		}
		public List<BoolDeclarationContext> boolDeclaration() {
			return getRuleContexts(BoolDeclarationContext.class);
		}
		public IntDeclarationContext intDeclaration(int i) {
			return getRuleContext(IntDeclarationContext.class,i);
		}
		public List<IntAssignmentContext> intAssignment() {
			return getRuleContexts(IntAssignmentContext.class);
		}
		public List<PrintFuncContext> printFunc() {
			return getRuleContexts(PrintFuncContext.class);
		}
		public IntAssignmentContext intAssignment(int i) {
			return getRuleContext(IntAssignmentContext.class,i);
		}
		public List<IfElseConstructContext> ifElseConstruct() {
			return getRuleContexts(IfElseConstructContext.class);
		}
		public BoolAssignmentContext boolAssignment(int i) {
			return getRuleContext(BoolAssignmentContext.class,i);
		}
		public PrintFuncContext printFunc(int i) {
			return getRuleContext(PrintFuncContext.class,i);
		}
		public WhileLoopConstructContext whileLoopConstruct(int i) {
			return getRuleContext(WhileLoopConstructContext.class,i);
		}
		public List<BoolAssignmentContext> boolAssignment() {
			return getRuleContexts(BoolAssignmentContext.class);
		}
		public BoolDeclarationContext boolDeclaration(int i) {
			return getRuleContext(BoolDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(69);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(62); intDeclaration();
					}
					break;
				case 2:
					{
					setState(63); boolDeclaration();
					}
					break;
				case 3:
					{
					setState(64); intAssignment();
					}
					break;
				case 4:
					{
					setState(65); boolAssignment();
					}
					break;
				case 5:
					{
					setState(66); whileLoopConstruct();
					}
					break;
				case 6:
					{
					setState(67); ifElseConstruct();
					}
					break;
				case 7:
					{
					setState(68); printFunc();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareIntegerContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode INTEGERCOMPARISION() { return getToken(SPRDParser.INTEGERCOMPARISION, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterCompareInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitCompareInteger(this);
		}
	}

	public final CompareIntegerContext compareInteger() throws RecognitionException {
		CompareIntegerContext _localctx = new CompareIntegerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compareInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); expr();
			setState(75); match(INTEGERCOMPARISION);
			setState(76); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareBooleanContext extends ParserRuleContext {
		public List<BExprContext> bExpr() {
			return getRuleContexts(BExprContext.class);
		}
		public TerminalNode BOOLEANCOMP() { return getToken(SPRDParser.BOOLEANCOMP, 0); }
		public BExprContext bExpr(int i) {
			return getRuleContext(BExprContext.class,i);
		}
		public CompareBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterCompareBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitCompareBoolean(this);
		}
	}

	public final CompareBooleanContext compareBoolean() throws RecognitionException {
		CompareBooleanContext _localctx = new CompareBooleanContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compareBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); bExpr();
			setState(79); match(BOOLEANCOMP);
			setState(80); bExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisionExprContext extends ParserRuleContext {
		public CompareIntegerContext compareInteger() {
			return getRuleContext(CompareIntegerContext.class,0);
		}
		public CompareBooleanContext compareBoolean() {
			return getRuleContext(CompareBooleanContext.class,0);
		}
		public ComparisionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterComparisionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitComparisionExpr(this);
		}
	}

	public final ComparisionExprContext comparisionExpr() throws RecognitionException {
		ComparisionExprContext _localctx = new ComparisionExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparisionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82); compareInteger();
				}
				break;
			case 2:
				{
				setState(83); compareBoolean();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BExprContext extends ParserRuleContext {
		public BTermContext bTerm() {
			return getRuleContext(BTermContext.class,0);
		}
		public List<BSubExprContext> bSubExpr() {
			return getRuleContexts(BSubExprContext.class);
		}
		public BSubExprContext bSubExpr(int i) {
			return getRuleContext(BSubExprContext.class,i);
		}
		public BExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBExpr(this);
		}
	}

	public final BExprContext bExpr() throws RecognitionException {
		BExprContext _localctx = new BExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86); bTerm();
			}
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87); bSubExpr();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BSubExprContext extends ParserRuleContext {
		public BTermContext bTerm() {
			return getRuleContext(BTermContext.class,0);
		}
		public TerminalNode OR() { return getToken(SPRDParser.OR, 0); }
		public BSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBSubExpr(this);
		}
	}

	public final BSubExprContext bSubExpr() throws RecognitionException {
		BSubExprContext _localctx = new BSubExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bSubExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(OR);
			setState(94); bTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BTermContext extends ParserRuleContext {
		public BFactorContext bFactor() {
			return getRuleContext(BFactorContext.class,0);
		}
		public List<SubBTermContext> subBTerm() {
			return getRuleContexts(SubBTermContext.class);
		}
		public SubBTermContext subBTerm(int i) {
			return getRuleContext(SubBTermContext.class,i);
		}
		public BTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBTerm(this);
		}
	}

	public final BTermContext bTerm() throws RecognitionException {
		BTermContext _localctx = new BTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96); bFactor();
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); subBTerm();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubBTermContext extends ParserRuleContext {
		public BFactorContext bFactor() {
			return getRuleContext(BFactorContext.class,0);
		}
		public TerminalNode AND() { return getToken(SPRDParser.AND, 0); }
		public SubBTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterSubBTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitSubBTerm(this);
		}
	}

	public final SubBTermContext subBTerm() throws RecognitionException {
		SubBTermContext _localctx = new SubBTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subBTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(AND);
			setState(104); bFactor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BFactorContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode BOOL() { return getToken(SPRDParser.BOOL, 0); }
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public BFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBFactor(this);
		}
	}

	public final BFactorContext bFactor() throws RecognitionException {
		BFactorContext _localctx = new BFactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(106); ((BFactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(107);
				if (!(isBooleanVariable((((BFactorContext)_localctx).IDENTIFIER!=null?((BFactorContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "isBooleanVariable($IDENTIFIER.text)");
				}
				break;
			case BOOL:
				{
				setState(108); match(BOOL);
				}
				break;
			case T__6:
				{
				setState(109); match(T__6);
				setState(110); bExpr();
				setState(111); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115); term();
			}
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116); subExpr();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PRIORITYTWOOP() { return getToken(SPRDParser.PRIORITYTWOOP, 0); }
		public SubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitSubExpr(this);
		}
	}

	public final SubExprContext subExpr() throws RecognitionException {
		SubExprContext _localctx = new SubExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(PRIORITYTWOOP);
			setState(123); term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public SubTermContext subTerm(int i) {
			return getRuleContext(SubTermContext.class,i);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<SubTermContext> subTerm() {
			return getRuleContexts(SubTermContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125); factor();
			}
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); subTerm();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubTermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PRIORITYONEOP() { return getToken(SPRDParser.PRIORITYONEOP, 0); }
		public SubTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterSubTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitSubTerm(this);
		}
	}

	public final SubTermContext subTerm() throws RecognitionException {
		SubTermContext _localctx = new SubTermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(PRIORITYONEOP);
			setState(133); factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode INTEGER() { return getToken(SPRDParser.INTEGER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(135); ((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(136);
				if (!(!isBooleanVariable((((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "!isBooleanVariable($IDENTIFIER.text)");
				}
				break;
			case INTEGER:
				{
				setState(137); match(INTEGER);
				}
				break;
			case T__6:
				{
				setState(138); match(T__6);
				setState(139); expr();
				setState(140); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public List<ScanFuncContext> scanFunc() {
			return getRuleContexts(ScanFuncContext.class);
		}
		public ScanFuncContext scanFunc(int i) {
			return getRuleContext(ScanFuncContext.class,i);
		}
		public IntDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIntDeclaration(this);
		}
	}

	public final IntDeclarationContext intDeclaration() throws RecognitionException {
		IntDeclarationContext _localctx = new IntDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__8);
			setState(145); ((IntDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146); match(T__1);
					setState(149);
					switch (_input.LA(1)) {
					case T__6:
					case INTEGER:
					case IDENTIFIER:
						{
						setState(147); expr();
						}
						break;
					case T__9:
						{
						setState(148); scanFunc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(156);
			if (!(!variableDefined((((IntDeclarationContext)_localctx).IDENTIFIER!=null?((IntDeclarationContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "!variableDefined($IDENTIFIER.text)");
			defineVariable((((IntDeclarationContext)_localctx).IDENTIFIER!=null?((IntDeclarationContext)_localctx).IDENTIFIER.getText():null),"int");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<BExprContext> bExpr() {
			return getRuleContexts(BExprContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public List<ScanFuncContext> scanFunc() {
			return getRuleContexts(ScanFuncContext.class);
		}
		public ScanFuncContext scanFunc(int i) {
			return getRuleContext(ScanFuncContext.class,i);
		}
		public BExprContext bExpr(int i) {
			return getRuleContext(BExprContext.class,i);
		}
		public BoolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBoolDeclaration(this);
		}
	}

	public final BoolDeclarationContext boolDeclaration() throws RecognitionException {
		BoolDeclarationContext _localctx = new BoolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(T__0);
			setState(160); ((BoolDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161); match(T__1);
					setState(164);
					switch (_input.LA(1)) {
					case T__6:
					case BOOL:
					case IDENTIFIER:
						{
						setState(162); bExpr();
						}
						break;
					case T__9:
						{
						setState(163); scanFunc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(171);
			if (!(!variableDefined((((BoolDeclarationContext)_localctx).IDENTIFIER!=null?((BoolDeclarationContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "!variableDefined($IDENTIFIER.text)");
			defineVariable((((BoolDeclarationContext)_localctx).IDENTIFIER!=null?((BoolDeclarationContext)_localctx).IDENTIFIER.getText():null),"bool");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntAssignmentContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public ScanFuncContext scanFunc() {
			return getRuleContext(ScanFuncContext.class,0);
		}
		public IntAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIntAssignment(this);
		}
	}

	public final IntAssignmentContext intAssignment() throws RecognitionException {
		IntAssignmentContext _localctx = new IntAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); ((IntAssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(175); match(T__1);
			setState(178);
			switch (_input.LA(1)) {
			case T__6:
			case INTEGER:
			case IDENTIFIER:
				{
				setState(176); expr();
				}
				break;
			case T__9:
				{
				setState(177); scanFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			if (!(variableDefined((((IntAssignmentContext)_localctx).IDENTIFIER!=null?((IntAssignmentContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "variableDefined($IDENTIFIER.text)");
			setState(181);
			if (!(!isBooleanVariable((((IntAssignmentContext)_localctx).IDENTIFIER!=null?((IntAssignmentContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "!isBooleanVariable($IDENTIFIER.text)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolAssignmentContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SPRDParser.IDENTIFIER, 0); }
		public ScanFuncContext scanFunc() {
			return getRuleContext(ScanFuncContext.class,0);
		}
		public BoolAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterBoolAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitBoolAssignment(this);
		}
	}

	public final BoolAssignmentContext boolAssignment() throws RecognitionException {
		BoolAssignmentContext _localctx = new BoolAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((BoolAssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(184); match(T__1);
			setState(187);
			switch (_input.LA(1)) {
			case T__6:
			case BOOL:
			case IDENTIFIER:
				{
				setState(185); bExpr();
				}
				break;
			case T__9:
				{
				setState(186); scanFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(189);
			if (!(variableDefined((((BoolAssignmentContext)_localctx).IDENTIFIER!=null?((BoolAssignmentContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "variableDefined($IDENTIFIER.text)");
			setState(190);
			if (!(isBooleanVariable((((BoolAssignmentContext)_localctx).IDENTIFIER!=null?((BoolAssignmentContext)_localctx).IDENTIFIER.getText():null)))) throw new FailedPredicateException(this, "isBooleanVariable($IDENTIFIER.text)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopConstructContext extends ParserRuleContext {
		public WhileCondContext whileCond() {
			return getRuleContext(WhileCondContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public WhileLoopConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterWhileLoopConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitWhileLoopConstruct(this);
		}
	}

	public final WhileLoopConstructContext whileLoopConstruct() throws RecognitionException {
		WhileLoopConstructContext _localctx = new WhileLoopConstructContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileLoopConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); whileCond();
			setState(193); match(T__4);
			setState(194); loopBody();
			setState(195); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileCondContext extends ParserRuleContext {
		public ComparisionExprContext comparisionExpr() {
			return getRuleContext(ComparisionExprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SPRDParser.WHILE, 0); }
		public WhileCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterWhileCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitWhileCond(this);
		}
	}

	public final WhileCondContext whileCond() throws RecognitionException {
		WhileCondContext _localctx = new WhileCondContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(WHILE);
			setState(198); match(T__6);
			setState(199); comparisionExpr();
			setState(200); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBodyContext extends ParserRuleContext {
		public List<IntDeclarationContext> intDeclaration() {
			return getRuleContexts(IntDeclarationContext.class);
		}
		public IfElseConstructContext ifElseConstruct(int i) {
			return getRuleContext(IfElseConstructContext.class,i);
		}
		public List<WhileLoopConstructContext> whileLoopConstruct() {
			return getRuleContexts(WhileLoopConstructContext.class);
		}
		public List<BoolDeclarationContext> boolDeclaration() {
			return getRuleContexts(BoolDeclarationContext.class);
		}
		public IntDeclarationContext intDeclaration(int i) {
			return getRuleContext(IntDeclarationContext.class,i);
		}
		public List<IntAssignmentContext> intAssignment() {
			return getRuleContexts(IntAssignmentContext.class);
		}
		public List<PrintFuncContext> printFunc() {
			return getRuleContexts(PrintFuncContext.class);
		}
		public IntAssignmentContext intAssignment(int i) {
			return getRuleContext(IntAssignmentContext.class,i);
		}
		public List<IfElseConstructContext> ifElseConstruct() {
			return getRuleContexts(IfElseConstructContext.class);
		}
		public BoolAssignmentContext boolAssignment(int i) {
			return getRuleContext(BoolAssignmentContext.class,i);
		}
		public PrintFuncContext printFunc(int i) {
			return getRuleContext(PrintFuncContext.class,i);
		}
		public WhileLoopConstructContext whileLoopConstruct(int i) {
			return getRuleContext(WhileLoopConstructContext.class,i);
		}
		public List<BoolAssignmentContext> boolAssignment() {
			return getRuleContexts(BoolAssignmentContext.class);
		}
		public BoolDeclarationContext boolDeclaration(int i) {
			return getRuleContext(BoolDeclarationContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitLoopBody(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(209);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(202); intDeclaration();
					}
					break;
				case 2:
					{
					setState(203); boolDeclaration();
					}
					break;
				case 3:
					{
					setState(204); intAssignment();
					}
					break;
				case 4:
					{
					setState(205); boolAssignment();
					}
					break;
				case 5:
					{
					setState(206); whileLoopConstruct();
					}
					break;
				case 6:
					{
					setState(207); ifElseConstruct();
					}
					break;
				case 7:
					{
					setState(208); printFunc();
					}
					break;
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseConstructContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfElseConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIfElseConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIfElseConstruct(this);
		}
	}

	public final IfElseConstructContext ifElseConstruct() throws RecognitionException {
		IfElseConstructContext _localctx = new IfElseConstructContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifElseConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214); ifStatement();
			}
			setState(216);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(215); elseStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); ifCond();
			setState(219); match(T__4);
			setState(220); ifBody();
			setState(221); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SPRDParser.IF, 0); }
		public ComparisionExprContext comparisionExpr() {
			return getRuleContext(ComparisionExprContext.class,0);
		}
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIfCond(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(IF);
			setState(224); match(T__6);
			{
			setState(225); comparisionExpr();
			}
			setState(226); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBodyContext extends ParserRuleContext {
		public List<IntDeclarationContext> intDeclaration() {
			return getRuleContexts(IntDeclarationContext.class);
		}
		public IfElseConstructContext ifElseConstruct(int i) {
			return getRuleContext(IfElseConstructContext.class,i);
		}
		public List<WhileLoopConstructContext> whileLoopConstruct() {
			return getRuleContexts(WhileLoopConstructContext.class);
		}
		public List<BoolDeclarationContext> boolDeclaration() {
			return getRuleContexts(BoolDeclarationContext.class);
		}
		public IntDeclarationContext intDeclaration(int i) {
			return getRuleContext(IntDeclarationContext.class,i);
		}
		public List<IntAssignmentContext> intAssignment() {
			return getRuleContexts(IntAssignmentContext.class);
		}
		public List<PrintFuncContext> printFunc() {
			return getRuleContexts(PrintFuncContext.class);
		}
		public IntAssignmentContext intAssignment(int i) {
			return getRuleContext(IntAssignmentContext.class,i);
		}
		public List<IfElseConstructContext> ifElseConstruct() {
			return getRuleContexts(IfElseConstructContext.class);
		}
		public BoolAssignmentContext boolAssignment(int i) {
			return getRuleContext(BoolAssignmentContext.class,i);
		}
		public PrintFuncContext printFunc(int i) {
			return getRuleContext(PrintFuncContext.class,i);
		}
		public WhileLoopConstructContext whileLoopConstruct(int i) {
			return getRuleContext(WhileLoopConstructContext.class,i);
		}
		public List<BoolAssignmentContext> boolAssignment() {
			return getRuleContexts(BoolAssignmentContext.class);
		}
		public BoolDeclarationContext boolDeclaration(int i) {
			return getRuleContext(BoolDeclarationContext.class,i);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(235);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(228); intDeclaration();
					}
					break;
				case 2:
					{
					setState(229); boolDeclaration();
					}
					break;
				case 3:
					{
					setState(230); intAssignment();
					}
					break;
				case 4:
					{
					setState(231); boolAssignment();
					}
					break;
				case 5:
					{
					setState(232); whileLoopConstruct();
					}
					break;
				case 6:
					{
					setState(233); ifElseConstruct();
					}
					break;
				case 7:
					{
					setState(234); printFunc();
					}
					break;
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SPRDParser.ELSE, 0); }
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(ELSE);
			setState(241); match(T__4);
			setState(242); elseBody();
			setState(243); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBodyContext extends ParserRuleContext {
		public List<IntDeclarationContext> intDeclaration() {
			return getRuleContexts(IntDeclarationContext.class);
		}
		public IfElseConstructContext ifElseConstruct(int i) {
			return getRuleContext(IfElseConstructContext.class,i);
		}
		public List<WhileLoopConstructContext> whileLoopConstruct() {
			return getRuleContexts(WhileLoopConstructContext.class);
		}
		public List<BoolDeclarationContext> boolDeclaration() {
			return getRuleContexts(BoolDeclarationContext.class);
		}
		public IntDeclarationContext intDeclaration(int i) {
			return getRuleContext(IntDeclarationContext.class,i);
		}
		public List<IntAssignmentContext> intAssignment() {
			return getRuleContexts(IntAssignmentContext.class);
		}
		public List<PrintFuncContext> printFunc() {
			return getRuleContexts(PrintFuncContext.class);
		}
		public IntAssignmentContext intAssignment(int i) {
			return getRuleContext(IntAssignmentContext.class,i);
		}
		public List<IfElseConstructContext> ifElseConstruct() {
			return getRuleContexts(IfElseConstructContext.class);
		}
		public BoolAssignmentContext boolAssignment(int i) {
			return getRuleContext(BoolAssignmentContext.class,i);
		}
		public PrintFuncContext printFunc(int i) {
			return getRuleContext(PrintFuncContext.class,i);
		}
		public WhileLoopConstructContext whileLoopConstruct(int i) {
			return getRuleContext(WhileLoopConstructContext.class,i);
		}
		public List<BoolAssignmentContext> boolAssignment() {
			return getRuleContexts(BoolAssignmentContext.class);
		}
		public BoolDeclarationContext boolDeclaration(int i) {
			return getRuleContext(BoolDeclarationContext.class,i);
		}
		public ElseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitElseBody(this);
		}
	}

	public final ElseBodyContext elseBody() throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(252);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(245); intDeclaration();
					}
					break;
				case 2:
					{
					setState(246); boolDeclaration();
					}
					break;
				case 3:
					{
					setState(247); intAssignment();
					}
					break;
				case 4:
					{
					setState(248); boolAssignment();
					}
					break;
				case 5:
					{
					setState(249); whileLoopConstruct();
					}
					break;
				case 6:
					{
					setState(250); ifElseConstruct();
					}
					break;
				case 7:
					{
					setState(251); printFunc();
					}
					break;
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintFuncContext extends ParserRuleContext {
		public List<TerminalNode> BOOL() { return getTokens(SPRDParser.BOOL); }
		public List<TerminalNode> INTEGER() { return getTokens(SPRDParser.INTEGER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SPRDParser.IDENTIFIER, i);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(SPRDParser.INTEGER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SPRDParser.IDENTIFIER); }
		public TerminalNode BOOL(int i) {
			return getToken(SPRDParser.BOOL, i);
		}
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitPrintFunc(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(T__7);
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(259); match(T__3);
				setState(260);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanFuncContext extends ParserRuleContext {
		public ScanFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).enterScanFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPRDListener ) ((SPRDListener)listener).exitScanFunc(this);
		}
	}

	public final ScanFuncContext scanFunc() throws RecognitionException {
		ScanFuncContext _localctx = new ScanFuncContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scanFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return bFactor_sempred((BFactorContext)_localctx, predIndex);
		case 14: return factor_sempred((FactorContext)_localctx, predIndex);
		case 15: return intDeclaration_sempred((IntDeclarationContext)_localctx, predIndex);
		case 16: return boolDeclaration_sempred((BoolDeclarationContext)_localctx, predIndex);
		case 17: return intAssignment_sempred((IntAssignmentContext)_localctx, predIndex);
		case 18: return boolAssignment_sempred((BoolAssignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolAssignment_sempred(BoolAssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return variableDefined((((BoolAssignmentContext)_localctx).IDENTIFIER!=null?((BoolAssignmentContext)_localctx).IDENTIFIER.getText():null));
		case 7: return isBooleanVariable((((BoolAssignmentContext)_localctx).IDENTIFIER!=null?((BoolAssignmentContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}
	private boolean bFactor_sempred(BFactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return isBooleanVariable((((BFactorContext)_localctx).IDENTIFIER!=null?((BFactorContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}
	private boolean boolDeclaration_sempred(BoolDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return !variableDefined((((BoolDeclarationContext)_localctx).IDENTIFIER!=null?((BoolDeclarationContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return !isBooleanVariable((((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}
	private boolean intAssignment_sempred(IntAssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return variableDefined((((IntAssignmentContext)_localctx).IDENTIFIER!=null?((IntAssignmentContext)_localctx).IDENTIFIER.getText():null));
		case 5: return !isBooleanVariable((((IntAssignmentContext)_localctx).IDENTIFIER!=null?((IntAssignmentContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}
	private boolean intDeclaration_sempred(IntDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return !variableDefined((((IntDeclarationContext)_localctx).IDENTIFIER!=null?((IntDeclarationContext)_localctx).IDENTIFIER.getText():null));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\5\6W\n\6\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b"+
		"\3\b\3\t\3\t\7\te\n\t\f\t\16\th\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13t\n\13\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\3\r\3"+
		"\16\3\16\7\16\u0082\n\16\f\16\16\16\u0085\13\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0098\n\21\7\21\u009a\n\21\f\21\16\21\u009d\13\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00a7\n\22\7\22\u00a9\n\22\f\22\16\22\u00ac"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00b5\n\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\5\24\u00be\n\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u00d4\n\27\f\27\16\27\u00d7\13\27\3\30\3\30\5\30\u00db\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u00ee\n\33\f\33\16\33\u00f1\13\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00ff\n\35\f\35\16\35\u0102"+
		"\13\35\3\36\3\36\3\36\3\36\7\36\u0108\n\36\f\36\16\36\u010b\13\36\3\37"+
		"\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<\2\3\3\2\22\24\u011d\2>\3\2\2\2\4I\3\2\2\2\6L\3\2\2\2\bP\3\2"+
		"\2\2\nV\3\2\2\2\fX\3\2\2\2\16_\3\2\2\2\20b\3\2\2\2\22i\3\2\2\2\24s\3\2"+
		"\2\2\26u\3\2\2\2\30|\3\2\2\2\32\177\3\2\2\2\34\u0086\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u0092\3\2\2\2\"\u00a1\3\2\2\2$\u00b0\3\2\2\2&\u00b9\3\2\2\2"+
		"(\u00c2\3\2\2\2*\u00c7\3\2\2\2,\u00d5\3\2\2\2.\u00d8\3\2\2\2\60\u00dc"+
		"\3\2\2\2\62\u00e1\3\2\2\2\64\u00ef\3\2\2\2\66\u00f2\3\2\2\28\u0100\3\2"+
		"\2\2:\u0103\3\2\2\2<\u010c\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@H\5 \21\2AH\5"+
		"\"\22\2BH\5$\23\2CH\5&\24\2DH\5(\25\2EH\5.\30\2FH\5:\36\2G@\3\2\2\2GA"+
		"\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LM\5\26\f\2MN\7\31\2\2NO\5\26"+
		"\f\2O\7\3\2\2\2PQ\5\f\7\2QR\7\r\2\2RS\5\f\7\2S\t\3\2\2\2TW\5\6\4\2UW\5"+
		"\b\5\2VT\3\2\2\2VU\3\2\2\2W\13\3\2\2\2X\\\5\20\t\2Y[\5\16\b\2ZY\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^\\\3\2\2\2_`\7\33\2\2`a"+
		"\5\20\t\2a\17\3\2\2\2bf\5\24\13\2ce\5\22\n\2dc\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\7\32\2\2jk\5\24\13\2k\23\3\2\2"+
		"\2lm\7\24\2\2mt\6\13\2\3nt\7\22\2\2op\7\6\2\2pq\5\f\7\2qr\7\7\2\2rt\3"+
		"\2\2\2sl\3\2\2\2sn\3\2\2\2so\3\2\2\2t\25\3\2\2\2uy\5\32\16\2vx\5\30\r"+
		"\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3\2\2\2|}\7\30"+
		"\2\2}~\5\32\16\2~\31\3\2\2\2\177\u0083\5\36\20\2\u0080\u0082\5\34\17\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\33\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\27\2\2\u0087"+
		"\u0088\5\36\20\2\u0088\35\3\2\2\2\u0089\u008a\7\24\2\2\u008a\u0091\6\20"+
		"\3\3\u008b\u0091\7\23\2\2\u008c\u008d\7\6\2\2\u008d\u008e\5\26\f\2\u008e"+
		"\u008f\7\7\2\2\u008f\u0091\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008b\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093\7\4\2\2\u0093\u009b"+
		"\7\24\2\2\u0094\u0097\7\13\2\2\u0095\u0098\5\26\f\2\u0096\u0098\5<\37"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0094"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\6\21\4\3\u009f\u00a0\b"+
		"\21\1\2\u00a0!\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00aa\7\24\2\2\u00a3"+
		"\u00a6\7\13\2\2\u00a4\u00a7\5\f\7\2\u00a5\u00a7\5<\37\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\6\22\5\3\u00ae\u00af\b\22\1\2\u00af"+
		"#\3\2\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b4\7\13\2\2\u00b2\u00b5\5\26\f"+
		"\2\u00b3\u00b5\5<\37\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\6\23\6\3\u00b7\u00b8\6\23\7\3\u00b8%\3\2\2\2\u00b9"+
		"\u00ba\7\24\2\2\u00ba\u00bd\7\13\2\2\u00bb\u00be\5\f\7\2\u00bc\u00be\5"+
		"<\37\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\6\24\b\3\u00c0\u00c1\6\24\t\3\u00c1\'\3\2\2\2\u00c2\u00c3\5*\26"+
		"\2\u00c3\u00c4\7\b\2\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\7\n\2\2\u00c6)"+
		"\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\5\n\6\2"+
		"\u00ca\u00cb\7\7\2\2\u00cb+\3\2\2\2\u00cc\u00d4\5 \21\2\u00cd\u00d4\5"+
		"\"\22\2\u00ce\u00d4\5$\23\2\u00cf\u00d4\5&\24\2\u00d0\u00d4\5(\25\2\u00d1"+
		"\u00d4\5.\30\2\u00d2\u00d4\5:\36\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6-\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da"+
		"\5\60\31\2\u00d9\u00db\5\66\34\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db/\3\2\2\2\u00dc\u00dd\5\62\32\2\u00dd\u00de\7\b\2\2\u00de\u00df"+
		"\5\64\33\2\u00df\u00e0\7\n\2\2\u00e0\61\3\2\2\2\u00e1\u00e2\7\17\2\2\u00e2"+
		"\u00e3\7\6\2\2\u00e3\u00e4\5\n\6\2\u00e4\u00e5\7\7\2\2\u00e5\63\3\2\2"+
		"\2\u00e6\u00ee\5 \21\2\u00e7\u00ee\5\"\22\2\u00e8\u00ee\5$\23\2\u00e9"+
		"\u00ee\5&\24\2\u00ea\u00ee\5(\25\2\u00eb\u00ee\5.\30\2\u00ec\u00ee\5:"+
		"\36\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\65\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\7\b\2"+
		"\2\u00f4\u00f5\58\35\2\u00f5\u00f6\7\n\2\2\u00f6\67\3\2\2\2\u00f7\u00ff"+
		"\5 \21\2\u00f8\u00ff\5\"\22\2\u00f9\u00ff\5$\23\2\u00fa\u00ff\5&\24\2"+
		"\u00fb\u00ff\5(\25\2\u00fc\u00ff\5.\30\2\u00fd\u00ff\5:\36\2\u00fe\u00f7"+
		"\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u01019\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0104\7\5\2\2\u0104\u0109\t\2\2\2\u0105\u0106\7\t\2\2\u0106"+
		"\u0108\t\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a;\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d"+
		"\7\3\2\2\u010d=\3\2\2\2\31GIV\\fsy\u0083\u0090\u0097\u009b\u00a6\u00aa"+
		"\u00b4\u00bd\u00d3\u00d5\u00da\u00ed\u00ef\u00fe\u0100\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}