// Generated from /home/akashdeep/Compilers-II_Project/Lexer/src/grammar/MerzureLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MerzureLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, CHAR=2, CONST=3, AUTO=4, UNSIGNED=5, BREAK=6, CONTINUE=7, COMPLEX=8, 
		ELSE=9, BOOL=10, FOR=11, IF=12, ELIF=13, REAL=14, INT=15, LONG=16, RETURN=17, 
		INCLUDE=18, END=19, VOID=20, FUNCTION=21, STATIC=22, AND=23, OR=24, NOT=25, 
		CHAR_CONST=26, INT_CONST=27, REAL_CONST=28, COMPLEX_CONST=29, BOOL_CONST=30, 
		STR_CONST=31, OBJECTID=32, LPAREN=33, RPAREN=34, COLON=35, ATSYM=36, SEMICOLON=37, 
		COMMA=38, PLUS=39, MINUS=40, STAR=41, SLASH=42, TILDE=43, LT=44, GT=45, 
		EQUALS=46, LEQ=47, GEQ=48, NEQ=49, LBRACE=50, RBRACE=51, DOT=52, ASSIGN=53, 
		POW=54, MOD=55, WHITESPACE=56, SPACES=57, SIMPLE_COMMENT=58, ERROR=59, 
		EOF_STRING=60, INVALID_ESCAPE=61, INVALID_CHARS=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "CHAR", "CONST", "AUTO", "UNSIGNED", "BREAK", "CONTINUE", "COMPLEX", 
			"ELSE", "BOOL", "FOR", "IF", "ELIF", "REAL", "INT", "LONG", "RETURN", 
			"INCLUDE", "END", "VOID", "FUNCTION", "STATIC", "AND", "OR", "NOT", "CHAR_CONST", 
			"INT_CONST", "REAL_CONST", "COMPLEX_CONST", "BOOL_CONST", "STR_CONST", 
			"OBJECTID", "LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "GT", "EQUALS", "LEQ", 
			"GEQ", "NEQ", "LBRACE", "RBRACE", "DOT", "ASSIGN", "POW", "MOD", "WHITESPACE", 
			"SPACES", "SIMPLE_COMMENT", "ERROR", "EOF_STRING", "INVALID_ESCAPE", 
			"INVALID_CHARS", "DIGIT", "HEX", "EXP", "LOWERCASE", "UPPERCASE", "LETTER", 
			"ESCAPE_CHAR", "LABEL", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'char'", "'const'", "'auto'", "'unsigned'", "'break'", "'continue'", 
			"'complex'", "'else'", "'bool'", "'for'", "'if'", "'elif'", "'real'", 
			"'int'", "'long'", "'return'", "'include'", "'end'", "'void'", "'function'", 
			"'static'", "'and'", "'or'", "'not'", null, null, null, null, null, null, 
			null, "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", 
			"'/'", "'~'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'{'", "'}'", 
			"'.'", "'='", "'^'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "CHAR", "CONST", "AUTO", "UNSIGNED", "BREAK", "CONTINUE", 
			"COMPLEX", "ELSE", "BOOL", "FOR", "IF", "ELIF", "REAL", "INT", "LONG", 
			"RETURN", "INCLUDE", "END", "VOID", "FUNCTION", "STATIC", "AND", "OR", 
			"NOT", "CHAR_CONST", "INT_CONST", "REAL_CONST", "COMPLEX_CONST", "BOOL_CONST", 
			"STR_CONST", "OBJECTID", "LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", 
			"COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "GT", "EQUALS", 
			"LEQ", "GEQ", "NEQ", "LBRACE", "RBRACE", "DOT", "ASSIGN", "POW", "MOD", 
			"WHITESPACE", "SPACES", "SIMPLE_COMMENT", "ERROR", "EOF_STRING", "INVALID_ESCAPE", 
			"INVALID_CHARS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MerzureLexerLexer(CharStream input) {
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 30:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			EOF_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			INVALID_ESCAPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\6\2\u0095\n\2\r\2\16\2\u0096\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0123\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\6\34\u012a\n\34\r\34\16\34\u012b\3\34\3\34\6\34\u0130\n\34"+
		"\r\34\16\34\u0131\3\34\6\34\u0135\n\34\r\34\16\34\u0136\5\34\u0139\n\34"+
		"\3\35\7\35\u013c\n\35\f\35\16\35\u013f\13\35\3\35\3\35\6\35\u0143\n\35"+
		"\r\35\16\35\u0144\3\35\5\35\u0148\n\35\3\35\6\35\u014b\n\35\r\35\16\35"+
		"\u014c\3\35\3\35\7\35\u0151\n\35\f\35\16\35\u0154\13\35\3\35\5\35\u0157"+
		"\n\35\3\35\6\35\u015a\n\35\r\35\16\35\u015b\3\35\3\35\5\35\u0160\n\35"+
		"\3\36\3\36\3\36\3\36\5\36\u0166\n\36\3\36\3\36\3\36\3\36\5\36\u016c\n"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0172\n\36\3\37\3\37\5\37\u0176\n\37\3 \3"+
		" \3 \7 \u017b\n \f \16 \u017e\13 \3 \3 \3 \3!\3!\3!\7!\u0186\n!\f!\16"+
		"!\u0189\13!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\6"+
		"9\u01be\n9\r9\169\u01bf\39\39\3:\6:\u01c5\n:\r:\16:\u01c6\3:\3:\3;\3;"+
		"\3;\3;\7;\u01cf\n;\f;\16;\u01d2\13;\3;\3;\3;\3;\3<\3<\3<\5<\u01db\n<\3"+
		"=\3=\7=\u01df\n=\f=\16=\u01e2\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3B\3B\5B\u01fc\nB\3B\6B\u01ff\nB\rB\16"+
		"B\u0200\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3I\3\u01d0\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\3\2\21\4\2\f\f\17\17\3\2))"+
		"\3\2\62\62\4\2ZZzz\3\2\60\60\4\2$$^^\4\2\n\f\17\17\3\2$$\3\2\62;\5\2\62"+
		";CHch\4\2GGgg\4\2--//\3\2c|\3\2C\\\5\2C\\aac|\2\u022e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\3\u0094\3\2\2\2\5\u0098\3\2\2\2\7\u009d\3\2\2\2\t\u00a3\3\2\2\2\13"+
		"\u00a8\3\2\2\2\r\u00b1\3\2\2\2\17\u00b7\3\2\2\2\21\u00c0\3\2\2\2\23\u00c8"+
		"\3\2\2\2\25\u00cd\3\2\2\2\27\u00d2\3\2\2\2\31\u00d6\3\2\2\2\33\u00d9\3"+
		"\2\2\2\35\u00de\3\2\2\2\37\u00e3\3\2\2\2!\u00e7\3\2\2\2#\u00ec\3\2\2\2"+
		"%\u00f3\3\2\2\2\'\u00fb\3\2\2\2)\u00ff\3\2\2\2+\u0104\3\2\2\2-\u010d\3"+
		"\2\2\2/\u0114\3\2\2\2\61\u0118\3\2\2\2\63\u011b\3\2\2\2\65\u011f\3\2\2"+
		"\2\67\u0138\3\2\2\29\u015f\3\2\2\2;\u0171\3\2\2\2=\u0175\3\2\2\2?\u0177"+
		"\3\2\2\2A\u0182\3\2\2\2C\u018a\3\2\2\2E\u018c\3\2\2\2G\u018e\3\2\2\2I"+
		"\u0190\3\2\2\2K\u0192\3\2\2\2M\u0194\3\2\2\2O\u0196\3\2\2\2Q\u0198\3\2"+
		"\2\2S\u019a\3\2\2\2U\u019c\3\2\2\2W\u019e\3\2\2\2Y\u01a0\3\2\2\2[\u01a2"+
		"\3\2\2\2]\u01a4\3\2\2\2_\u01a7\3\2\2\2a\u01aa\3\2\2\2c\u01ad\3\2\2\2e"+
		"\u01b0\3\2\2\2g\u01b2\3\2\2\2i\u01b4\3\2\2\2k\u01b6\3\2\2\2m\u01b8\3\2"+
		"\2\2o\u01ba\3\2\2\2q\u01bd\3\2\2\2s\u01c4\3\2\2\2u\u01ca\3\2\2\2w\u01da"+
		"\3\2\2\2y\u01dc\3\2\2\2{\u01ed\3\2\2\2}\u01f2\3\2\2\2\177\u01f5\3\2\2"+
		"\2\u0081\u01f7\3\2\2\2\u0083\u01f9\3\2\2\2\u0085\u0202\3\2\2\2\u0087\u0204"+
		"\3\2\2\2\u0089\u0206\3\2\2\2\u008b\u0208\3\2\2\2\u008d\u020b\3\2\2\2\u008f"+
		"\u020e\3\2\2\2\u0091\u0213\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\4\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7j\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7t\2\2\u009c\6\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\b\3\2\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\n\3\2\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7u"+
		"\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7f\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7m\2\2\u00b6"+
		"\16\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7w\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7"+
		"q\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7z\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\24\3\2\2\2\u00cd\u00ce"+
		"\7d\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\26\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\30\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\32\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2"+
		"\u00dd\34\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7"+
		"c\2\2\u00e1\u00e2\7n\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7v\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7i\2\2\u00eb\"\3\2\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7p\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7w\2\2"+
		"\u00f8\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa&\3\2\2\2\u00fb\u00fc\7g\2"+
		"\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe(\3\2\2\2\u00ff\u0100\7"+
		"x\2\2\u0100\u0101\7q\2\2\u0101\u0102\7k\2\2\u0102\u0103\7f\2\2\u0103*"+
		"\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106\7w\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\7e\2\2\u0108\u0109\7v\2\2\u0109\u010a\7k\2\2\u010a\u010b\7q\2\2"+
		"\u010b\u010c\7p\2\2\u010c,\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2"+
		"\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\u0112\7k\2\2\u0112\u0113"+
		"\7e\2\2\u0113.\3\2\2\2\u0114\u0115\7c\2\2\u0115\u0116\7p\2\2\u0116\u0117"+
		"\7f\2\2\u0117\60\3\2\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2\u011a\62"+
		"\3\2\2\2\u011b\u011c\7p\2\2\u011c\u011d\7q\2\2\u011d\u011e\7v\2\2\u011e"+
		"\64\3\2\2\2\u011f\u0122\t\3\2\2\u0120\u0123\5\u0089E\2\u0121\u0123\5\u008b"+
		"F\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\t\3\2\2\u0125\66\3\2\2\2\u0126\u0127\t\4\2\2\u0127\u0129\t\5\2"+
		"\2\u0128\u012a\5\u0081A\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0139\3\2\2\2\u012d\u012f\t\4"+
		"\2\2\u012e\u0130\5\177@\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0139\3\2\2\2\u0133\u0135\5\177"+
		"@\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0126\3\2\2\2\u0138\u012d\3\2"+
		"\2\2\u0138\u0134\3\2\2\2\u01398\3\2\2\2\u013a\u013c\5\177@\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\t\6\2\2\u0141\u0143\5\177"+
		"@\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\5\u0083B\2\u0147\u0146"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0160\3\2\2\2\u0149\u014b\5\177@\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\t\6\2\2\u014f\u0151\5\177@\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5\u0083B"+
		"\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0160\3\2\2\2\u0158\u015a"+
		"\5\177@\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\u0083B\2\u015e"+
		"\u0160\3\2\2\2\u015f\u013d\3\2\2\2\u015f\u014a\3\2\2\2\u015f\u0159\3\2"+
		"\2\2\u0160:\3\2\2\2\u0161\u0162\7*\2\2\u0162\u0163\59\35\2\u0163\u0165"+
		"\7.\2\2\u0164\u0166\59\35\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\7+\2\2\u0168\u0172\3\2\2\2\u0169\u016b\7*\2"+
		"\2\u016a\u016c\59\35\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\7.\2\2\u016e\u016f\59\35\2\u016f\u0170\7+\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0161\3\2\2\2\u0171\u0169\3\2\2\2\u0172<\3\2\2\2"+
		"\u0173\u0176\5\u008fH\2\u0174\u0176\5\u0091I\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176>\3\2\2\2\u0177\u017c\7$\2\2\u0178\u017b\n\7\2\2\u0179"+
		"\u017b\5\u008bF\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\7$\2\2\u0180\u0181\b \2\2\u0181@\3\2\2\2\u0182"+
		"\u0187\5\u0089E\2\u0183\u0186\5\u0089E\2\u0184\u0186\5\177@\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188B\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7*\2\2\u018b"+
		"D\3\2\2\2\u018c\u018d\7+\2\2\u018dF\3\2\2\2\u018e\u018f\7<\2\2\u018fH"+
		"\3\2\2\2\u0190\u0191\7B\2\2\u0191J\3\2\2\2\u0192\u0193\7=\2\2\u0193L\3"+
		"\2\2\2\u0194\u0195\7.\2\2\u0195N\3\2\2\2\u0196\u0197\7-\2\2\u0197P\3\2"+
		"\2\2\u0198\u0199\7/\2\2\u0199R\3\2\2\2\u019a\u019b\7,\2\2\u019bT\3\2\2"+
		"\2\u019c\u019d\7\61\2\2\u019dV\3\2\2\2\u019e\u019f\7\u0080\2\2\u019fX"+
		"\3\2\2\2\u01a0\u01a1\7>\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3\\"+
		"\3\2\2\2\u01a4\u01a5\7?\2\2\u01a5\u01a6\7?\2\2\u01a6^\3\2\2\2\u01a7\u01a8"+
		"\7>\2\2\u01a8\u01a9\7?\2\2\u01a9`\3\2\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac"+
		"\7?\2\2\u01acb\3\2\2\2\u01ad\u01ae\7#\2\2\u01ae\u01af\7?\2\2\u01afd\3"+
		"\2\2\2\u01b0\u01b1\7}\2\2\u01b1f\3\2\2\2\u01b2\u01b3\7\177\2\2\u01b3h"+
		"\3\2\2\2\u01b4\u01b5\7\60\2\2\u01b5j\3\2\2\2\u01b6\u01b7\7?\2\2\u01b7"+
		"l\3\2\2\2\u01b8\u01b9\7`\2\2\u01b9n\3\2\2\2\u01ba\u01bb\7\'\2\2\u01bb"+
		"p\3\2\2\2\u01bc\u01be\t\b\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\b9\3\2\u01c2r\3\2\2\2\u01c3\u01c5\7\"\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\b:\3\2\u01c9t\3\2\2\2\u01ca\u01cb\7%\2\2\u01cb\u01cc\7%\2\2\u01cc"+
		"\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d4\5q9\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b;\3"+
		"\2\u01d6v\3\2\2\2\u01d7\u01db\5y=\2\u01d8\u01db\5{>\2\u01d9\u01db\5}?"+
		"\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbx"+
		"\3\2\2\2\u01dc\u01e0\7$\2\2\u01dd\u01df\n\t\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7>\2\2\u01e4\u01e5\7>\2\2\u01e5\u01e6"+
		"\7G\2\2\u01e6\u01e7\7Q\2\2\u01e7\u01e8\7H\2\2\u01e8\u01e9\7@\2\2\u01e9"+
		"\u01ea\7@\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\b=\4\2\u01ecz\3\2\2\2\u01ed"+
		"\u01ee\7$\2\2\u01ee\u01ef\7^\2\2\u01ef\u01f0\7$\2\2\u01f0\u01f1\b>\5\2"+
		"\u01f1|\3\2\2\2\u01f2\u01f3\13\2\2\2\u01f3\u01f4\b?\6\2\u01f4~\3\2\2\2"+
		"\u01f5\u01f6\t\n\2\2\u01f6\u0080\3\2\2\2\u01f7\u01f8\t\13\2\2\u01f8\u0082"+
		"\3\2\2\2\u01f9\u01fb\t\f\2\2\u01fa\u01fc\t\r\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5\177@\2\u01fe\u01fd\3"+
		"\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0084\3\2\2\2\u0202\u0203\t\16\2\2\u0203\u0086\3\2\2\2\u0204\u0205\t"+
		"\17\2\2\u0205\u0088\3\2\2\2\u0206\u0207\t\20\2\2\u0207\u008a\3\2\2\2\u0208"+
		"\u0209\7^\2\2\u0209\u020a\13\2\2\2\u020a\u008c\3\2\2\2\u020b\u020c\5A"+
		"!\2\u020c\u020d\5G$\2\u020d\u008e\3\2\2\2\u020e\u020f\7v\2\2\u020f\u0210"+
		"\7t\2\2\u0210\u0211\7w\2\2\u0211\u0212\7g\2\2\u0212\u0090\3\2\2\2\u0213"+
		"\u0214\7h\2\2\u0214\u0215\7c\2\2\u0215\u0216\7n\2\2\u0216\u0217\7u\2\2"+
		"\u0217\u0218\7g\2\2\u0218\u0092\3\2\2\2 \2\u0096\u0122\u012b\u0131\u0136"+
		"\u0138\u013d\u0144\u0147\u014c\u0152\u0156\u015b\u015f\u0165\u016b\u0171"+
		"\u0175\u017a\u017c\u0185\u0187\u01bf\u01c6\u01d0\u01da\u01e0\u01fb\u0200"+
		"\7\3 \2\b\2\2\3=\3\3>\4\3?\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}