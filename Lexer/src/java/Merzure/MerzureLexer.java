// Generated from MerzureLexer.g4 by ANTLR 4.5
package Merzure;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MerzureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, CHAR_CONST=6, 
		REAL_CONST=7, COMPLEX_CONST=8, STR_CONST=9, LPAREN=10, RPAREN=11, COLON=12, 
		ATSYM=13, SEMICOLON=14, COMMA=15, PLUS=16, MINUS=17, STAR=18, SLASH=19, 
		TILDE=20, LT=21, GT=22, EQUALS=23, LBRACE=24, RBRACE=25, DOT=26, LEQ=27, 
		GEQ=28, NEQ=29, ASSIGN=30, ELSE=31, IF=32, WHILE=33, CHAR=34, CONST=35, 
		AUTO=36, UNSIGNED=37, BREAK=38, CONTINUE=39, COMPLEX=40, BOOL=41, FOR=42, 
		REAL=43, INT=44, LONG=45, RETURN=46, END=47, VOID=48, INCLUDE=49, FUNCTION=50, 
		FALSE=51, TRUE=52, WHITESPACE=53, SPACES=54, SIMPLE_COMMENT=55, EOF_STRING=56, 
		INVALID_ESCAPE=57, INVALID_CHARS=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CHAR", "CONST", "AUTO", "UNSIGNED", "BREAK", "CONTINUE", "COMPLEX", "ELSE", 
		"BOOL", "FOR", "IF", "REAL", "INT", "LONG", "FALSE", "WHILE", "RETURN", 
		"INCLUDE", "END", "VOID", "FUNCTION", "TRUE", "CHAR_CONST", "INT_CONST", 
		"REAL_CONST", "COMPLEX_CONST", "BOOL_CONST", "OBJECTID", "LPAREN", "RPAREN", 
		"COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", 
		"TILDE", "LT", "EQUALS", "GT", "LEQ", "GEQ", "NEQ", "LBRACE", "RBRACE", 
		"DOT", "ASSIGN", "WHITESPACE", "SPACES", "STR_CONST", "SIMPLE_COMMENT", 
		"EOF_STRING", "INVALID_ESCAPE", "INVALID_CHARS", "DIGIT", "HEX", "EXP", 
		"LOWERCASE", "UPPERCASE", "LETTER", "ESCAPE_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
		"':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", 
		"'>'", "'=='", "'{'", "'}'", "'.'", "'<='", "'>='", "'!='", "'='", "'else'", 
		"'if'", "'while'", "'char'", "'const'", "'auto'", "'unsigned'", "'break'", 
		"'continue'", "'complex'", "'bool'", "'for'", "'real'", "'int'", "'long'", 
		"'return'", "'end'", "'void'", "'include'", "'function'", "'false'", "'true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "CHAR_CONST", 
		"REAL_CONST", "COMPLEX_CONST", "STR_CONST", "LPAREN", "RPAREN", "COLON", 
		"ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", 
		"LT", "GT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LEQ", "GEQ", "NEQ", 
		"ASSIGN", "ELSE", "IF", "WHILE", "CHAR", "CONST", "AUTO", "UNSIGNED", 
		"BREAK", "CONTINUE", "COMPLEX", "BOOL", "FOR", "REAL", "INT", "LONG", 
		"RETURN", "END", "VOID", "INCLUDE", "FUNCTION", "FALSE", "TRUE", "WHITESPACE", 
		"SPACES", "SIMPLE_COMMENT", "EOF_STRING", "INVALID_ESCAPE", "INVALID_CHARS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



		/*
			YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
		*/

		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
		* DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}

		public void processString(int i) {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			String temp = text;
			String result = "";

			//write your code to test strings here
			if( i == 1)
			{
				text = text.substring(1,text.length()-1);
				if(text.length() > 1024)
				{
					reportError("String constant too long");
					return;
				}
				if(text.indexOf('\0') != -1)
				{
					reportError("String contains null character");
					return;
				}
				if(text.indexOf('\n') != -1)
				{
					int idx = text.indexOf('\n');
					if(text.charAt(idx-1) != '\\')
					{
						reportError("Unterminated string constant");
						return;
					}
				}
			}
			

			switch(i)
			{
				case 1 : int index = 0;
						 while(index < text.length())
						 {
						 	if(text.charAt(index) == '\\')
						 	{
						 		char nextchar = text.charAt(index+1);
						 		switch(nextchar)
						 		{
						 			case '0' : result = result.concat("0");
						 					   break;
						 			case 'n' : result = result = result.concat("\n");
						 					   break;		
						 			case 'f' : result = result = result.concat("\f");
						 					   break;
						 			case 'r' : result = result = result.concat("\r");
						 					   break;
						 			case 't' : result = result = result.concat("\t");
						 					   break;
						 			case 'b' : result = result = result.concat("\b");
						 					   break;	
						 			case '"' : reportError("Invalid Escape Character");
						 					   break;		   								
						 			default  : result = result = result.concat(String.valueOf(text.charAt(index+1)));
						 					   break;
						 		}
						 		index = index + 2;	
						 		continue;			
						 	}
						 	else
						 	{
						 			result = result.concat(String.valueOf(text.charAt(index)));
						 			index = index + 1; 
						 	}
						 }
					    break;
				case 2: reportError(temp);
						break;
			}

			if ( i == 1)
			{
				setText(result);
				setType(STR_CONST);
			}
			return;
		}


	public MerzureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MerzureLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 51:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			EOF_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			INVALID_ESCAPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			INVALID_CHARS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			processString(1);
			break;
		}
	}
	private void EOF_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("EOF in String");
			break;
		}
	}
	private void INVALID_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			reportError("Invalid Escape Character");
			break;
		}
	}
	private void INVALID_CHARS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			processString(2);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u01e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0106\n\30"+
		"\3\30\3\30\3\31\3\31\3\31\6\31\u010d\n\31\r\31\16\31\u010e\3\31\3\31\6"+
		"\31\u0113\n\31\r\31\16\31\u0114\3\31\6\31\u0118\n\31\r\31\16\31\u0119"+
		"\5\31\u011c\n\31\3\32\7\32\u011f\n\32\f\32\16\32\u0122\13\32\3\32\3\32"+
		"\6\32\u0126\n\32\r\32\16\32\u0127\3\32\5\32\u012b\n\32\3\32\6\32\u012e"+
		"\n\32\r\32\16\32\u012f\3\32\3\32\7\32\u0134\n\32\f\32\16\32\u0137\13\32"+
		"\3\32\5\32\u013a\n\32\3\32\6\32\u013d\n\32\r\32\16\32\u013e\3\32\3\32"+
		"\5\32\u0143\n\32\3\33\3\33\3\33\3\33\5\33\u0149\n\33\3\33\3\33\3\33\3"+
		"\33\5\33\u014f\n\33\3\33\3\33\3\33\3\33\5\33\u0155\n\33\3\34\3\34\5\34"+
		"\u0159\n\34\3\35\3\35\3\35\7\35\u015e\n\35\f\35\16\35\u0161\13\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\6\63\u0192\n\63\r\63\16\63\u0193\3\63\3\63\3\64"+
		"\7\64\u0199\n\64\f\64\16\64\u019c\13\64\3\64\3\64\3\65\3\65\3\65\7\65"+
		"\u01a3\n\65\f\65\16\65\u01a6\13\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\7\66\u01af\n\66\f\66\16\66\u01b2\13\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\7\67\u01ba\n\67\f\67\16\67\u01bd\13\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3:\3;\3;\3<\3<\5<\u01d7"+
		"\n<\3<\6<\u01da\n<\r<\16<\u01db\3=\3=\3>\3>\3?\3?\3@\3@\3@\3\u01b0\2A"+
		"\3$\5%\7&\t\'\13(\r)\17*\21!\23+\25,\27\"\31-\33.\35/\37\65!##\60%\63"+
		"\'\61)\62+\64-\66/\b\61\7\63\t\65\n\67\69\5;\f=\r?\16A\17C\20E\21G\22"+
		"I\23K\24M\25O\26Q\27S\31U\30W\35Y\36[\37]\32_\33a\34c e\67g8i\13k9m:o"+
		";q<s\2u\2w\2y\2{\2}\2\177\2\3\2\20\3\2))\3\2\62\62\4\2ZZzz\3\2\60\60\6"+
		"\2\n\f\17\17^^xx\4\2$$^^\3\2$$\3\2\62;\5\2\62;CHch\4\2GGgg\4\2--//\3\2"+
		"c|\3\2C\\\3\2C|\u01fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3\u0081\3\2\2\2\5\u0086"+
		"\3\2\2\2\7\u008c\3\2\2\2\t\u0091\3\2\2\2\13\u009a\3\2\2\2\r\u00a0\3\2"+
		"\2\2\17\u00a9\3\2\2\2\21\u00b1\3\2\2\2\23\u00b6\3\2\2\2\25\u00bb\3\2\2"+
		"\2\27\u00bf\3\2\2\2\31\u00c2\3\2\2\2\33\u00c7\3\2\2\2\35\u00cb\3\2\2\2"+
		"\37\u00d0\3\2\2\2!\u00d6\3\2\2\2#\u00dc\3\2\2\2%\u00e3\3\2\2\2\'\u00eb"+
		"\3\2\2\2)\u00ef\3\2\2\2+\u00f4\3\2\2\2-\u00fd\3\2\2\2/\u0102\3\2\2\2\61"+
		"\u011b\3\2\2\2\63\u0142\3\2\2\2\65\u0154\3\2\2\2\67\u0158\3\2\2\29\u015a"+
		"\3\2\2\2;\u0162\3\2\2\2=\u0164\3\2\2\2?\u0166\3\2\2\2A\u0168\3\2\2\2C"+
		"\u016a\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u0170\3\2\2\2K\u0172\3\2"+
		"\2\2M\u0174\3\2\2\2O\u0176\3\2\2\2Q\u0178\3\2\2\2S\u017a\3\2\2\2U\u017d"+
		"\3\2\2\2W\u017f\3\2\2\2Y\u0182\3\2\2\2[\u0185\3\2\2\2]\u0188\3\2\2\2_"+
		"\u018a\3\2\2\2a\u018c\3\2\2\2c\u018e\3\2\2\2e\u0191\3\2\2\2g\u019a\3\2"+
		"\2\2i\u019f\3\2\2\2k\u01aa\3\2\2\2m\u01b7\3\2\2\2o\u01c8\3\2\2\2q\u01cd"+
		"\3\2\2\2s\u01d0\3\2\2\2u\u01d2\3\2\2\2w\u01d4\3\2\2\2y\u01dd\3\2\2\2{"+
		"\u01df\3\2\2\2}\u01e1\3\2\2\2\177\u01e3\3\2\2\2\u0081\u0082\7e\2\2\u0082"+
		"\u0083\7j\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085\4\3\2\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008b\7v\2\2\u008b\6\3\2\2\2\u008c\u008d\7c\2\2\u008d\u008e\7w"+
		"\2\2\u008e\u008f\7v\2\2\u008f\u0090\7q\2\2\u0090\b\3\2\2\2\u0091\u0092"+
		"\7w\2\2\u0092\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7i\2\2\u0096\u0097\7p\2\2\u0097\u0098\7g\2\2\u0098\u0099\7f\2\2"+
		"\u0099\n\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g"+
		"\2\2\u009d\u009e\7c\2\2\u009e\u009f\7m\2\2\u009f\f\3\2\2\2\u00a0\u00a1"+
		"\7e\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\16\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7"+
		"o\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7z\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\22\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\24\3\2\2\2\u00bb\u00bc"+
		"\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be\26\3\2\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7h\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\32\3\2\2\2\u00c7\u00c8"+
		"\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7n\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf"+
		"\36\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7g\2\2"+
		"\u00db\"\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v"+
		"\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7p\2\2\u00e2$\3"+
		"\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7e\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea&\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2"+
		"\2\u00ee(\3\2\2\2\u00ef\u00f0\7x\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7"+
		"k\2\2\u00f2\u00f3\7f\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc,\3\2\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7g\2\2"+
		"\u0101.\3\2\2\2\u0102\u0105\t\2\2\2\u0103\u0106\5}?\2\u0104\u0106\5\177"+
		"@\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\t\2\2\2\u0108\60\3\2\2\2\u0109\u010a\t\3\2\2\u010a\u010c\t\4\2"+
		"\2\u010b\u010d\5u;\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u011c\3\2\2\2\u0110\u0112\t\3\2\2\u0111"+
		"\u0113\5s:\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u011c\3\2\2\2\u0116\u0118\5s:\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0109\3\2\2\2\u011b\u0110\3\2\2\2\u011b\u0117\3\2"+
		"\2\2\u011c\62\3\2\2\2\u011d\u011f\5s:\2\u011e\u011d\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\t\5\2\2\u0124\u0126\5s:\2\u0125\u0124\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a"+
		"\3\2\2\2\u0129\u012b\5w<\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0143\3\2\2\2\u012c\u012e\5s:\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2"+
		"\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0135"+
		"\t\5\2\2\u0132\u0134\5s:\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u013a\5w<\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0143"+
		"\3\2\2\2\u013b\u013d\5s:\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\5w"+
		"<\2\u0141\u0143\3\2\2\2\u0142\u0120\3\2\2\2\u0142\u012d\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0143\64\3\2\2\2\u0144\u0145\7*\2\2\u0145\u0146\5\63\32"+
		"\2\u0146\u0148\7.\2\2\u0147\u0149\5\63\32\2\u0148\u0147\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7+\2\2\u014b\u0155\3\2"+
		"\2\2\u014c\u014e\7*\2\2\u014d\u014f\5\63\32\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7.\2\2\u0151\u0152\5\63"+
		"\32\2\u0152\u0153\7+\2\2\u0153\u0155\3\2\2\2\u0154\u0144\3\2\2\2\u0154"+
		"\u014c\3\2\2\2\u0155\66\3\2\2\2\u0156\u0159\5-\27\2\u0157\u0159\5\37\20"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u01598\3\2\2\2\u015a\u015f"+
		"\5}?\2\u015b\u015e\5}?\2\u015c\u015e\5s:\2\u015d\u015b\3\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		":\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7*\2\2\u0163<\3\2\2\2\u0164"+
		"\u0165\7+\2\2\u0165>\3\2\2\2\u0166\u0167\7<\2\2\u0167@\3\2\2\2\u0168\u0169"+
		"\7B\2\2\u0169B\3\2\2\2\u016a\u016b\7=\2\2\u016bD\3\2\2\2\u016c\u016d\7"+
		".\2\2\u016dF\3\2\2\2\u016e\u016f\7-\2\2\u016fH\3\2\2\2\u0170\u0171\7/"+
		"\2\2\u0171J\3\2\2\2\u0172\u0173\7,\2\2\u0173L\3\2\2\2\u0174\u0175\7\61"+
		"\2\2\u0175N\3\2\2\2\u0176\u0177\7\u0080\2\2\u0177P\3\2\2\2\u0178\u0179"+
		"\7>\2\2\u0179R\3\2\2\2\u017a\u017b\7?\2\2\u017b\u017c\7?\2\2\u017cT\3"+
		"\2\2\2\u017d\u017e\7@\2\2\u017eV\3\2\2\2\u017f\u0180\7>\2\2\u0180\u0181"+
		"\7?\2\2\u0181X\3\2\2\2\u0182\u0183\7@\2\2\u0183\u0184\7?\2\2\u0184Z\3"+
		"\2\2\2\u0185\u0186\7#\2\2\u0186\u0187\7?\2\2\u0187\\\3\2\2\2\u0188\u0189"+
		"\7}\2\2\u0189^\3\2\2\2\u018a\u018b\7\177\2\2\u018b`\3\2\2\2\u018c\u018d"+
		"\7\60\2\2\u018db\3\2\2\2\u018e\u018f\7?\2\2\u018fd\3\2\2\2\u0190\u0192"+
		"\t\6\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\b\63\2\2\u0196f\3\2\2\2"+
		"\u0197\u0199\7\"\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\b\64\2\2\u019eh\3\2\2\2\u019f\u01a4\7$\2\2\u01a0\u01a3\n\7\2\2"+
		"\u01a1\u01a3\5\177@\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\7$\2\2\u01a8\u01a9\b\65\3\2\u01a9j\3\2\2\2"+
		"\u01aa\u01ab\7%\2\2\u01ab\u01ac\7%\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01af"+
		"\13\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01b1\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4"+
		"\5e\63\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b\66\2\2\u01b6l\3\2\2\2\u01b7"+
		"\u01bb\7$\2\2\u01b8\u01ba\n\b\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0\7>\2\2\u01c0\u01c1\7G\2"+
		"\2\u01c1\u01c2\7Q\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c4\7@\2\2\u01c4\u01c5"+
		"\7@\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b\67\4\2\u01c7n\3\2\2\2\u01c8"+
		"\u01c9\7$\2\2\u01c9\u01ca\7^\2\2\u01ca\u01cb\7$\2\2\u01cb\u01cc\b8\5\2"+
		"\u01ccp\3\2\2\2\u01cd\u01ce\13\2\2\2\u01ce\u01cf\b9\6\2\u01cfr\3\2\2\2"+
		"\u01d0\u01d1\t\t\2\2\u01d1t\3\2\2\2\u01d2\u01d3\t\n\2\2\u01d3v\3\2\2\2"+
		"\u01d4\u01d6\t\13\2\2\u01d5\u01d7\t\f\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5s:\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcx\3\2\2\2"+
		"\u01dd\u01de\t\r\2\2\u01dez\3\2\2\2\u01df\u01e0\t\16\2\2\u01e0|\3\2\2"+
		"\2\u01e1\u01e2\t\17\2\2\u01e2~\3\2\2\2\u01e3\u01e4\7^\2\2\u01e4\u01e5"+
		"\13\2\2\2\u01e5\u0080\3\2\2\2\36\2\u0105\u010e\u0114\u0119\u011b\u0120"+
		"\u0127\u012a\u012f\u0135\u0139\u013e\u0142\u0148\u014e\u0154\u0158\u015d"+
		"\u015f\u0193\u019a\u01a2\u01a4\u01b0\u01bb\u01d6\u01db\7\b\2\2\3\65\2"+
		"\3\67\3\38\4\39\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}