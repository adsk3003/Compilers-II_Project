// Generated from /home/akashdeep/Compilers-II_Project/Lexer/src/grammar/MerzureLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MerzureLexerParser extends Parser {
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
	public static final int
		RULE_statement = 0, RULE_compound_statement = 1, RULE_expression_statement = 2, 
		RULE_selection_statement = 3, RULE_loop_statement = 4, RULE_jump_statement = 5, 
		RULE_var_declaration = 6, RULE_var_val_asgn = 7, RULE_var_type = 8, RULE_type = 9, 
		RULE_math_type = 10, RULE_non_math_type = 11, RULE_storage_class = 12, 
		RULE_arr_data_type = 13, RULE_arr_declarations = 14, RULE_arr_val_asgn_one = 15, 
		RULE_arr_val_asgn_all = 16, RULE_expression = 17, RULE_boolean_expression = 18, 
		RULE_logical_or_expression = 19, RULE_logical_and_expression = 20, RULE_relational_expression = 21, 
		RULE_relop = 22, RULE_eq_op = 23, RULE_arithmetic_expression = 24, RULE_unary_expression = 25, 
		RULE_unary_operator = 26, RULE_primary_expression = 27, RULE_var = 28, 
		RULE_constant = 29, RULE_function = 30, RULE_functionStatement = 31, RULE_parlist = 32, 
		RULE_functionBody = 33, RULE_functionPrototype = 34, RULE_protParlist = 35, 
		RULE_return_type = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "compound_statement", "expression_statement", "selection_statement", 
			"loop_statement", "jump_statement", "var_declaration", "var_val_asgn", 
			"var_type", "type", "math_type", "non_math_type", "storage_class", "arr_data_type", 
			"arr_declarations", "arr_val_asgn_one", "arr_val_asgn_all", "expression", 
			"boolean_expression", "logical_or_expression", "logical_and_expression", 
			"relational_expression", "relop", "eq_op", "arithmetic_expression", "unary_expression", 
			"unary_operator", "primary_expression", "var", "constant", "function", 
			"functionStatement", "parlist", "functionBody", "functionPrototype", 
			"protParlist", "return_type"
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

	@Override
	public String getGrammarFileName() { return "MerzureLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MerzureLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Var_val_asgnContext var_val_asgn() {
			return getRuleContext(Var_val_asgnContext.class,0);
		}
		public Arr_val_asgn_allContext arr_val_asgn_all() {
			return getRuleContext(Arr_val_asgn_allContext.class,0);
		}
		public Arr_val_asgn_oneContext arr_val_asgn_one() {
			return getRuleContext(Arr_val_asgn_oneContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Arr_declarationsContext arr_declarations() {
			return getRuleContext(Arr_declarationsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				selection_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				var_val_asgn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				arr_val_asgn_all();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				arr_val_asgn_one();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				var_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				arr_declarations();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				functionPrototype();
				}
				break;
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

	public static class Compound_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MerzureLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MerzureLexerParser.SEMICOLON, i);
		}
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				statement();
				setState(88);
				match(SEMICOLON);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(89);
					match(EOL);
					}
					break;
				}
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMPLEX) | (1L << BOOL) | (1L << FOR) | (1L << IF) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << VOID) | (1L << STATIC) | (1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) );
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expression();
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

	public static class Selection_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MerzureLexerParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MerzureLexerParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MerzureLexerParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MerzureLexerParser.LPAREN, i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MerzureLexerParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MerzureLexerParser.RPAREN, i);
		}
		public List<Compound_statementContext> compound_statement() {
			return getRuleContexts(Compound_statementContext.class);
		}
		public Compound_statementContext compound_statement(int i) {
			return getRuleContext(Compound_statementContext.class,i);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(MerzureLexerParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(MerzureLexerParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(MerzureLexerParser.ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selection_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF);
			setState(99);
			match(LPAREN);
			setState(100);
			boolean_expression();
			setState(101);
			match(RPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(102);
				match(EOL);
				}
			}

			setState(105);
			compound_statement();
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(106);
					match(ELIF);
					setState(107);
					match(LPAREN);
					setState(108);
					boolean_expression();
					setState(109);
					match(RPAREN);
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EOL) {
						{
						setState(110);
						match(EOL);
						}
					}

					setState(113);
					compound_statement();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(120);
				match(ELSE);
				setState(121);
				compound_statement();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(122);
					match(EOL);
					}
				}

				}
			}

			setState(127);
			match(END);
			setState(128);
			match(IF);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(129);
				match(EOL);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(MerzureLexerParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MerzureLexerParser.FOR, i);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MerzureLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MerzureLexerParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FOR);
			setState(133);
			match(LPAREN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(134);
				arithmetic_expression(0);
				}
			}

			setState(137);
			match(SEMICOLON);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(138);
				boolean_expression();
				}
			}

			setState(141);
			match(SEMICOLON);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(142);
				arithmetic_expression(0);
				}
			}

			setState(145);
			match(RPAREN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(146);
				match(EOL);
				}
			}

			setState(149);
			compound_statement();
			setState(150);
			match(END);
			setState(151);
			match(FOR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(152);
				match(EOL);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MerzureLexerParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(MerzureLexerParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(MerzureLexerParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(MerzureLexerParser.EOL, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(156);
				match(EOL);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MerzureLexerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MerzureLexerParser.COLON, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			var_type();
			setState(160);
			match(COLON);
			setState(161);
			match(COLON);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					var();
					setState(163);
					match(COMMA);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(170);
			var();
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

	public static class Var_val_asgnContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Var_val_asgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val_asgn; }
	}

	public final Var_val_asgnContext var_val_asgn() throws RecognitionException {
		Var_val_asgnContext _localctx = new Var_val_asgnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val_asgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			var();
			setState(173);
			match(ASSIGN);
			setState(174);
			arithmetic_expression(0);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Storage_classContext storage_class() {
			return getRuleContext(Storage_classContext.class,0);
		}
		public TerminalNode CONST() { return getToken(MerzureLexerParser.CONST, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(176);
					storage_class();
					}
				}

				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(179);
					match(CONST);
					}
				}

				}
				break;
			case 2:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(182);
					match(CONST);
					}
				}

				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(185);
					storage_class();
					}
				}

				}
				break;
			}
			{
			setState(190);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public Math_typeContext math_type() {
			return getRuleContext(Math_typeContext.class,0);
		}
		public Non_math_typeContext non_math_type() {
			return getRuleContext(Non_math_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case REAL:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				math_type();
				}
				break;
			case CHAR:
			case COMPLEX:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				non_math_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Math_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public Math_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_type; }
	}

	public final Math_typeContext math_type() throws RecognitionException {
		Math_typeContext _localctx = new Math_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(196);
				match(UNSIGNED);
				}
			}

			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(199);
					match(LONG);
					}
				}

				setState(202);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(203);
				match(REAL);
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

	public static class Non_math_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public Non_math_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_math_type; }
	}

	public final Non_math_typeContext non_math_type() throws RecognitionException {
		Non_math_typeContext _localctx = new Non_math_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << COMPLEX) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Storage_classContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(MerzureLexerParser.STATIC, 0); }
		public TerminalNode AUTO() { return getToken(MerzureLexerParser.AUTO, 0); }
		public Storage_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class; }
	}

	public final Storage_classContext storage_class() throws RecognitionException {
		Storage_classContext _localctx = new Storage_classContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_storage_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==AUTO || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arr_data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public TerminalNode STATIC() { return getToken(MerzureLexerParser.STATIC, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public Arr_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_data_type; }
	}

	public final Arr_data_typeContext arr_data_type() throws RecognitionException {
		Arr_data_typeContext _localctx = new Arr_data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arr_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(210);
				match(STATIC);
				}
			}

			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case INT:
			case LONG:
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(213);
					match(UNSIGNED);
					}
				}

				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(216);
					match(LONG);
					}
				}

				setState(219);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(220);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				setState(221);
				match(CHAR);
				}
				break;
			case REAL:
				{
				setState(222);
				match(REAL);
				}
				break;
			case COMPLEX:
				{
				setState(223);
				match(COMPLEX);
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

	public static class Arr_declarationsContext extends ParserRuleContext {
		public Arr_data_typeContext arr_data_type() {
			return getRuleContext(Arr_data_typeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MerzureLexerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MerzureLexerParser.COLON, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public Arr_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_declarations; }
	}

	public final Arr_declarationsContext arr_declarations() throws RecognitionException {
		Arr_declarationsContext _localctx = new Arr_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			arr_data_type();
			setState(227);
			match(COLON);
			setState(228);
			match(COLON);
			setState(229);
			var();
			setState(230);
			match(LPAREN);
			setState(231);
			arithmetic_expression(0);
			setState(232);
			match(RPAREN);
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

	public static class Arr_val_asgn_oneContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public Arr_val_asgn_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_one; }
	}

	public final Arr_val_asgn_oneContext arr_val_asgn_one() throws RecognitionException {
		Arr_val_asgn_oneContext _localctx = new Arr_val_asgn_oneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr_val_asgn_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			var();
			setState(235);
			match(LPAREN);
			setState(236);
			arithmetic_expression(0);
			setState(237);
			match(RPAREN);
			setState(238);
			match(ASSIGN);
			setState(239);
			arithmetic_expression(0);
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

	public static class Arr_val_asgn_allContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<TerminalNode> SLASH() { return getTokens(MerzureLexerParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MerzureLexerParser.SLASH, i);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Arr_val_asgn_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_all; }
	}

	public final Arr_val_asgn_allContext arr_val_asgn_all() throws RecognitionException {
		Arr_val_asgn_allContext _localctx = new Arr_val_asgn_allContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arr_val_asgn_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			var();
			setState(242);
			match(ASSIGN);
			setState(243);
			match(LPAREN);
			setState(244);
			match(SLASH);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					arithmetic_expression(0);
					setState(246);
					match(COMMA);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(253);
			arithmetic_expression(0);
			setState(254);
			match(SLASH);
			setState(255);
			match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				arithmetic_expression(0);
				}
				break;
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				logical_and_expression(0);
				}
				break;
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(MerzureLexerParser.OR, 0); }
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(OR);
					setState(270);
					logical_and_expression(0);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MerzureLexerParser.AND, 0); }
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(279);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(280);
					match(AND);
					setState(281);
					relational_expression(0);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			arithmetic_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(290);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(291);
						relop();
						setState(292);
						arithmetic_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(294);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(295);
						eq_op();
						setState(296);
						arithmetic_expression(0);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MerzureLexerParser.LT, 0); }
		public TerminalNode GT() { return getToken(MerzureLexerParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(MerzureLexerParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(MerzureLexerParser.GEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MerzureLexerParser.EQUALS, 0); }
		public TerminalNode NEQ() { return getToken(MerzureLexerParser.NEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(MerzureLexerParser.POW, 0); }
		public TerminalNode SLASH() { return getToken(MerzureLexerParser.SLASH, 0); }
		public TerminalNode STAR() { return getToken(MerzureLexerParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(MerzureLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MerzureLexerParser.MINUS, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(310);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(311);
						match(POW);
						setState(312);
						arithmetic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(313);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(314);
						match(SLASH);
						setState(315);
						arithmetic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(316);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(317);
						match(STAR);
						setState(318);
						arithmetic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(PLUS);
						setState(321);
						arithmetic_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(322);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(323);
						match(MINUS);
						setState(324);
						arithmetic_expression(2);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(330);
				unary_operator();
				}
			}

			setState(333);
			primary_expression();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MerzureLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MerzureLexerParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MerzureLexerParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				var();
				}
				break;
			case INT_CONST:
			case REAL_CONST:
			case BOOL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(LPAREN);
				setState(340);
				expression();
				setState(341);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(MerzureLexerParser.OBJECTID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(OBJECTID);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOL_CONST() { return getToken(MerzureLexerParser.BOOL_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(MerzureLexerParser.REAL_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(MerzureLexerParser.INT_CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			functionStatement();
			setState(350);
			functionBody();
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MerzureLexerParser.EOL, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			return_type();
			setState(353);
			match(FUNCTION);
			setState(354);
			var();
			setState(355);
			match(LPAREN);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(356);
				parlist();
				}
			}

			setState(359);
			match(RPAREN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(360);
				match(EOL);
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

	public static class ParlistContext extends ParserRuleContext {
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			var_type();
			setState(364);
			var();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				var_type();
				setState(367);
				var();
				}
				}
				setState(373);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			compound_statement();
			setState(375);
			match(END);
			setState(376);
			match(FUNCTION);
			setState(377);
			var();
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

	public static class FunctionPrototypeContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public ProtParlistContext protParlist() {
			return getRuleContext(ProtParlistContext.class,0);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			return_type();
			setState(380);
			match(FUNCTION);
			setState(381);
			var();
			setState(382);
			match(LPAREN);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(383);
				protParlist();
				}
			}

			setState(386);
			match(RPAREN);
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

	public static class ProtParlistContext extends ParserRuleContext {
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public ProtParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protParlist; }
	}

	public final ProtParlistContext protParlist() throws RecognitionException {
		ProtParlistContext _localctx = new ProtParlistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_protParlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			var_type();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				var_type();
				}
				}
				setState(395);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public TerminalNode VOID() { return getToken(MerzureLexerParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_type);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(CHAR);
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(COMPLEX);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(BOOL);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(REAL);
				}
				break;
			case UNSIGNED:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(400);
					match(UNSIGNED);
					}
				}

				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(403);
					match(LONG);
					}
				}

				setState(406);
				match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 19:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 20:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 21:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 24:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2X\n\2\3\3\3\3\3\3\5\3]\n\3\6\3_\n\3\r\3\16\3`\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\5\5~\n\5\5\5\u0080\n\5\3\5\3\5\3\5"+
		"\5\5\u0085\n\5\3\6\3\6\3\6\5\6\u008a\n\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6"+
		"\5\6\u0092\n\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\7"+
		"\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\5\n\u00b4\n\n\3\n\5\n\u00b7\n\n\3\n"+
		"\5\n\u00ba\n\n\3\n\5\n\u00bd\n\n\5\n\u00bf\n\n\3\n\3\n\3\13\3\13\5\13"+
		"\u00c5\n\13\3\f\5\f\u00c8\n\f\3\f\5\f\u00cb\n\f\3\f\3\f\5\f\u00cf\n\f"+
		"\3\r\3\r\3\16\3\16\3\17\5\17\u00d6\n\17\3\17\5\17\u00d9\n\17\3\17\5\17"+
		"\u00dc\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\5\23\u0106\n\23\3\24\3\24\5\24\u010a\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0112\n\25\f\25\16\25\u0115\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u011d\n\26\f\26\16\26\u0120\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012d\n\27\f\27"+
		"\16\27\u0130\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0148"+
		"\n\32\f\32\16\32\u014b\13\32\3\33\5\33\u014e\n\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015a\n\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\3!\3!\5!\u0168\n!\3!\3!\5!\u016c\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u0174\n\"\f\"\16\"\u0177\13\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\5$\u0183\n$\3$\3$\3%\3%\3%\7%\u018a\n%\f%\16%\u018d\13%\3&\3&\3&\3&"+
		"\3&\5&\u0194\n&\3&\5&\u0197\n&\3&\3&\5&\u019b\n&\3&\3w\6(*,\62\'\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\t\4"+
		"\2\b\t\23\23\5\2\4\4\n\n\f\f\4\2\6\6\30\30\4\2./\61\62\4\2\60\60\63\63"+
		"\4\2\33\33)*\4\2\35\36  \2\u01bb\2W\3\2\2\2\4^\3\2\2\2\6b\3\2\2\2\bd\3"+
		"\2\2\2\n\u0086\3\2\2\2\f\u009d\3\2\2\2\16\u00a1\3\2\2\2\20\u00ae\3\2\2"+
		"\2\22\u00be\3\2\2\2\24\u00c4\3\2\2\2\26\u00c7\3\2\2\2\30\u00d0\3\2\2\2"+
		"\32\u00d2\3\2\2\2\34\u00d5\3\2\2\2\36\u00e4\3\2\2\2 \u00ec\3\2\2\2\"\u00f3"+
		"\3\2\2\2$\u0105\3\2\2\2&\u0109\3\2\2\2(\u010b\3\2\2\2*\u0116\3\2\2\2,"+
		"\u0121\3\2\2\2.\u0131\3\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2\2\64\u014d"+
		"\3\2\2\2\66\u0151\3\2\2\28\u0159\3\2\2\2:\u015b\3\2\2\2<\u015d\3\2\2\2"+
		">\u015f\3\2\2\2@\u0162\3\2\2\2B\u016d\3\2\2\2D\u0178\3\2\2\2F\u017d\3"+
		"\2\2\2H\u0186\3\2\2\2J\u019a\3\2\2\2LX\5\6\4\2MX\5\b\5\2NX\5\n\6\2OX\5"+
		"\f\7\2PX\5\20\t\2QX\5\"\22\2RX\5 \21\2SX\5\16\b\2TX\5\36\20\2UX\5> \2"+
		"VX\5F$\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2WQ\3\2\2\2W"+
		"R\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\3\3\2\2\2YZ\5\2\2\2"+
		"Z\\\7\'\2\2[]\7\3\2\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^Y\3\2\2\2_`\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2bc\5$\23\2c\7\3\2\2\2de\7\16\2\2ef"+
		"\7#\2\2fg\5&\24\2gi\7$\2\2hj\7\3\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kw\5"+
		"\4\3\2lm\7\17\2\2mn\7#\2\2no\5&\24\2oq\7$\2\2pr\7\3\2\2qp\3\2\2\2qr\3"+
		"\2\2\2rs\3\2\2\2st\5\4\3\2tv\3\2\2\2ul\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3"+
		"\2\2\2x\177\3\2\2\2yw\3\2\2\2z{\7\13\2\2{}\5\4\3\2|~\7\3\2\2}|\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\7\25\2\2\u0082\u0084\7\16\2\2\u0083\u0085\7\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\t\3\2\2\2\u0086\u0087\7\r\2\2"+
		"\u0087\u0089\7#\2\2\u0088\u008a\5\62\32\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7\'\2\2\u008c\u008e\5&\24\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\'"+
		"\2\2\u0090\u0092\5\62\32\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\7$\2\2\u0094\u0096\7\3\2\2\u0095\u0094\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5\4\3\2\u0098"+
		"\u0099\7\25\2\2\u0099\u009b\7\r\2\2\u009a\u009c\7\3\2\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d\u009f\t\2\2\2\u009e"+
		"\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\r\3\2\2\2"+
		"\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7%\2\2\u00a3\u00a9\7%\2\2\u00a4\u00a5"+
		"\5:\36\2\u00a5\u00a6\7(\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5:\36\2\u00ad\17\3\2\2\2\u00ae\u00af"+
		"\5:\36\2\u00af\u00b0\7\67\2\2\u00b0\u00b1\5\62\32\2\u00b1\21\3\2\2\2\u00b2"+
		"\u00b4\5\32\16\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b7\7\5\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00bf\3\2\2\2\u00b8\u00ba\7\5\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5\32\16\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b3\3\2\2\2\u00be\u00b9\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\24\13\2\u00c1\23\3\2\2\2\u00c2"+
		"\u00c5\5\26\f\2\u00c3\u00c5\5\30\r\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c8\7\7\2\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ce\3\2\2\2\u00c9\u00cb\7\22\2\2\u00ca\u00c9\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\7\21\2\2\u00cd"+
		"\u00cf\7\20\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\27\3\2\2"+
		"\2\u00d0\u00d1\t\3\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\33\3"+
		"\2\2\2\u00d4\u00d6\7\30\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00e2\3\2\2\2\u00d7\u00d9\7\7\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\7\22\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e3\7\21\2\2\u00de\u00e3\7"+
		"\f\2\2\u00df\u00e3\7\4\2\2\u00e0\u00e3\7\20\2\2\u00e1\u00e3\7\n\2\2\u00e2"+
		"\u00d8\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00e5\5\34\17\2\u00e5"+
		"\u00e6\7%\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\5:\36\2\u00e8\u00e9\7#\2"+
		"\2\u00e9\u00ea\5\62\32\2\u00ea\u00eb\7$\2\2\u00eb\37\3\2\2\2\u00ec\u00ed"+
		"\5:\36\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\7$\2\2\u00f0"+
		"\u00f1\7\67\2\2\u00f1\u00f2\5\62\32\2\u00f2!\3\2\2\2\u00f3\u00f4\5:\36"+
		"\2\u00f4\u00f5\7\67\2\2\u00f5\u00f6\7#\2\2\u00f6\u00fc\7,\2\2\u00f7\u00f8"+
		"\5\62\32\2\u00f8\u00f9\7(\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5\62\32\2\u0100\u0101\7,\2\2"+
		"\u0101\u0102\7$\2\2\u0102#\3\2\2\2\u0103\u0106\5&\24\2\u0104\u0106\5\62"+
		"\32\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106%\3\2\2\2\u0107\u010a"+
		"\5(\25\2\u0108\u010a\5*\26\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\'\3\2\2\2\u010b\u010c\b\25\1\2\u010c\u010d\5*\26\2\u010d\u0113\3\2\2"+
		"\2\u010e\u010f\f\3\2\2\u010f\u0110\7\32\2\2\u0110\u0112\5*\26\2\u0111"+
		"\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114)\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\b\26\1\2\u0117\u0118"+
		"\5,\27\2\u0118\u011e\3\2\2\2\u0119\u011a\f\4\2\2\u011a\u011b\7\31\2\2"+
		"\u011b\u011d\5,\27\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f+\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\b\27\1\2\u0122\u0123\5\62\32\2\u0123\u012e\3\2\2\2\u0124\u0125"+
		"\f\4\2\2\u0125\u0126\5.\30\2\u0126\u0127\5\62\32\2\u0127\u012d\3\2\2\2"+
		"\u0128\u0129\f\3\2\2\u0129\u012a\5\60\31\2\u012a\u012b\5\62\32\2\u012b"+
		"\u012d\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f-\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0132\t\5\2\2\u0132/\3\2\2\2\u0133\u0134\t\6\2\2\u0134"+
		"\61\3\2\2\2\u0135\u0136\b\32\1\2\u0136\u0137\5\64\33\2\u0137\u0149\3\2"+
		"\2\2\u0138\u0139\f\7\2\2\u0139\u013a\78\2\2\u013a\u0148\5\62\32\b\u013b"+
		"\u013c\f\6\2\2\u013c\u013d\7,\2\2\u013d\u0148\5\62\32\7\u013e\u013f\f"+
		"\5\2\2\u013f\u0140\7+\2\2\u0140\u0148\5\62\32\6\u0141\u0142\f\4\2\2\u0142"+
		"\u0143\7)\2\2\u0143\u0148\5\62\32\5\u0144\u0145\f\3\2\2\u0145\u0146\7"+
		"*\2\2\u0146\u0148\5\62\32\4\u0147\u0138\3\2\2\2\u0147\u013b\3\2\2\2\u0147"+
		"\u013e\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\63\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\5\66\34\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\58\35\2\u0150\65\3\2\2\2\u0151\u0152"+
		"\t\7\2\2\u0152\67\3\2\2\2\u0153\u015a\5:\36\2\u0154\u015a\5<\37\2\u0155"+
		"\u0156\7#\2\2\u0156\u0157\5$\23\2\u0157\u0158\7$\2\2\u0158\u015a\3\2\2"+
		"\2\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u015a9"+
		"\3\2\2\2\u015b\u015c\7\"\2\2\u015c;\3\2\2\2\u015d\u015e\t\b\2\2\u015e"+
		"=\3\2\2\2\u015f\u0160\5@!\2\u0160\u0161\5D#\2\u0161?\3\2\2\2\u0162\u0163"+
		"\5J&\2\u0163\u0164\7\27\2\2\u0164\u0165\5:\36\2\u0165\u0167\7#\2\2\u0166"+
		"\u0168\5B\"\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\7$\2\2\u016a\u016c\7\3\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016cA\3\2\2\2\u016d\u016e\5\22\n\2\u016e\u0175\5:\36\2"+
		"\u016f\u0170\7(\2\2\u0170\u0171\5\22\n\2\u0171\u0172\5:\36\2\u0172\u0174"+
		"\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176C\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5\4\3\2"+
		"\u0179\u017a\7\25\2\2\u017a\u017b\7\27\2\2\u017b\u017c\5:\36\2\u017cE"+
		"\3\2\2\2\u017d\u017e\5J&\2\u017e\u017f\7\27\2\2\u017f\u0180\5:\36\2\u0180"+
		"\u0182\7#\2\2\u0181\u0183\5H%\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0185\7$\2\2\u0185G\3\2\2\2\u0186\u018b\5"+
		"\22\n\2\u0187\u0188\7(\2\2\u0188\u018a\5\22\n\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cI\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\u018e\u019b\7\4\2\2\u018f\u019b\7\n\2\2\u0190\u019b"+
		"\7\f\2\2\u0191\u019b\7\20\2\2\u0192\u0194\7\7\2\2\u0193\u0192\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\7\22\2\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\7\21\2\2"+
		"\u0199\u019b\7\26\2\2\u019a\u018e\3\2\2\2\u019a\u018f\3\2\2\2\u019a\u0190"+
		"\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0193\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"K\3\2\2\2\62W\\`iqw}\177\u0084\u0089\u008d\u0091\u0095\u009b\u009f\u00a9"+
		"\u00b3\u00b6\u00b9\u00bc\u00be\u00c4\u00c7\u00ca\u00ce\u00d5\u00d8\u00db"+
		"\u00e2\u00fc\u0105\u0109\u0113\u011e\u012c\u012e\u0147\u0149\u014d\u0159"+
		"\u0167\u016b\u0175\u0182\u018b\u0193\u0196\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}