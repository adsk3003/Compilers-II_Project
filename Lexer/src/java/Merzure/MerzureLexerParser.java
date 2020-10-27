// Generated from MerzureLexer.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
		RULE_var_asgn_function_call = 36, RULE_return_type = 37;
	public static final String[] ruleNames = {
		"statement", "compound_statement", "expression_statement", "selection_statement", 
		"loop_statement", "jump_statement", "var_declaration", "var_val_asgn", 
		"var_type", "type", "math_type", "non_math_type", "storage_class", "arr_data_type", 
		"arr_declarations", "arr_val_asgn_one", "arr_val_asgn_all", "expression", 
		"boolean_expression", "logical_or_expression", "logical_and_expression", 
		"relational_expression", "relop", "eq_op", "arithmetic_expression", "unary_expression", 
		"unary_operator", "primary_expression", "var", "constant", "function", 
		"functionStatement", "parlist", "functionBody", "functionPrototype", "protParlist", 
		"var_asgn_function_call", "return_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'char'", "'const'", "'auto'", "'unsigned'", "'break'", "'continue'", 
		"'complex'", "'else'", "'bool'", "'for'", "'if'", "'elif'", "'real'", 
		"'int'", "'long'", "'return'", "'include'", "'end'", "'void'", "'function'", 
		"'static'", "'and'", "'or'", "'not'", null, null, null, null, null, null, 
		null, "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", 
		"'~'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'{'", "'}'", "'.'", 
		"'='", "'^'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		public Var_asgn_function_callContext var_asgn_function_call() {
			return getRuleContext(Var_asgn_function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				selection_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				var_val_asgn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				arr_val_asgn_all();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				arr_val_asgn_one();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				var_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				arr_declarations();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				functionPrototype();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				var_asgn_function_call();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				setState(91);
				match(SEMICOLON);
				setState(93);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(92);
					match(EOL);
					}
				}

				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMPLEX) | (1L << BOOL) | (1L << FOR) | (1L << IF) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << VOID) | (1L << STATIC) | (1L << NOT) | (1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selection_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			match(LPAREN);
			setState(103);
			boolean_expression();
			setState(104);
			match(RPAREN);
			setState(106);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(105);
				match(EOL);
				}
			}

			setState(108);
			compound_statement();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(109);
					match(ELIF);
					setState(110);
					match(LPAREN);
					setState(111);
					boolean_expression();
					setState(112);
					match(RPAREN);
					setState(114);
					_la = _input.LA(1);
					if (_la==EOL) {
						{
						setState(113);
						match(EOL);
						}
					}

					setState(116);
					compound_statement();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(123);
				match(ELSE);
				setState(125);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(124);
					match(EOL);
					}
				}

				setState(127);
				compound_statement();
				}
			}

			setState(130);
			match(END);
			setState(131);
			match(IF);
			setState(133);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(132);
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
		public List<Var_val_asgnContext> var_val_asgn() {
			return getRuleContexts(Var_val_asgnContext.class);
		}
		public Var_val_asgnContext var_val_asgn(int i) {
			return getRuleContext(Var_val_asgnContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR);
			setState(136);
			match(LPAREN);
			setState(138);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(137);
				var_val_asgn();
				}
			}

			setState(140);
			match(SEMICOLON);
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(141);
				boolean_expression();
				}
			}

			setState(144);
			match(SEMICOLON);
			setState(146);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(145);
				var_val_asgn();
				}
			}

			setState(148);
			match(RPAREN);
			setState(150);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(149);
				match(EOL);
				}
			}

			setState(152);
			compound_statement();
			setState(153);
			match(END);
			setState(154);
			match(FOR);
			setState(156);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(155);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(160);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(159);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			var_type();
			setState(163);
			match(COLON);
			setState(164);
			match(COLON);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					var();
					setState(166);
					match(COMMA);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(173);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_val_asgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_val_asgn(this);
		}
	}

	public final Var_val_asgnContext var_val_asgn() throws RecognitionException {
		Var_val_asgnContext _localctx = new Var_val_asgnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val_asgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			var();
			setState(176);
			match(ASSIGN);
			setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(180);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(179);
					storage_class();
					}
				}

				setState(183);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(182);
					match(CONST);
					}
				}

				}
				break;
			case 2:
				{
				setState(186);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(185);
					match(CONST);
					}
				}

				setState(189);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(188);
					storage_class();
					}
				}

				}
				break;
			}
			{
			setState(193);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case REAL:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				math_type();
				}
				break;
			case CHAR:
			case COMPLEX:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterMath_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitMath_type(this);
		}
	}

	public final Math_typeContext math_type() throws RecognitionException {
		Math_typeContext _localctx = new Math_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(199);
				match(UNSIGNED);
				}
			}

			setState(207);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				{
				setState(203);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(202);
					match(LONG);
					}
				}

				setState(205);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(206);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterNon_math_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitNon_math_type(this);
		}
	}

	public final Non_math_typeContext non_math_type() throws RecognitionException {
		Non_math_typeContext _localctx = new Non_math_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << COMPLEX) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterStorage_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitStorage_class(this);
		}
	}

	public final Storage_classContext storage_class() throws RecognitionException {
		Storage_classContext _localctx = new Storage_classContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_storage_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==AUTO || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_data_type(this);
		}
	}

	public final Arr_data_typeContext arr_data_type() throws RecognitionException {
		Arr_data_typeContext _localctx = new Arr_data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arr_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(213);
				match(STATIC);
				}
			}

			setState(227);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case INT:
			case LONG:
				{
				setState(217);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(216);
					match(UNSIGNED);
					}
				}

				setState(220);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(219);
					match(LONG);
					}
				}

				setState(222);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(223);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				setState(224);
				match(CHAR);
				}
				break;
			case REAL:
				{
				setState(225);
				match(REAL);
				}
				break;
			case COMPLEX:
				{
				setState(226);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_declarations(this);
		}
	}

	public final Arr_declarationsContext arr_declarations() throws RecognitionException {
		Arr_declarationsContext _localctx = new Arr_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			arr_data_type();
			setState(230);
			match(COLON);
			setState(231);
			match(COLON);
			setState(232);
			var();
			setState(233);
			match(LPAREN);
			setState(234);
			arithmetic_expression(0);
			setState(235);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_val_asgn_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_val_asgn_one(this);
		}
	}

	public final Arr_val_asgn_oneContext arr_val_asgn_one() throws RecognitionException {
		Arr_val_asgn_oneContext _localctx = new Arr_val_asgn_oneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr_val_asgn_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			var();
			setState(238);
			match(LPAREN);
			setState(239);
			arithmetic_expression(0);
			setState(240);
			match(RPAREN);
			setState(241);
			match(ASSIGN);
			setState(242);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_val_asgn_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_val_asgn_all(this);
		}
	}

	public final Arr_val_asgn_allContext arr_val_asgn_all() throws RecognitionException {
		Arr_val_asgn_allContext _localctx = new Arr_val_asgn_allContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arr_val_asgn_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			var();
			setState(245);
			match(ASSIGN);
			setState(246);
			match(LPAREN);
			setState(247);
			match(SLASH);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					arithmetic_expression(0);
					setState(249);
					match(COMMA);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(256);
			arithmetic_expression(0);
			setState(257);
			match(SLASH);
			setState(258);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLogical_or_expression(this);
		}
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
			setState(269);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
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
					setState(271);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(272);
					match(OR);
					setState(273);
					logical_and_expression(0);
					}
					} 
				}
				setState(278);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLogical_and_expression(this);
		}
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
			setState(280);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
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
					setState(282);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(283);
					match(AND);
					setState(284);
					relational_expression(0);
					}
					} 
				}
				setState(289);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitRelational_expression(this);
		}
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
			setState(291);
			arithmetic_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(293);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(294);
						relop();
						setState(295);
						arithmetic_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(297);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(298);
						eq_op();
						setState(299);
						arithmetic_expression(0);
						}
						break;
					}
					} 
				}
				setState(305);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArithmetic_expression(this);
		}
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
			setState(311);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(313);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(314);
						match(POW);
						setState(315);
						arithmetic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(SLASH);
						setState(318);
						arithmetic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(STAR);
						setState(321);
						arithmetic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						match(PLUS);
						setState(324);
						arithmetic_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(325);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(326);
						match(MINUS);
						setState(327);
						arithmetic_expression(2);
						}
						break;
					}
					} 
				}
				setState(332);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(333);
				unary_operator();
				}
			}

			setState(336);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case OBJECTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				var();
				}
				break;
			case CHAR_CONST:
			case INT_CONST:
			case REAL_CONST:
			case BOOL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(LPAREN);
				setState(343);
				expression();
				setState(344);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		public TerminalNode CHAR_CONST() { return getToken(MerzureLexerParser.CHAR_CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			functionStatement();
			setState(353);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			return_type();
			setState(356);
			match(FUNCTION);
			setState(357);
			var();
			setState(358);
			match(LPAREN);
			setState(360);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(359);
				parlist();
				}
			}

			setState(362);
			match(RPAREN);
			setState(364);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(363);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitParlist(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			var_type();
			setState(367);
			var();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				var_type();
				setState(370);
				var();
				}
				}
				setState(376);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			compound_statement();
			setState(378);
			match(END);
			setState(379);
			match(FUNCTION);
			setState(380);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionPrototype(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			return_type();
			setState(383);
			match(FUNCTION);
			setState(384);
			var();
			setState(385);
			match(LPAREN);
			setState(387);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(386);
				protParlist();
				}
			}

			setState(389);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterProtParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitProtParlist(this);
		}
	}

	public final ProtParlistContext protParlist() throws RecognitionException {
		ProtParlistContext _localctx = new ProtParlistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_protParlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			var_type();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(393);
				var_type();
				}
				}
				setState(398);
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

	public static class Var_asgn_function_callContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Var_asgn_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asgn_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_asgn_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_asgn_function_call(this);
		}
	}

	public final Var_asgn_function_callContext var_asgn_function_call() throws RecognitionException {
		Var_asgn_function_callContext _localctx = new Var_asgn_function_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_var_asgn_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			var();
			setState(400);
			match(ASSIGN);
			setState(401);
			var();
			setState(402);
			match(LPAREN);
			setState(412);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						var();
						setState(404);
						match(COMMA);
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(411);
				var();
				}
			}

			setState(414);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_return_type);
		int _la;
		try {
			setState(428);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(CHAR);
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(COMPLEX);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(BOOL);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(REAL);
				}
				break;
			case UNSIGNED:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(420);
					match(UNSIGNED);
					}
				}

				setState(424);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(423);
					match(LONG);
					}
				}

				setState(426);
				match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\3\3\5\3`\n\3\6\3b\n\3\r\3\16\3"+
		"c\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5u\n"+
		"\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\5\5\u0080\n\5\3\5\5\5\u0083"+
		"\n\5\3\5\3\5\3\5\5\5\u0088\n\5\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\5\6\u0091"+
		"\n\6\3\6\3\6\5\6\u0095\n\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6\5\6\u009f"+
		"\n\6\3\7\3\7\5\7\u00a3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ab\n\b\f\b\16"+
		"\b\u00ae\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\5\n\u00b7\n\n\3\n\5\n\u00ba"+
		"\n\n\3\n\5\n\u00bd\n\n\3\n\5\n\u00c0\n\n\5\n\u00c2\n\n\3\n\3\n\3\13\3"+
		"\13\5\13\u00c8\n\13\3\f\5\f\u00cb\n\f\3\f\5\f\u00ce\n\f\3\f\3\f\5\f\u00d2"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\5\17\u00d9\n\17\3\17\5\17\u00dc\n\17\3\17"+
		"\5\17\u00df\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fe\n\22\f\22\16\22\u0101\13\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\5\23\u0109\n\23\3\24\3\24\5\24\u010d\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0115\n\25\f\25\16\25\u0118\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0120\n\26\f\26\16\26\u0123\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0130\n\27"+
		"\f\27\16\27\u0133\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u014b"+
		"\n\32\f\32\16\32\u014e\13\32\3\33\5\33\u0151\n\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015d\n\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\3!\3!\5!\u016b\n!\3!\3!\5!\u016f\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u0177\n\"\f\"\16\"\u017a\13\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\5$\u0186\n$\3$\3$\3%\3%\3%\7%\u018d\n%\f%\16%\u0190\13%\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u0199\n&\f&\16&\u019c\13&\3&\5&\u019f\n&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u01a8\n\'\3\'\5\'\u01ab\n\'\3\'\3\'\5\'\u01af\n\'\3\'\3"+
		"z\6(*,\62(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJL\2\t\4\2\b\t\23\23\5\2\4\4\n\n\f\f\4\2\6\6\30\30\4\2./\61\62"+
		"\4\2\60\60\63\63\4\2\33\33)*\4\2\34\36  \u01d1\2Z\3\2\2\2\4a\3\2\2\2\6"+
		"e\3\2\2\2\bg\3\2\2\2\n\u0089\3\2\2\2\f\u00a0\3\2\2\2\16\u00a4\3\2\2\2"+
		"\20\u00b1\3\2\2\2\22\u00c1\3\2\2\2\24\u00c7\3\2\2\2\26\u00ca\3\2\2\2\30"+
		"\u00d3\3\2\2\2\32\u00d5\3\2\2\2\34\u00d8\3\2\2\2\36\u00e7\3\2\2\2 \u00ef"+
		"\3\2\2\2\"\u00f6\3\2\2\2$\u0108\3\2\2\2&\u010c\3\2\2\2(\u010e\3\2\2\2"+
		"*\u0119\3\2\2\2,\u0124\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2\62\u0138"+
		"\3\2\2\2\64\u0150\3\2\2\2\66\u0154\3\2\2\28\u015c\3\2\2\2:\u015e\3\2\2"+
		"\2<\u0160\3\2\2\2>\u0162\3\2\2\2@\u0165\3\2\2\2B\u0170\3\2\2\2D\u017b"+
		"\3\2\2\2F\u0180\3\2\2\2H\u0189\3\2\2\2J\u0191\3\2\2\2L\u01ae\3\2\2\2N"+
		"[\5\6\4\2O[\5\b\5\2P[\5\n\6\2Q[\5\f\7\2R[\5\20\t\2S[\5\"\22\2T[\5 \21"+
		"\2U[\5\16\b\2V[\5\36\20\2W[\5> \2X[\5F$\2Y[\5J&\2ZN\3\2\2\2ZO\3\2\2\2"+
		"ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2"+
		"ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\3\3\2\2\2\\]\5\2\2\2]_\7\'\2\2^`\7\3\2"+
		"\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2a\\\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2d\5\3\2\2\2ef\5$\23\2f\7\3\2\2\2gh\7\16\2\2hi\7#\2\2ij\5&\24\2jl\7"+
		"$\2\2km\7\3\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nz\5\4\3\2op\7\17\2\2pq\7"+
		"#\2\2qr\5&\24\2rt\7$\2\2su\7\3\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\4"+
		"\3\2wy\3\2\2\2xo\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{\u0082\3\2\2\2"+
		"|z\3\2\2\2}\177\7\13\2\2~\u0080\7\3\2\2\177~\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\5\4\3\2\u0082}\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\25\2\2\u0085\u0087\7\16\2\2\u0086"+
		"\u0088\7\3\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2"+
		"\u0089\u008a\7\r\2\2\u008a\u008c\7#\2\2\u008b\u008d\5\20\t\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\'\2\2\u008f"+
		"\u0091\5&\24\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\7\'\2\2\u0093\u0095\5\20\t\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7$\2\2\u0097\u0099\7\3"+
		"\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\5\4\3\2\u009b\u009c\7\25\2\2\u009c\u009e\7\r\2\2\u009d\u009f\7"+
		"\3\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2\2\u00a0"+
		"\u00a2\t\2\2\2\u00a1\u00a3\7\3\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7%\2\2\u00a6\u00ac"+
		"\7%\2\2\u00a7\u00a8\5:\36\2\u00a8\u00a9\7(\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5:\36\2\u00b0"+
		"\17\3\2\2\2\u00b1\u00b2\5:\36\2\u00b2\u00b3\7\67\2\2\u00b3\u00b4\5\62"+
		"\32\2\u00b4\21\3\2\2\2\u00b5\u00b7\5\32\16\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\7\5\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c2\3\2\2\2\u00bb\u00bd\7\5\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\5\32"+
		"\16\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00b6\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5\24"+
		"\13\2\u00c4\23\3\2\2\2\u00c5\u00c8\5\26\f\2\u00c6\u00c8\5\30\r\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\25\3\2\2\2\u00c9\u00cb\7\7\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc\u00ce"+
		"\7\22\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d2\7\21\2\2\u00d0\u00d2\7\20\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4\31\3\2\2\2\u00d5\u00d6"+
		"\t\4\2\2\u00d6\33\3\2\2\2\u00d7\u00d9\7\30\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00e5\3\2\2\2\u00da\u00dc\7\7\2\2\u00db\u00da\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\7\22\2\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e6\7\21"+
		"\2\2\u00e1\u00e6\7\f\2\2\u00e2\u00e6\7\4\2\2\u00e3\u00e6\7\20\2\2\u00e4"+
		"\u00e6\7\n\2\2\u00e5\u00db\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e8"+
		"\5\34\17\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5:\36\2\u00eb"+
		"\u00ec\7#\2\2\u00ec\u00ed\5\62\32\2\u00ed\u00ee\7$\2\2\u00ee\37\3\2\2"+
		"\2\u00ef\u00f0\5:\36\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\5\62\32\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\7\67\2\2\u00f4\u00f5\5\62\32\2\u00f5!\3\2\2"+
		"\2\u00f6\u00f7\5:\36\2\u00f7\u00f8\7\67\2\2\u00f8\u00f9\7#\2\2\u00f9\u00ff"+
		"\7,\2\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\7(\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5\62\32\2\u0103"+
		"\u0104\7,\2\2\u0104\u0105\7$\2\2\u0105#\3\2\2\2\u0106\u0109\5&\24\2\u0107"+
		"\u0109\5\62\32\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109%\3\2\2"+
		"\2\u010a\u010d\5(\25\2\u010b\u010d\5*\26\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\'\3\2\2\2\u010e\u010f\b\25\1\2\u010f\u0110\5*\26\2\u0110"+
		"\u0116\3\2\2\2\u0111\u0112\f\3\2\2\u0112\u0113\7\32\2\2\u0113\u0115\5"+
		"*\26\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117)\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\b\26\1\2"+
		"\u011a\u011b\5,\27\2\u011b\u0121\3\2\2\2\u011c\u011d\f\4\2\2\u011d\u011e"+
		"\7\31\2\2\u011e\u0120\5,\27\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122+\3\2\2\2\u0123\u0121\3"+
		"\2\2\2\u0124\u0125\b\27\1\2\u0125\u0126\5\62\32\2\u0126\u0131\3\2\2\2"+
		"\u0127\u0128\f\4\2\2\u0128\u0129\5.\30\2\u0129\u012a\5\62\32\2\u012a\u0130"+
		"\3\2\2\2\u012b\u012c\f\3\2\2\u012c\u012d\5\60\31\2\u012d\u012e\5\62\32"+
		"\2\u012e\u0130\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132-\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\t\5\2\2\u0135/\3\2\2\2\u0136\u0137\t\6\2\2"+
		"\u0137\61\3\2\2\2\u0138\u0139\b\32\1\2\u0139\u013a\5\64\33\2\u013a\u014c"+
		"\3\2\2\2\u013b\u013c\f\7\2\2\u013c\u013d\78\2\2\u013d\u014b\5\62\32\b"+
		"\u013e\u013f\f\6\2\2\u013f\u0140\7,\2\2\u0140\u014b\5\62\32\7\u0141\u0142"+
		"\f\5\2\2\u0142\u0143\7+\2\2\u0143\u014b\5\62\32\6\u0144\u0145\f\4\2\2"+
		"\u0145\u0146\7)\2\2\u0146\u014b\5\62\32\5\u0147\u0148\f\3\2\2\u0148\u0149"+
		"\7*\2\2\u0149\u014b\5\62\32\4\u014a\u013b\3\2\2\2\u014a\u013e\3\2\2\2"+
		"\u014a\u0141\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0147\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0151\5\66\34\2\u0150\u014f\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\58\35\2\u0153\65\3\2\2\2\u0154"+
		"\u0155\t\7\2\2\u0155\67\3\2\2\2\u0156\u015d\5:\36\2\u0157\u015d\5<\37"+
		"\2\u0158\u0159\7#\2\2\u0159\u015a\5$\23\2\u015a\u015b\7$\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0156\3\2\2\2\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015d"+
		"9\3\2\2\2\u015e\u015f\7\"\2\2\u015f;\3\2\2\2\u0160\u0161\t\b\2\2\u0161"+
		"=\3\2\2\2\u0162\u0163\5@!\2\u0163\u0164\5D#\2\u0164?\3\2\2\2\u0165\u0166"+
		"\5L\'\2\u0166\u0167\7\27\2\2\u0167\u0168\5:\36\2\u0168\u016a\7#\2\2\u0169"+
		"\u016b\5B\"\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\7$\2\2\u016d\u016f\7\3\2\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016fA\3\2\2\2\u0170\u0171\5\22\n\2\u0171\u0178\5:\36\2"+
		"\u0172\u0173\7(\2\2\u0173\u0174\5\22\n\2\u0174\u0175\5:\36\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179C\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\4\3\2"+
		"\u017c\u017d\7\25\2\2\u017d\u017e\7\27\2\2\u017e\u017f\5:\36\2\u017fE"+
		"\3\2\2\2\u0180\u0181\5L\'\2\u0181\u0182\7\27\2\2\u0182\u0183\5:\36\2\u0183"+
		"\u0185\7#\2\2\u0184\u0186\5H%\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0188\7$\2\2\u0188G\3\2\2\2\u0189\u018e\5"+
		"\22\n\2\u018a\u018b\7(\2\2\u018b\u018d\5\22\n\2\u018c\u018a\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fI\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0191\u0192\5:\36\2\u0192\u0193\7\67\2\2\u0193\u0194"+
		"\5:\36\2\u0194\u019e\7#\2\2\u0195\u0196\5:\36\2\u0196\u0197\7(\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0195\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019f\5:\36\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\7$\2\2\u01a1K\3\2\2\2\u01a2\u01af\7\4\2\2\u01a3\u01af"+
		"\7\n\2\2\u01a4\u01af\7\f\2\2\u01a5\u01af\7\20\2\2\u01a6\u01a8\7\7\2\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01ab"+
		"\7\22\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01af\7\21\2\2\u01ad\u01af\7\26\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a3"+
		"\3\2\2\2\u01ae\u01a4\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01afM\3\2\2\2\64Z_cltz\177\u0082\u0087\u008c\u0090\u0094"+
		"\u0098\u009e\u00a2\u00ac\u00b6\u00b9\u00bc\u00bf\u00c1\u00c7\u00ca\u00cd"+
		"\u00d1\u00d8\u00db\u00de\u00e5\u00ff\u0108\u010c\u0116\u0121\u012f\u0131"+
		"\u014a\u014c\u0150\u015c\u016a\u016e\u0178\u0185\u018e\u019a\u019e\u01a7"+
		"\u01aa\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}