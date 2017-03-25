// Generated from Loom2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Loom2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEC_IDENT=1, KEY_IDENT=2, TIME_IDENT=3, DOLLAR=4, COLON=5, QUOTE=6, RBRAK=7, 
		LBRAK=8, RCURL=9, LCURL=10, ARROW=11, CHAPTER=12, CHAPT=13, DOT=14, END=15, 
		ENDIF=16, IF=17, LINK=18, OPTION=19, PAGE=20, PG=21, SECTION=22, SEC=23, 
		START=24, STORY=25, TEXT=26, TITLE=27, SEMICOLON=28, UNDERSCORE=29, NONWSSTR=30, 
		STRING=31, WS=32;
	public static final int
		RULE_program = 0, RULE_sections = 1, RULE_statements = 2, RULE_title = 3, 
		RULE_definition = 4, RULE_assignment = 5, RULE_link = 6, RULE_if_statement = 7, 
		RULE_component_id = 8, RULE_reference = 9;
	public static final String[] ruleNames = {
		"program", "sections", "statements", "title", "definition", "assignment", 
		"link", "if_statement", "component_id", "reference"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'$'", "':'", "'\"'", "'['", "']'", "'{'", "'}'", 
		"'->'", "'CHAPTER'", "'CHAPT'", "'.'", "'END'", "'ENDIF'", "'IF'", "'LINK'", 
		"'OPTION'", "'PAGE'", "'PG'", "'SECTION'", "'SEC'", "'START'", "'STORY'", 
		"'TEXT'", "'TITLE'", "';'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEC_IDENT", "KEY_IDENT", "TIME_IDENT", "DOLLAR", "COLON", "QUOTE", 
		"RBRAK", "LBRAK", "RCURL", "LCURL", "ARROW", "CHAPTER", "CHAPT", "DOT", 
		"END", "ENDIF", "IF", "LINK", "OPTION", "PAGE", "PG", "SECTION", "SEC", 
		"START", "STORY", "TEXT", "TITLE", "SEMICOLON", "UNDERSCORE", "NONWSSTR", 
		"STRING", "WS"
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
	public String getGrammarFileName() { return "Loom2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Loom2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<SectionsContext> sections() {
			return getRuleContexts(SectionsContext.class);
		}
		public SectionsContext sections(int i) {
			return getRuleContext(SectionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				sections();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEC_IDENT );
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

	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode SEC_IDENT() { return getToken(Loom2Parser.SEC_IDENT, 0); }
		public TerminalNode RCURL() { return getToken(Loom2Parser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(Loom2Parser.LCURL, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(SEC_IDENT);
			setState(26);
			match(RCURL);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_IDENT) | (1L << IF) | (1L << LINK) | (1L << TITLE) | (1L << NONWSSTR))) != 0)) {
				{
				{
				setState(27);
				statements();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(LCURL);
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

	public static class StatementsContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				title();
				}
				break;
			case KEY_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				definition();
				}
				break;
			case NONWSSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				assignment();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				link();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				if_statement();
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(Loom2Parser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(Loom2Parser.COLON, 0); }
		public TerminalNode STRING() { return getToken(Loom2Parser.STRING, 0); }
		public TerminalNode RBRAK() { return getToken(Loom2Parser.RBRAK, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(Loom2Parser.LBRAK, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TITLE);
			setState(43);
			match(COLON);
			setState(44);
			match(STRING);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRAK) {
				{
				setState(45);
				match(RBRAK);
				setState(46);
				component_id();
				setState(47);
				match(LBRAK);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode KEY_IDENT() { return getToken(Loom2Parser.KEY_IDENT, 0); }
		public TerminalNode COLON() { return getToken(Loom2Parser.COLON, 0); }
		public List<Component_idContext> component_id() {
			return getRuleContexts(Component_idContext.class);
		}
		public Component_idContext component_id(int i) {
			return getRuleContext(Component_idContext.class,i);
		}
		public TerminalNode NONWSSTR() { return getToken(Loom2Parser.NONWSSTR, 0); }
		public TerminalNode STRING() { return getToken(Loom2Parser.STRING, 0); }
		public TerminalNode RBRAK() { return getToken(Loom2Parser.RBRAK, 0); }
		public TerminalNode LBRAK() { return getToken(Loom2Parser.LBRAK, 0); }
		public TerminalNode TIME_IDENT() { return getToken(Loom2Parser.TIME_IDENT, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(KEY_IDENT);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRAK) {
				{
				setState(52);
				match(RBRAK);
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME_IDENT:
					{
					setState(53);
					match(TIME_IDENT);
					}
					break;
				case DOLLAR:
					{
					setState(54);
					component_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57);
				match(LBRAK);
				}
			}

			setState(60);
			match(COLON);
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(61);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(62);
				match(NONWSSTR);
				}
				break;
			case STRING:
				{
				setState(63);
				match(STRING);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NONWSSTR() { return getToken(Loom2Parser.NONWSSTR, 0); }
		public TerminalNode COLON() { return getToken(Loom2Parser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NONWSSTR);
			setState(67);
			match(COLON);
			setState(68);
			component_id();
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(Loom2Parser.LINK, 0); }
		public List<TerminalNode> RBRAK() { return getTokens(Loom2Parser.RBRAK); }
		public TerminalNode RBRAK(int i) {
			return getToken(Loom2Parser.RBRAK, i);
		}
		public TerminalNode ARROW() { return getToken(Loom2Parser.ARROW, 0); }
		public List<TerminalNode> LBRAK() { return getTokens(Loom2Parser.LBRAK); }
		public TerminalNode LBRAK(int i) {
			return getToken(Loom2Parser.LBRAK, i);
		}
		public List<Component_idContext> component_id() {
			return getRuleContexts(Component_idContext.class);
		}
		public Component_idContext component_id(int i) {
			return getRuleContext(Component_idContext.class,i);
		}
		public List<TerminalNode> NONWSSTR() { return getTokens(Loom2Parser.NONWSSTR); }
		public TerminalNode NONWSSTR(int i) {
			return getToken(Loom2Parser.NONWSSTR, i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_link);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LINK);
				setState(71);
				match(RBRAK);
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOLLAR:
					{
					setState(72);
					component_id();
					}
					break;
				case NONWSSTR:
					{
					setState(73);
					match(NONWSSTR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76);
				match(ARROW);
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOLLAR:
					{
					setState(77);
					component_id();
					}
					break;
				case NONWSSTR:
					{
					setState(78);
					match(NONWSSTR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81);
				match(LBRAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(LINK);
				setState(83);
				match(RBRAK);
				setState(84);
				reference();
				setState(85);
				match(LBRAK);
				setState(86);
				match(RBRAK);
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONWSSTR:
					{
					setState(87);
					match(NONWSSTR);
					}
					break;
				case DOLLAR:
					{
					setState(88);
					component_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91);
				match(LBRAK);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Loom2Parser.IF, 0); }
		public TerminalNode RBRAK() { return getToken(Loom2Parser.RBRAK, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(Loom2Parser.LBRAK, 0); }
		public TerminalNode COLON() { return getToken(Loom2Parser.COLON, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(Loom2Parser.ENDIF, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IF);
			setState(96);
			match(RBRAK);
			setState(97);
			reference();
			setState(98);
			match(LBRAK);
			setState(99);
			match(COLON);
			setState(100);
			definition();
			setState(101);
			match(ENDIF);
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

	public static class Component_idContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(Loom2Parser.DOLLAR, 0); }
		public TerminalNode NONWSSTR() { return getToken(Loom2Parser.NONWSSTR, 0); }
		public Component_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitComponent_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_idContext component_id() throws RecognitionException {
		Component_idContext _localctx = new Component_idContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_component_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DOLLAR);
			setState(104);
			match(NONWSSTR);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode NONWSSTR() { return getToken(Loom2Parser.NONWSSTR, 0); }
		public TerminalNode DOT() { return getToken(Loom2Parser.DOT, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Loom2Visitor ) return ((Loom2Visitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(NONWSSTR);
			setState(107);
			match(DOT);
			setState(108);
			component_id();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\6\3\6\3\6\3\6\5\6:\n\6\3\6\5\6=\n\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\5\bR\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\2u\2\27\3\2\2\2\4\33\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n\65\3\2\2"+
		"\2\fD\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22i\3\2\2\2\24l\3\2\2\2\26\30\5"+
		"\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3"+
		"\2\2\2\33\34\7\3\2\2\34 \7\13\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\f\2\2$\5\3\2\2\2%"+
		"+\5\b\5\2&+\5\n\6\2\'+\5\f\7\2(+\5\16\b\2)+\5\20\t\2*%\3\2\2\2*&\3\2\2"+
		"\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\7\3\2\2\2,-\7\35\2\2-.\7\7\2\2.\63"+
		"\7!\2\2/\60\7\t\2\2\60\61\5\22\n\2\61\62\7\n\2\2\62\64\3\2\2\2\63/\3\2"+
		"\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65<\7\4\2\2\669\7\t\2\2\67:\7\5\2\28:"+
		"\5\22\n\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;=\7\n\2\2<\66\3\2\2\2<=\3\2"+
		"\2\2=>\3\2\2\2>B\7\7\2\2?C\5\22\n\2@C\7 \2\2AC\7!\2\2B?\3\2\2\2B@\3\2"+
		"\2\2BA\3\2\2\2C\13\3\2\2\2DE\7 \2\2EF\7\7\2\2FG\5\22\n\2G\r\3\2\2\2HI"+
		"\7\24\2\2IL\7\t\2\2JM\5\22\n\2KM\7 \2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2"+
		"NQ\7\r\2\2OR\5\22\n\2PR\7 \2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2S`\7\n\2\2"+
		"TU\7\24\2\2UV\7\t\2\2VW\5\24\13\2WX\7\n\2\2X[\7\t\2\2Y\\\7 \2\2Z\\\5\22"+
		"\n\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\n\2\2^`\3\2\2\2_H\3\2\2\2_T\3"+
		"\2\2\2`\17\3\2\2\2ab\7\23\2\2bc\7\t\2\2cd\5\24\13\2de\7\n\2\2ef\7\7\2"+
		"\2fg\5\n\6\2gh\7\22\2\2h\21\3\2\2\2ij\7\6\2\2jk\7 \2\2k\23\3\2\2\2lm\7"+
		" \2\2mn\7\20\2\2no\5\22\n\2o\25\3\2\2\2\r\31 *\639<BLQ[_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}