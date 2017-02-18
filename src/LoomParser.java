// Generated from Loom.g4 by ANTLR 4.6
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
		C=1, TLE=2, STORY=3, START=4, END=5, SECTION=6, CHAPTER=7, FILE=8, PAGE=9, 
		TEXT=10, LINK=11, OPT=12, ARROW=13, NONWSSTR=14, STR=15, UNDRSCORE=16, 
		COLON=17, LBRAK=18, RBRAK=19, LCURL=20, RCURL=21, LPAREN=22, RPAREN=23, 
		BKSLASH=24, QUOTE=25, SPC=26, DOLLAR=27, DOT=28, WS=29, WSPC=30;
	public static final int
		RULE_program = 0, RULE_story = 1, RULE_section_assignment = 2, RULE_sections = 3, 
		RULE_section = 4, RULE_chapter_assignment = 5, RULE_chapters = 6, RULE_chapter = 7, 
		RULE_page_assignment = 8, RULE_pages = 9, RULE_page_links = 10, RULE_page = 11, 
		RULE_text = 12, RULE_option = 13, RULE_title = 14, RULE_link = 15, RULE_component_id = 16, 
		RULE_identifier = 17, RULE_string = 18;
	public static final String[] ruleNames = {
		"program", "story", "section_assignment", "sections", "section", "chapter_assignment", 
		"chapters", "chapter", "page_assignment", "pages", "page_links", "page", 
		"text", "option", "title", "link", "component_id", "identifier", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'C'", "'TITLE'", "'STORY'", "'START'", "'END'", "'SECTION'", "'CHAPTER'", 
		"'FILE'", "'PAGE'", "'TEXT'", "'LINK'", "'OPTION'", "'->'", null, null, 
		"'_'", "':'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'\\'", "'\"'", 
		"' '", "'$'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "C", "TLE", "STORY", "START", "END", "SECTION", "CHAPTER", "FILE", 
		"PAGE", "TEXT", "LINK", "OPT", "ARROW", "NONWSSTR", "STR", "UNDRSCORE", 
		"COLON", "LBRAK", "RBRAK", "LCURL", "RCURL", "LPAREN", "RPAREN", "BKSLASH", 
		"QUOTE", "SPC", "DOLLAR", "DOT", "WS", "WSPC"
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
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public List<ChapterContext> chapter() {
			return getRuleContexts(ChapterContext.class);
		}
		public ChapterContext chapter(int i) {
			return getRuleContext(ChapterContext.class,i);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			story();
			setState(39);
			section();
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				chapter();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAPTER );
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				page();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAGE );
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
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public Section_assignmentContext section_assignment() {
			return getRuleContext(Section_assignmentContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
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
	}

	public final StoryContext story() throws RecognitionException {
		StoryContext _localctx = new StoryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_story);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(STORY);
			setState(51);
			match(LCURL);
			setState(52);
			title();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(53);
				section_assignment();
				}
			}

			setState(56);
			sections();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINK) {
				{
				setState(57);
				link();
				}
			}

			setState(60);
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

	public static class Section_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public Section_assignmentContext section_assignment() {
			return getRuleContext(Section_assignmentContext.class,0);
		}
		public Section_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSection_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSection_assignment(this);
		}
	}

	public final Section_assignmentContext section_assignment() throws RecognitionException {
		Section_assignmentContext _localctx = new Section_assignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			identifier();
			setState(63);
			match(COLON);
			setState(64);
			component_id();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(65);
				section_assignment();
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

	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LoomParser.SECTION, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSections(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SECTION);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(69);
				match(LBRAK);
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				match(RBRAK);
				}
			}

			setState(74);
			match(COLON);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(75);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(76);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECTION) {
				{
				setState(79);
				sections();
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LoomParser.SECTION, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ChaptersContext chapters() {
			return getRuleContext(ChaptersContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public Chapter_assignmentContext chapter_assignment() {
			return getRuleContext(Chapter_assignmentContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
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
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(SECTION);
			setState(83);
			match(LCURL);
			setState(84);
			title();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(85);
				chapter_assignment();
				}
			}

			setState(88);
			chapters();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINK) {
				{
				setState(89);
				link();
				}
			}

			setState(92);
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

	public static class Chapter_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public Chapter_assignmentContext chapter_assignment() {
			return getRuleContext(Chapter_assignmentContext.class,0);
		}
		public Chapter_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapter_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapter_assignment(this);
		}
	}

	public final Chapter_assignmentContext chapter_assignment() throws RecognitionException {
		Chapter_assignmentContext _localctx = new Chapter_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chapter_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			identifier();
			setState(95);
			match(COLON);
			setState(96);
			component_id();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(97);
				chapter_assignment();
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

	public static class ChaptersContext extends ParserRuleContext {
		public TerminalNode CHAPTER() { return getToken(LoomParser.CHAPTER, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public ChaptersContext chapters() {
			return getRuleContext(ChaptersContext.class,0);
		}
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
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
	}

	public final ChaptersContext chapters() throws RecognitionException {
		ChaptersContext _localctx = new ChaptersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chapters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CHAPTER);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(101);
				match(LBRAK);
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				match(RBRAK);
				}
			}

			setState(106);
			match(COLON);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(107);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(108);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAPTER) {
				{
				setState(111);
				chapters();
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

	public static class ChapterContext extends ParserRuleContext {
		public TerminalNode CHAPTER() { return getToken(LoomParser.CHAPTER, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public Page_assignmentContext page_assignment() {
			return getRuleContext(Page_assignmentContext.class,0);
		}
		public List<PagesContext> pages() {
			return getRuleContexts(PagesContext.class);
		}
		public PagesContext pages(int i) {
			return getRuleContext(PagesContext.class,i);
		}
		public List<Page_linksContext> page_links() {
			return getRuleContexts(Page_linksContext.class);
		}
		public Page_linksContext page_links(int i) {
			return getRuleContext(Page_linksContext.class,i);
		}
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
	}

	public final ChapterContext chapter() throws RecognitionException {
		ChapterContext _localctx = new ChapterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chapter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CHAPTER);
			setState(115);
			match(LCURL);
			setState(116);
			title();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(117);
				page_assignment();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE) {
				{
				{
				setState(120);
				pages();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINK) {
				{
				{
				setState(126);
				page_links();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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

	public static class Page_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public Page_assignmentContext page_assignment() {
			return getRuleContext(Page_assignmentContext.class,0);
		}
		public Page_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterPage_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitPage_assignment(this);
		}
	}

	public final Page_assignmentContext page_assignment() throws RecognitionException {
		Page_assignmentContext _localctx = new Page_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_page_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			identifier();
			setState(135);
			match(COLON);
			setState(136);
			component_id();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(137);
				page_assignment();
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

	public static class PagesContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(LoomParser.PAGE, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
		public PagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterPages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitPages(this);
		}
	}

	public final PagesContext pages() throws RecognitionException {
		PagesContext _localctx = new PagesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PAGE);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(141);
				match(LBRAK);
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(RBRAK);
				}
			}

			setState(146);
			match(COLON);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(147);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(148);
				identifier();
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

	public static class Page_linksContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public List<TerminalNode> LBRAK() { return getTokens(LoomParser.LBRAK); }
		public TerminalNode LBRAK(int i) {
			return getToken(LoomParser.LBRAK, i);
		}
		public TerminalNode DOT() { return getToken(LoomParser.DOT, 0); }
		public List<TerminalNode> RBRAK() { return getTokens(LoomParser.RBRAK); }
		public TerminalNode RBRAK(int i) {
			return getToken(LoomParser.RBRAK, i);
		}
		public List<Component_idContext> component_id() {
			return getRuleContexts(Component_idContext.class);
		}
		public Component_idContext component_id(int i) {
			return getRuleContext(Component_idContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Page_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterPage_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitPage_links(this);
		}
	}

	public final Page_linksContext page_links() throws RecognitionException {
		Page_linksContext _localctx = new Page_linksContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_page_links);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LINK);
			setState(152);
			match(LBRAK);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(153);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(154);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			match(DOT);
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(158);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(159);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			match(RBRAK);
			setState(163);
			match(LBRAK);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(164);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(165);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(LoomParser.PAGE, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PAGE);
			setState(171);
			match(LCURL);
			setState(172);
			title();
			setState(173);
			text();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPT) {
				{
				setState(174);
				option();
				}
			}

			setState(177);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LoomParser.TEXT, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TEXT);
			setState(180);
			match(COLON);
			setState(181);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OPT() { return getToken(LoomParser.OPT, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OPT);
			setState(184);
			match(LBRAK);
			setState(185);
			component_id();
			setState(186);
			match(RBRAK);
			setState(187);
			match(COLON);
			setState(188);
			string();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPT) {
				{
				setState(189);
				option();
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TLE() { return getToken(LoomParser.TLE, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
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
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(TLE);
			setState(193);
			match(COLON);
			setState(194);
			string();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(195);
				match(LBRAK);
				setState(196);
				component_id();
				setState(197);
				match(RBRAK);
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode ARROW() { return getToken(LoomParser.ARROW, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public List<Component_idContext> component_id() {
			return getRuleContexts(Component_idContext.class);
		}
		public Component_idContext component_id(int i) {
			return getRuleContext(Component_idContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LINK);
			setState(202);
			match(LBRAK);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(203);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(204);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(207);
			match(ARROW);
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(208);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(209);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			match(RBRAK);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINK) {
				{
				setState(213);
				link();
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

	public static class Component_idContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(LoomParser.DOLLAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Component_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterComponent_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitComponent_id(this);
		}
	}

	public final Component_idContext component_id() throws RecognitionException {
		Component_idContext _localctx = new Component_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_component_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DOLLAR);
			setState(217);
			identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NONWSSTR() { return getToken(LoomParser.NONWSSTR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(LoomParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LoomParser.QUOTE, i);
		}
		public TerminalNode STR() { return getToken(LoomParser.STR, 0); }
		public TerminalNode NONWSSTR() { return getToken(LoomParser.NONWSSTR, 0); }
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(QUOTE);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==NONWSSTR || _la==STR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(QUOTE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\6\2\61\n\2\r\2"+
		"\16\2\62\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\5\5P\n\5\3\5\5\5S\n"+
		"\5\3\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\7e\n\7\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\5\bp\n\b\3\b\5\bs\n\b\3\t"+
		"\3\t\3\t\3\t\5\ty\n\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\7\t\u0082\n\t"+
		"\f\t\16\t\u0085\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0093\n\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u009e\n\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\f\3\f\3\f\3\f\5\f\u00a9\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21\3\21\5\21\u00d0\n"+
		"\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\21\3\21\5\21\u00d9\n\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\4\3\2\6\7\3\2\20\21\u00ed\2(\3\2\2\2\4\64\3\2\2"+
		"\2\6@\3\2\2\2\bF\3\2\2\2\nT\3\2\2\2\f`\3\2\2\2\16f\3\2\2\2\20t\3\2\2\2"+
		"\22\u0088\3\2\2\2\24\u008e\3\2\2\2\26\u0099\3\2\2\2\30\u00ac\3\2\2\2\32"+
		"\u00b5\3\2\2\2\34\u00b9\3\2\2\2\36\u00c2\3\2\2\2 \u00cb\3\2\2\2\"\u00da"+
		"\3\2\2\2$\u00dd\3\2\2\2&\u00df\3\2\2\2()\5\4\3\2)+\5\n\6\2*,\5\20\t\2"+
		"+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\30\r\2\60/"+
		"\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\65"+
		"\7\5\2\2\65\66\7\26\2\2\668\5\36\20\2\679\5\6\4\28\67\3\2\2\289\3\2\2"+
		"\29:\3\2\2\2:<\5\b\5\2;=\5 \21\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\27"+
		"\2\2?\5\3\2\2\2@A\5$\23\2AB\7\23\2\2BD\5\"\22\2CE\5\6\4\2DC\3\2\2\2DE"+
		"\3\2\2\2E\7\3\2\2\2FJ\7\b\2\2GH\7\24\2\2HI\t\2\2\2IK\7\25\2\2JG\3\2\2"+
		"\2JK\3\2\2\2KL\3\2\2\2LO\7\23\2\2MP\5\"\22\2NP\5$\23\2OM\3\2\2\2ON\3\2"+
		"\2\2PR\3\2\2\2QS\5\b\5\2RQ\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TU\7\b\2\2UV\7"+
		"\26\2\2VX\5\36\20\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\5\16\b"+
		"\2[]\5 \21\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\27\2\2_\13\3\2\2\2`a"+
		"\5$\23\2ab\7\23\2\2bd\5\"\22\2ce\5\f\7\2dc\3\2\2\2de\3\2\2\2e\r\3\2\2"+
		"\2fj\7\t\2\2gh\7\24\2\2hi\t\2\2\2ik\7\25\2\2jg\3\2\2\2jk\3\2\2\2kl\3\2"+
		"\2\2lo\7\23\2\2mp\5\"\22\2np\5$\23\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs\5"+
		"\16\b\2rq\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tu\7\t\2\2uv\7\26\2\2vx\5\36\20"+
		"\2wy\5\22\n\2xw\3\2\2\2xy\3\2\2\2y}\3\2\2\2z|\5\24\13\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0083\3\2\2\2\177}\3\2\2\2\u0080\u0082\5"+
		"\26\f\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\27"+
		"\2\2\u0087\21\3\2\2\2\u0088\u0089\5$\23\2\u0089\u008a\7\23\2\2\u008a\u008c"+
		"\5\"\22\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\23\3\2\2\2\u008e\u0092\7\13\2\2\u008f\u0090\7\24\2\2\u0090\u0091"+
		"\t\2\2\2\u0091\u0093\7\25\2\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\7\23\2\2\u0095\u0098\5\"\22\2\u0096\u0098"+
		"\5$\23\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u009a\7\r\2\2\u009a\u009d\7\24\2\2\u009b\u009e\5\"\22\2\u009c\u009e\5"+
		"$\23\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\7\36\2\2\u00a0\u00a3\5\"\22\2\u00a1\u00a3\5$\23\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a8\7\24\2\2\u00a6\u00a9\5\"\22\2\u00a7\u00a9\5$\23\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\25\2\2\u00ab"+
		"\27\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\5\36"+
		"\20\2\u00af\u00b1\5\32\16\2\u00b0\u00b2\5\34\17\2\u00b1\u00b0\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\27\2\2\u00b4\31"+
		"\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\5&\24\2"+
		"\u00b8\33\3\2\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00bc"+
		"\5\"\22\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7\23\2\2\u00be\u00c0\5&\24"+
		"\2\u00bf\u00c1\5\34\17\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\35\3\2\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\7\23\2\2\u00c4\u00c9\5&\24"+
		"\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7\25\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2"+
		"\2\u00cb\u00cc\7\r\2\2\u00cc\u00cf\7\24\2\2\u00cd\u00d0\5\"\22\2\u00ce"+
		"\u00d0\5$\23\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d4\7\17\2\2\u00d2\u00d5\5\"\22\2\u00d3\u00d5\5$\23\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\25"+
		"\2\2\u00d7\u00d9\5 \21\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"!\3\2\2\2\u00da\u00db\7\35\2\2\u00db\u00dc\5$\23\2\u00dc#\3\2\2\2\u00dd"+
		"\u00de\7\20\2\2\u00de%\3\2\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e1\t\3\2"+
		"\2\u00e1\u00e2\7\33\2\2\u00e2\'\3\2\2\2\37-\628<DJORX\\djorx}\u0083\u008c"+
		"\u0092\u0097\u009d\u00a2\u00a8\u00b1\u00c0\u00c9\u00cf\u00d4\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}