// Generated from Stock.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StockParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STR=1, INT=2, WS=3, START=4, PERIOD=5, PICK=6, SYM=7, BUY=8, SELL=9, HEDGE=10, 
		PUT=11, CALL=12, STRIKE=13, PRICE=14, WHEN=15, OPEN=16, HIGH=17, LOW=18, 
		CLOSE=19, COLON=20, COMMA=21, QUOTE=22, LCURL=23, RCURL=24, FRWSLASH=25, 
		LESS=26, LEQ=27, GREAT=28, GREQ=29, EQ=30;
	public static final int
		RULE_program = 0, RULE_period = 1, RULE_assignments = 2, RULE_picks = 3, 
		RULE_pick = 4, RULE_symbol = 5, RULE_buy = 6, RULE_sell = 7, RULE_hedge = 8, 
		RULE_option = 9, RULE_strike = 10, RULE_condition = 11, RULE_attribute = 12, 
		RULE_logical = 13, RULE_date = 14, RULE_string = 15, RULE_identifier = 16;
	public static final String[] ruleNames = {
		"program", "period", "assignments", "picks", "pick", "symbol", "buy", 
		"sell", "hedge", "option", "strike", "condition", "attribute", "logical", 
		"date", "string", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'START'", "'PERIOD'", "'PICK'", "'SYM'", "'BUY'", 
		"'SELL'", "'HEDGE'", "'PUT'", "'CALL'", "'STRIKE'", "'PRICE'", "'WHEN'", 
		"'OPEN'", "'HIGH'", "'LOW'", "'CLOSE'", "':'", "','", "'\"'", "'{'", "'}'", 
		"'/'", "'<'", "'<='", "'>'", "'>='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STR", "INT", "WS", "START", "PERIOD", "PICK", "SYM", "BUY", "SELL", 
		"HEDGE", "PUT", "CALL", "STRIKE", "PRICE", "WHEN", "OPEN", "HIGH", "LOW", 
		"CLOSE", "COLON", "COMMA", "QUOTE", "LCURL", "RCURL", "FRWSLASH", "LESS", 
		"LEQ", "GREAT", "GREQ", "EQ"
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
	public String getGrammarFileName() { return "Stock.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StockParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(StockParser.START, 0); }
		public TerminalNode LCURL() { return getToken(StockParser.LCURL, 0); }
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public PicksContext picks() {
			return getRuleContext(PicksContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(StockParser.RCURL, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(START);
			setState(35);
			match(LCURL);
			setState(36);
			period();
			setState(37);
			assignments();
			setState(38);
			picks();
			setState(39);
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

	public static class PeriodContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(StockParser.PERIOD, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(StockParser.COMMA, 0); }
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitPeriod(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PERIOD);
			setState(42);
			match(COLON);
			setState(43);
			date();
			setState(44);
			match(COMMA);
			setState(45);
			date();
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

	public static class AssignmentsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public TerminalNode INT() { return getToken(StockParser.INT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<AssignmentsContext> assignments() {
			return getRuleContexts(AssignmentsContext.class);
		}
		public AssignmentsContext assignments(int i) {
			return getRuleContext(AssignmentsContext.class,i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitAssignments(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			identifier();
			setState(48);
			match(COLON);
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(49);
				match(INT);
				}
				break;
			case QUOTE:
				{
				setState(50);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					assignments();
					}
					} 
				}
				setState(58);
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

	public static class PicksContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(StockParser.PICK, 0); }
		public TerminalNode LCURL() { return getToken(StockParser.LCURL, 0); }
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(StockParser.RCURL, 0); }
		public List<PicksContext> picks() {
			return getRuleContexts(PicksContext.class);
		}
		public PicksContext picks(int i) {
			return getRuleContext(PicksContext.class,i);
		}
		public PicksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterPicks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitPicks(this);
		}
	}

	public final PicksContext picks() throws RecognitionException {
		PicksContext _localctx = new PicksContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_picks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(PICK);
			setState(60);
			match(LCURL);
			setState(61);
			pick();
			setState(62);
			match(RCURL);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					picks();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class PickContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public BuyContext buy() {
			return getRuleContext(BuyContext.class,0);
		}
		public SellContext sell() {
			return getRuleContext(SellContext.class,0);
		}
		public HedgeContext hedge() {
			return getRuleContext(HedgeContext.class,0);
		}
		public PickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitPick(this);
		}
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			symbol();
			setState(70);
			buy();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELL) {
				{
				setState(71);
				sell();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEDGE) {
				{
				setState(74);
				hedge();
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode SYM() { return getToken(StockParser.SYM, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SYM);
			setState(78);
			match(COLON);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				{
				setState(79);
				string();
				}
				break;
			case STR:
				{
				setState(80);
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

	public static class BuyContext extends ParserRuleContext {
		public TerminalNode BUY() { return getToken(StockParser.BUY, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public TerminalNode INT() { return getToken(StockParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BuyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterBuy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitBuy(this);
		}
	}

	public final BuyContext buy() throws RecognitionException {
		BuyContext _localctx = new BuyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BUY);
			setState(84);
			match(COLON);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(85);
				match(INT);
				}
				break;
			case STR:
				{
				setState(86);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(89);
				condition();
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

	public static class SellContext extends ParserRuleContext {
		public TerminalNode SELL() { return getToken(StockParser.SELL, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public TerminalNode INT() { return getToken(StockParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSell(this);
		}
	}

	public final SellContext sell() throws RecognitionException {
		SellContext _localctx = new SellContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SELL);
			setState(93);
			match(COLON);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(94);
				match(INT);
				}
				break;
			case STR:
				{
				setState(95);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(98);
				condition();
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

	public static class HedgeContext extends ParserRuleContext {
		public TerminalNode HEDGE() { return getToken(StockParser.HEDGE, 0); }
		public TerminalNode LCURL() { return getToken(StockParser.LCURL, 0); }
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public BuyContext buy() {
			return getRuleContext(BuyContext.class,0);
		}
		public StrikeContext strike() {
			return getRuleContext(StrikeContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(StockParser.RCURL, 0); }
		public HedgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterHedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitHedge(this);
		}
	}

	public final HedgeContext hedge() throws RecognitionException {
		HedgeContext _localctx = new HedgeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hedge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(HEDGE);
			setState(102);
			match(LCURL);
			setState(103);
			option();
			setState(104);
			buy();
			setState(105);
			strike();
			setState(106);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(StockParser.PUT, 0); }
		public TerminalNode CALL() { return getToken(StockParser.CALL, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==PUT || _la==CALL) ) {
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

	public static class StrikeContext extends ParserRuleContext {
		public TerminalNode STRIKE() { return getToken(StockParser.STRIKE, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public TerminalNode INT() { return getToken(StockParser.INT, 0); }
		public TerminalNode PRICE() { return getToken(StockParser.PRICE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StrikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterStrike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitStrike(this);
		}
	}

	public final StrikeContext strike() throws RecognitionException {
		StrikeContext _localctx = new StrikeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRIKE);
			setState(111);
			match(COLON);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(112);
				match(INT);
				}
				break;
			case PRICE:
				{
				setState(113);
				match(PRICE);
				}
				break;
			case STR:
				{
				setState(114);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(StockParser.WHEN, 0); }
		public TerminalNode COLON() { return getToken(StockParser.COLON, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode INT() { return getToken(StockParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHEN);
			setState(118);
			match(COLON);
			setState(119);
			attribute();
			setState(120);
			logical();
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(121);
				match(INT);
				}
				break;
			case STR:
				{
				setState(122);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(StockParser.OPEN, 0); }
		public TerminalNode HIGH() { return getToken(StockParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(StockParser.LOW, 0); }
		public TerminalNode CLOSE() { return getToken(StockParser.CLOSE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN) | (1L << HIGH) | (1L << LOW) | (1L << CLOSE))) != 0)) ) {
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

	public static class LogicalContext extends ParserRuleContext {
		public TerminalNode GREAT() { return getToken(StockParser.GREAT, 0); }
		public TerminalNode GREQ() { return getToken(StockParser.GREQ, 0); }
		public TerminalNode LESS() { return getToken(StockParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(StockParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(StockParser.EQ, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitLogical(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LEQ) | (1L << GREAT) | (1L << GREQ) | (1L << EQ))) != 0)) ) {
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(StockParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(StockParser.INT, i);
		}
		public List<TerminalNode> FRWSLASH() { return getTokens(StockParser.FRWSLASH); }
		public TerminalNode FRWSLASH(int i) {
			return getToken(StockParser.FRWSLASH, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(INT);
			setState(130);
			match(FRWSLASH);
			setState(131);
			match(INT);
			setState(132);
			match(FRWSLASH);
			setState(133);
			match(INT);
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
		public List<TerminalNode> QUOTE() { return getTokens(StockParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(StockParser.QUOTE, i);
		}
		public TerminalNode STR() { return getToken(StockParser.STR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(QUOTE);
			setState(136);
			match(STR);
			setState(137);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(StockParser.STR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0090\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5"+
		"\16\5F\13\5\3\6\3\6\3\6\5\6K\n\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\5\tc\n\t\3\t\5"+
		"\tf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"v\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\r\16\3\2\22\25\3\2\34 \u008b"+
		"\2$\3\2\2\2\4+\3\2\2\2\6\61\3\2\2\2\b=\3\2\2\2\nG\3\2\2\2\fO\3\2\2\2\16"+
		"U\3\2\2\2\20^\3\2\2\2\22g\3\2\2\2\24n\3\2\2\2\26p\3\2\2\2\30w\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2 \u0089\3\2\2\2\"\u008d"+
		"\3\2\2\2$%\7\6\2\2%&\7\31\2\2&\'\5\4\3\2\'(\5\6\4\2()\5\b\5\2)*\7\32\2"+
		"\2*\3\3\2\2\2+,\7\7\2\2,-\7\26\2\2-.\5\36\20\2./\7\27\2\2/\60\5\36\20"+
		"\2\60\5\3\2\2\2\61\62\5\"\22\2\62\65\7\26\2\2\63\66\7\4\2\2\64\66\5 \21"+
		"\2\65\63\3\2\2\2\65\64\3\2\2\2\66:\3\2\2\2\679\5\6\4\28\67\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2\2=>\7\b\2\2>?\7\31\2\2?"+
		"@\5\n\6\2@D\7\32\2\2AC\5\b\5\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"E\t\3\2\2\2FD\3\2\2\2GH\5\f\7\2HJ\5\16\b\2IK\5\20\t\2JI\3\2\2\2JK\3\2"+
		"\2\2KM\3\2\2\2LN\5\22\n\2ML\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OP\7\t\2\2PS"+
		"\7\26\2\2QT\5 \21\2RT\5\"\22\2SQ\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\7\n\2"+
		"\2VY\7\26\2\2WZ\7\4\2\2XZ\5\"\22\2YW\3\2\2\2YX\3\2\2\2Z\\\3\2\2\2[]\5"+
		"\30\r\2\\[\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^_\7\13\2\2_b\7\26\2\2`c\7\4"+
		"\2\2ac\5\"\22\2b`\3\2\2\2ba\3\2\2\2ce\3\2\2\2df\5\30\r\2ed\3\2\2\2ef\3"+
		"\2\2\2f\21\3\2\2\2gh\7\f\2\2hi\7\31\2\2ij\5\24\13\2jk\5\16\b\2kl\5\26"+
		"\f\2lm\7\32\2\2m\23\3\2\2\2no\t\2\2\2o\25\3\2\2\2pq\7\17\2\2qu\7\26\2"+
		"\2rv\7\4\2\2sv\7\20\2\2tv\5\"\22\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\27\3"+
		"\2\2\2wx\7\21\2\2xy\7\26\2\2yz\5\32\16\2z}\5\34\17\2{~\7\4\2\2|~\5\"\22"+
		"\2}{\3\2\2\2}|\3\2\2\2~\31\3\2\2\2\177\u0080\t\3\2\2\u0080\33\3\2\2\2"+
		"\u0081\u0082\t\4\2\2\u0082\35\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0085"+
		"\7\33\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\33\2\2\u0087\u0088\7\4\2\2"+
		"\u0088\37\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7\3\2\2\u008b\u008c"+
		"\7\30\2\2\u008c!\3\2\2\2\u008d\u008e\7\3\2\2\u008e#\3\2\2\2\16\65:DJM"+
		"SY\\beu}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}