// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoomLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, C=2, STORY=3, START=4, CHAPTER=5, LINK=6, ARROW=7, STR=8, COLON=9, 
		LBRAK=10, RBRAK=11, LCURL=12, RCURL=13, BKSLASH=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "C", "STORY", "START", "CHAPTER", "LINK", "ARROW", "STR", "COLON", 
		"LBRAK", "RBRAK", "LCURL", "RCURL", "BKSLASH"
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


	public LoomLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Loom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\6\tA\n\t\r\t\16\tB\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\3\3\2c|P\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t)\3\2\2\2\13"+
		"/\3\2\2\2\r\67\3\2\2\2\17<\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2"+
		"\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37 \7$\2\2 \4\3\2\2\2"+
		"!\"\7E\2\2\"\6\3\2\2\2#$\7U\2\2$%\7V\2\2%&\7Q\2\2&\'\7T\2\2\'(\7[\2\2"+
		"(\b\3\2\2\2)*\7U\2\2*+\7V\2\2+,\7C\2\2,-\7T\2\2-.\7V\2\2.\n\3\2\2\2/\60"+
		"\7E\2\2\60\61\7J\2\2\61\62\7C\2\2\62\63\7R\2\2\63\64\7V\2\2\64\65\7G\2"+
		"\2\65\66\7T\2\2\66\f\3\2\2\2\678\7N\2\289\7K\2\29:\7P\2\2:;\7M\2\2;\16"+
		"\3\2\2\2<=\7/\2\2=>\7@\2\2>\20\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2C\22\3\2\2\2DE\7<\2\2E\24\3\2\2\2FG\7]\2\2G\26\3\2"+
		"\2\2HI\7_\2\2I\30\3\2\2\2JK\7}\2\2K\32\3\2\2\2LM\7\177\2\2M\34\3\2\2\2"+
		"NO\7\61\2\2O\36\3\2\2\2\4\2B\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}