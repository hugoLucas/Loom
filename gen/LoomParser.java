// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, C=2, STORY=3, START=4, CHAPTER=5, LINK=6, ARROW=7, STR=8, COLON=9, 
		LBRAK=10, RBRAK=11, LCURL=12, RCURL=13, BKSLASH=14;
	public static final int
		RULE_program = 0, RULE_story = 1, RULE_title = 2, RULE_assignment = 3, 
		RULE_chapters = 4, RULE_file = 5, RULE_links = 6, RULE_chapter = 7, RULE_section = 8, 
		RULE_string = 9;
	public static final String[] ruleNames = {
		"program", "story", "title", "assignment", "chapters", "file", "links", 
		"chapter", "section", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'C'", "'STORY'", "'START'", "'CHAPTER'", "'LINK'", "'->'", 
		null, "':'", "'['", "']'", "'{'", "'}'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "C", "STORY", "START", "CHAPTER", "LINK", "ARROW", "STR", 
		"COLON", "LBRAK", "RBRAK", "LCURL", "RCURL", "BKSLASH"
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
	public String getGrammarFileName() { return "Loom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LoomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StoryContext story() {
			return getRuleContext(StoryContext.class,0);
		}
		public ChapterContext chapter() {
			return getRuleContext(ChapterContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20);
				story();
				}
				break;
			case 2:
				{
				setState(21);
				chapter();
				}
				break;
			case 3:
				{
				setState(22);
				section();
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

	public static class StoryContext extends ParserRuleContext {
		public TerminalNode STORY() { return getToken(LoomParser.STORY, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ChaptersContext chapters() {
			return getRuleContext(ChaptersContext.class,0);
		}
		public LinksContext links() {
			return getRuleContext(LinksContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public StoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_story; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterStory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitStory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitStory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoryContext story() throws RecognitionException {
		StoryContext _localctx = new StoryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_story);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(STORY);
			setState(26);
			match(COLON);
			setState(27);
			match(LCURL);
			setState(28);
			title();
			setState(29);
			assignment();
			setState(30);
			chapters();
			setState(31);
			links();
			setState(32);
			match(RCURL);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			string();
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
		public TerminalNode STR() { return getToken(LoomParser.STR, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(STR);
			setState(37);
			match(COLON);
			setState(38);
			file();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					assignment();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ChaptersContext extends ParserRuleContext {
		public List<TerminalNode> CHAPTER() { return getTokens(LoomParser.CHAPTER); }
		public TerminalNode CHAPTER(int i) {
			return getToken(LoomParser.CHAPTER, i);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public ChaptersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitChapters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChaptersContext chapters() throws RecognitionException {
		ChaptersContext _localctx = new ChaptersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chapters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CHAPTER);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(46);
				match(LBRAK);
				setState(47);
				match(START);
				setState(48);
				match(RBRAK);
				}
			}

			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(51);
				file();
				}
				break;
			case STR:
				{
				setState(52);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAPTER) {
				{
				{
				setState(55);
				match(CHAPTER);
				}
				}
				setState(60);
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(LoomParser.C, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public List<TerminalNode> BKSLASH() { return getTokens(LoomParser.BKSLASH); }
		public TerminalNode BKSLASH(int i) {
			return getToken(LoomParser.BKSLASH, i);
		}
		public TerminalNode STR() { return getToken(LoomParser.STR, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(C);
			setState(62);
			match(COLON);
			setState(63);
			match(BKSLASH);
			{
			setState(64);
			match(STR);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BKSLASH) {
				{
				{
				setState(65);
				match(BKSLASH);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LinksContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode ARROW() { return getToken(LoomParser.ARROW, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public LinksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitLinks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinksContext links() throws RecognitionException {
		LinksContext _localctx = new LinksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_links);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LINK);
			setState(72);
			match(LBRAK);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(73);
				file();
				}
				break;
			case STR:
				{
				setState(74);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			match(ARROW);
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(78);
				file();
				}
				break;
			case STR:
				{
				setState(79);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			match(RBRAK);
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

	public static class ChapterContext extends ParserRuleContext {
		public ChapterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitChapter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChapterContext chapter() throws RecognitionException {
		ChapterContext _localctx = new ChapterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chapter);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(LoomParser.STR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoomVisitor ) return ((LoomVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(STR);
			setState(90);
			match(T__0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\6\3\6\5\6\64\n\6\3\6\3"+
		"\6\5\68\n\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7\7\7E\n\7\f"+
		"\7\16\7H\13\7\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\2]\2\31\3\2\2\2\4\33\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n/\3\2\2\2\f?\3"+
		"\2\2\2\16I\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26\32\5\4\3\2\27"+
		"\32\5\20\t\2\30\32\5\22\n\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2"+
		"\32\3\3\2\2\2\33\34\7\5\2\2\34\35\7\13\2\2\35\36\7\16\2\2\36\37\5\6\4"+
		"\2\37 \5\b\5\2 !\5\n\6\2!\"\5\16\b\2\"#\7\17\2\2#\5\3\2\2\2$%\5\24\13"+
		"\2%\7\3\2\2\2&\'\7\n\2\2\'(\7\13\2\2(,\5\f\7\2)+\5\b\5\2*)\3\2\2\2+.\3"+
		"\2\2\2,*\3\2\2\2,-\3\2\2\2-\t\3\2\2\2.,\3\2\2\2/\63\7\7\2\2\60\61\7\f"+
		"\2\2\61\62\7\6\2\2\62\64\7\r\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64\67\3\2"+
		"\2\2\658\5\f\7\2\668\5\b\5\2\67\65\3\2\2\2\67\66\3\2\2\28<\3\2\2\29;\7"+
		"\7\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3\2\2\2?"+
		"@\7\4\2\2@A\7\13\2\2AB\7\20\2\2BF\7\n\2\2CE\7\20\2\2DC\3\2\2\2EH\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2G\r\3\2\2\2HF\3\2\2\2IJ\7\b\2\2JM\7\f\2\2KN\5\f"+
		"\7\2LN\5\b\5\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OR\7\t\2\2PS\5\f\7\2QS\5\b"+
		"\5\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TU\7\r\2\2U\17\3\2\2\2VW\3\2\2\2W\21"+
		"\3\2\2\2XY\3\2\2\2Y\23\3\2\2\2Z[\7\3\2\2[\\\7\n\2\2\\]\7\3\2\2]\25\3\2"+
		"\2\2\n\31,\63\67<FMR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}