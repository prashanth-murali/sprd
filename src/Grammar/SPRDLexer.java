// Generated from SPRD.g4 by ANTLR 4.4
package Grammar;
 
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPRDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, BOOLEANCOMP=11, IS=12, IF=13, ELSE=14, WHILE=15, BOOL=16, INTEGER=17, 
		IDENTIFIER=18, WHITESPACE=19, COMMENT=20, PRIORITYONEOP=21, PRIORITYTWOOP=22, 
		INTEGERCOMPARISION=23, AND=24, OR=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "BOOLEANCOMP", "IS", "IF", "ELSE", "WHILE", "BOOL", "INTEGER", 
		"IDENTIFIER", "WHITESPACE", "COMMENT", "PRIORITYONEOP", "PRIORITYTWOOP", 
		"INTEGERCOMPARISION", "AND", "OR"
	};


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


	public SPRDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SPRD.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21q\n\21\3\22\6\22t\n\22\r\22\16\22u\3\23\3\23\7\23z\n\23\f\23\16\23"+
		"}\13\23\3\24\6\24\u0080\n\24\r\24\16\24\u0081\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u008a\n\25\f\25\16\25\u008d\13\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u009e\n\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\3\2\n\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\5\2\'\',,\61\61\4\2--//\4\2>>@@\u00ad\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3"+
		"\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27T\3\2\2\2\31"+
		"V\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37a\3\2\2\2!p\3\2\2\2#s\3\2\2\2%w\3"+
		"\2\2\2\'\177\3\2\2\2)\u0085\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u009d"+
		"\3\2\2\2\61\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\66\7I\2\2\66\67\7g\2\2\67"+
		"8\7v\2\28\4\3\2\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<\6\3\2\2\2=>\7r\2\2>?\7"+
		"t\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\b\3\2\2\2CD\7*\2\2D\n\3\2\2\2EF\7+\2"+
		"\2F\f\3\2\2\2GH\7}\2\2H\16\3\2\2\2IJ\7.\2\2J\20\3\2\2\2KL\7\177\2\2L\22"+
		"\3\2\2\2MN\7?\2\2N\24\3\2\2\2OP\7d\2\2PQ\7q\2\2QR\7q\2\2RS\7n\2\2S\26"+
		"\3\2\2\2TU\5\31\r\2U\30\3\2\2\2VW\7k\2\2WX\7u\2\2X\32\3\2\2\2YZ\7k\2\2"+
		"Z[\7h\2\2[\34\3\2\2\2\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\36\3\2\2\2"+
		"ab\7y\2\2bc\7j\2\2cd\7k\2\2de\7n\2\2ef\7g\2\2f \3\2\2\2gh\7V\2\2hi\7t"+
		"\2\2ij\7w\2\2jq\7g\2\2kl\7H\2\2lm\7c\2\2mn\7n\2\2no\7u\2\2oq\7g\2\2pg"+
		"\3\2\2\2pk\3\2\2\2q\"\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v$\3\2\2\2w{\t\3\2\2xz\t\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|&\3\2\2\2}{\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\b\24\2\2\u0084(\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2"+
		"\2\u0087\u008b\3\2\2\2\u0088\u008a\n\6\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\b\25\2\2\u008f*\3\2\2\2\u0090\u0091\t\7\2\2"+
		"\u0091,\3\2\2\2\u0092\u0093\t\b\2\2\u0093.\3\2\2\2\u0094\u009e\t\t\2\2"+
		"\u0095\u0096\7?\2\2\u0096\u009e\7?\2\2\u0097\u0098\7>\2\2\u0098\u009e"+
		"\7?\2\2\u0099\u009a\7@\2\2\u009a\u009e\7?\2\2\u009b\u009c\7#\2\2\u009c"+
		"\u009e\7?\2\2\u009d\u0094\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2"+
		"\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\60\3\2\2\2\u009f\u00a0"+
		"\7(\2\2\u00a0\u00a1\7(\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a4"+
		"\7~\2\2\u00a4\64\3\2\2\2\t\2pu{\u0081\u008b\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}