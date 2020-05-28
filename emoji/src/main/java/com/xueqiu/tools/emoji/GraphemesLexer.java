package com.xueqiu.tools.emoji;// Generated from /Users/xuwuqiang/Documents/workspace/antlr/emoji/src/main/antlr4/com/xueqiu/tools/emoji/Graphemes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphemesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, Extend=111, ZWJ=112, SpacingMark=113, 
		EmojiCoreSequence=114, EmojiZWJSequence=115, Prepend=116, NonControl=117, 
		CRLF=118, HangulSyllable=119;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "T__82", "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
			"T__89", "T__90", "T__91", "T__92", "T__93", "T__94", "T__95", "T__96", 
			"T__97", "T__98", "T__99", "T__100", "T__101", "T__102", "T__103", "T__104", 
			"T__105", "T__106", "T__107", "T__108", "T__109", "Extend", "ZWJ", "SpacingMark", 
			"VS15", "VS16", "NonspacingMark", "TextPresentationCharacter", "EmojiPresentationCharacter", 
			"TextPresentationSequence", "EmojiPresentationSequence", "EmojiCharacter", 
			"EmojiModifierSequence", "EmojiFlagSequence", "ExtendedPictographic", 
			"EnclosingMark", "EmojiCombiningSequence", "EmojiCoreSequence", "EmojiZWJElement", 
			"EmojiZWJSequence", "TagBase", "TagSpec", "TagTerm", "EmojiTagSequence", 
			"Prepend", "NonControl", "CRLF", "HangulSyllable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[\u4E70]'", "'[\u505C]'", "'[\u50B2]'", "'[\u51CF]'", "'[\u52A0]'", 
			"'[\u5356]'", "'[\u54ED]'", "'[\u56E7]'", "'[\u56F0]'", "'[\u591A]'", 
			"'[\u5C4E]'", "'[\u6655]'", "'[\u6C57]'", "'[\u6DA8]'", "'[\u7231]'", 
			"'[\u725B]'", "'[\u7A7A]'", "'[\u7B11]'", "'[\u8272]'", "'[\u8D2C]'", 
			"'[\u8D5E]'", "'[\u8DCC]'", "'[\u4E0D\u5C51]'", "'[\u4E0D\u8D5E]'", "'[\u4E2D\u7B7E]'", 
			"'[\u4E3B\u529B]'", "'[\u4E70\u5165]'", "'[\u4EB2\u4EB2]'", "'[\u4EF0\u6155]'", 
			"'[\u4FCF\u76AE]'", "'[\u50B2\u6162]'", "'[\u51CB\u8C22]'", "'[\u51CF\u4ED3]'", 
			"'[\u5272\u8089]'", "'[\u52A0\u4ED3]'", "'[\u52A0\u6CB9]'", "'[\u5356\u51FA]'", 
			"'[\u5356\u8EAB]'", "'[\u53EF\u601C]'", "'[\u53EF\u7231]'", "'[\u5410\u820C]'", 
			"'[\u5410\u8840]'", "'[\u5475\u5475]'", "'[\u54C8\u54C8]'", "'[\u54ED\u6CE3]'", 
			"'[\u56F0\u60D1]'", "'[\u56F0\u987F]'", "'[\u56F4\u89C2]'", "'[\u590D\u76D8]'", 
			"'[\u5927\u7B11]'", "'[\u5931\u671B]'", "'[\u597D\u900A]'", "'[\u5BB3\u7F9E]'", 
			"'[\u5C34\u5C2C]'", "'[\u5E72\u676F]'", "'[\u5F88\u8D5E]'", "'[\u5FAE\u7B11]'", 
			"'[\u5FC3\u5FC3]'", "'[\u5FC3\u788E]'", "'[\u6012\u4E86]'", "'[\u601D\u8003]'", 
			"'[\u6210\u4EA4]'", "'[\u6284\u5E95]'", "'[\u62A0\u9F3B]'", "'[\u6323\u624E]'", 
			"'[\u6342\u8138]'", "'[\u63E1\u624B]'", "'[\u644A\u624B]'", "'[\u65E0\u8BED]'", 
			"'[\u68AD\u54C8]'", "'[\u6EE1\u4ED3]'", "'[\u6EF4\u6C57]'", "'[\u732E\u82B1]'", 
			"'[\u751F\u6C14]'", "'[\u7591\u95EE]'", "'[\u770B\u591A]'", "'[\u770B\u7A7A]'", 
			"'[\u79D8\u5BC6]'", "'[\u7A7A\u4ED3]'", "'[\u7B11\u54ED]'", "'[\u80DC\u5229]'", 
			"'[\u8BA8\u538C]'", "'[\u8BC5\u5492]'", "'[\u8C03\u76AE]'", "'[\u8D2A\u8D22]'", 
			"'[\u8D5E\u6210]'", "'[\u8DEA\u4E86]'", "'[\u8DF3\u6C34]'", "'[\u95ED\u5634]'", 
			"'[\u96BE\u8FC7]'", "'[\u97ED\u83DC]'", "'[\u9F13\u638C]'", "'[\u4E00\u5768\u5C4E]'", 
			"'[\u4E0D\u77E5\u9053]'", "'[\u4E0D\u8BF4\u4E86]'", "'[\u4E3A\u4EC0\u4E48]'", 
			"'[\u4E8F\u5927\u4E86]'", "'[\u56FD\u5BB6\u961F]'", "'[\u597D\u56F0\u60D1]'", 
			"'[\u597D\u5931\u671B]'", "'[\u5FC3\u788E\u4E86]'", "'[\u60F3\u4E00\u4E0B]'", 
			"'[\u62A4\u57CE\u6CB3]'", "'[\u6BDB\u4F30\u4F30]'", "'[\u732E\u82B1\u82B1]'", 
			"'[\u80FD\u529B\u5708]'", "'[\u8D5A\u5927\u4E86]'", "'[\u9F13\u9F13\u638C]'", 
			"'[\u5173\u706F\u5403\u9762]'", "'[\u5475\u5475\u50BB\u903C]'", null, 
			"'\u200D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Extend", "ZWJ", "SpacingMark", "EmojiCoreSequence", 
			"EmojiZWJSequence", "Prepend", "NonControl", "CRLF", "HangulSyllable"
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


	public GraphemesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graphemes.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2y\u03cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@"+
		"\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D"+
		"\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I"+
		"\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M"+
		"\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R"+
		"\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W"+
		"\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3["+
		"\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3"+
		"_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3"+
		"c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3g\3g\3"+
		"g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3"+
		"k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3"+
		"n\3o\3o\3o\3o\3o\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3"+
		"w\3x\3x\3x\3y\3y\3y\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3~\3~\3\177\3\177\3"+
		"\177\5\177\u035f\n\177\3\177\7\177\u0362\n\177\f\177\16\177\u0365\13\177"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u036a\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u036f\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\6\u0082\u0375\n"+
		"\u0082\r\u0082\16\u0082\u0376\3\u0083\3\u0083\3\u0083\5\u0083\u037c\n"+
		"\u0083\3\u0084\6\u0084\u037f\n\u0084\r\u0084\16\u0084\u0380\3\u0085\3"+
		"\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\7\u008a\u0391\n\u008a\f\u008a\16\u008a"+
		"\u0394\13\u008a\3\u008a\6\u008a\u0397\n\u008a\r\u008a\16\u008a\u0398\3"+
		"\u008a\7\u008a\u039c\n\u008a\f\u008a\16\u008a\u039f\13\u008a\3\u008a\7"+
		"\u008a\u03a2\n\u008a\f\u008a\16\u008a\u03a5\13\u008a\3\u008a\3\u008a\7"+
		"\u008a\u03a9\n\u008a\f\u008a\16\u008a\u03ac\13\u008a\3\u008a\7\u008a\u03af"+
		"\n\u008a\f\u008a\16\u008a\u03b2\13\u008a\3\u008a\7\u008a\u03b5\n\u008a"+
		"\f\u008a\16\u008a\u03b8\13\u008a\3\u008a\3\u008a\7\u008a\u03bc\n\u008a"+
		"\f\u008a\16\u008a\u03bf\13\u008a\3\u008a\6\u008a\u03c2\n\u008a\r\u008a"+
		"\16\u008a\u03c3\3\u008a\6\u008a\u03c7\n\u008a\r\u008a\16\u008a\u03c8\5"+
		"\u008a\u03cb\n\u008a\2\2\u008b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af"+
		"Y\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3"+
		"c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7"+
		"m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5\2\u00e7\2\u00e9\2\u00eb"+
		"\2\u00ed\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7\2\u00f9\2\u00fb\2\u00fd"+
		"\2\u00fft\u0101\2\u0103u\u0105\2\u0107\2\u0109\2\u010b\2\u010dv\u010f"+
		"w\u0111x\u0113y\3\2\n\7\2\u048a\u048b\u1ac0\u1ac0\u20df\u20e2\u20e4\u20e6"+
		"\ua672\ua674\3\2\17\17\3\2\f\f\4\2\u1102\u1161\ua962\ua97e\4\2\u1162\u11a9"+
		"\ud7b2\ud7c8\4\2\u11aa\u1201\ud7cd\ud7fd\u0191\2\uac02\uac02\uac1e\uac1e"+
		"\uac3a\uac3a\uac56\uac56\uac72\uac72\uac8e\uac8e\uacaa\uacaa\uacc6\uacc6"+
		"\uace2\uace2\uacfe\uacfe\uad1a\uad1a\uad36\uad36\uad52\uad52\uad6e\uad6e"+
		"\uad8a\uad8a\uada6\uada6\uadc2\uadc2\uadde\uadde\uadfa\uadfa\uae16\uae16"+
		"\uae32\uae32\uae4e\uae4e\uae6a\uae6a\uae86\uae86\uaea2\uaea2\uaebe\uaebe"+
		"\uaeda\uaeda\uaef6\uaef6\uaf12\uaf12\uaf2e\uaf2e\uaf4a\uaf4a\uaf66\uaf66"+
		"\uaf82\uaf82\uaf9e\uaf9e\uafba\uafba\uafd6\uafd6\uaff2\uaff2\ub00e\ub00e"+
		"\ub02a\ub02a\ub046\ub046\ub062\ub062\ub07e\ub07e\ub09a\ub09a\ub0b6\ub0b6"+
		"\ub0d2\ub0d2\ub0ee\ub0ee\ub10a\ub10a\ub126\ub126\ub142\ub142\ub15e\ub15e"+
		"\ub17a\ub17a\ub196\ub196\ub1b2\ub1b2\ub1ce\ub1ce\ub1ea\ub1ea\ub206\ub206"+
		"\ub222\ub222\ub23e\ub23e\ub25a\ub25a\ub276\ub276\ub292\ub292\ub2ae\ub2ae"+
		"\ub2ca\ub2ca\ub2e6\ub2e6\ub302\ub302\ub31e\ub31e\ub33a\ub33a\ub356\ub356"+
		"\ub372\ub372\ub38e\ub38e\ub3aa\ub3aa\ub3c6\ub3c6\ub3e2\ub3e2\ub3fe\ub3fe"+
		"\ub41a\ub41a\ub436\ub436\ub452\ub452\ub46e\ub46e\ub48a\ub48a\ub4a6\ub4a6"+
		"\ub4c2\ub4c2\ub4de\ub4de\ub4fa\ub4fa\ub516\ub516\ub532\ub532\ub54e\ub54e"+
		"\ub56a\ub56a\ub586\ub586\ub5a2\ub5a2\ub5be\ub5be\ub5da\ub5da\ub5f6\ub5f6"+
		"\ub612\ub612\ub62e\ub62e\ub64a\ub64a\ub666\ub666\ub682\ub682\ub69e\ub69e"+
		"\ub6ba\ub6ba\ub6d6\ub6d6\ub6f2\ub6f2\ub70e\ub70e\ub72a\ub72a\ub746\ub746"+
		"\ub762\ub762\ub77e\ub77e\ub79a\ub79a\ub7b6\ub7b6\ub7d2\ub7d2\ub7ee\ub7ee"+
		"\ub80a\ub80a\ub826\ub826\ub842\ub842\ub85e\ub85e\ub87a\ub87a\ub896\ub896"+
		"\ub8b2\ub8b2\ub8ce\ub8ce\ub8ea\ub8ea\ub906\ub906\ub922\ub922\ub93e\ub93e"+
		"\ub95a\ub95a\ub976\ub976\ub992\ub992\ub9ae\ub9ae\ub9ca\ub9ca\ub9e6\ub9e6"+
		"\uba02\uba02\uba1e\uba1e\uba3a\uba3a\uba56\uba56\uba72\uba72\uba8e\uba8e"+
		"\ubaaa\ubaaa\ubac6\ubac6\ubae2\ubae2\ubafe\ubafe\ubb1a\ubb1a\ubb36\ubb36"+
		"\ubb52\ubb52\ubb6e\ubb6e\ubb8a\ubb8a\ubba6\ubba6\ubbc2\ubbc2\ubbde\ubbde"+
		"\ubbfa\ubbfa\ubc16\ubc16\ubc32\ubc32\ubc4e\ubc4e\ubc6a\ubc6a\ubc86\ubc86"+
		"\ubca2\ubca2\ubcbe\ubcbe\ubcda\ubcda\ubcf6\ubcf6\ubd12\ubd12\ubd2e\ubd2e"+
		"\ubd4a\ubd4a\ubd66\ubd66\ubd82\ubd82\ubd9e\ubd9e\ubdba\ubdba\ubdd6\ubdd6"+
		"\ubdf2\ubdf2\ube0e\ube0e\ube2a\ube2a\ube46\ube46\ube62\ube62\ube7e\ube7e"+
		"\ube9a\ube9a\ubeb6\ubeb6\ubed2\ubed2\ubeee\ubeee\ubf0a\ubf0a\ubf26\ubf26"+
		"\ubf42\ubf42\ubf5e\ubf5e\ubf7a\ubf7a\ubf96\ubf96\ubfb2\ubfb2\ubfce\ubfce"+
		"\ubfea\ubfea\uc006\uc006\uc022\uc022\uc03e\uc03e\uc05a\uc05a\uc076\uc076"+
		"\uc092\uc092\uc0ae\uc0ae\uc0ca\uc0ca\uc0e6\uc0e6\uc102\uc102\uc11e\uc11e"+
		"\uc13a\uc13a\uc156\uc156\uc172\uc172\uc18e\uc18e\uc1aa\uc1aa\uc1c6\uc1c6"+
		"\uc1e2\uc1e2\uc1fe\uc1fe\uc21a\uc21a\uc236\uc236\uc252\uc252\uc26e\uc26e"+
		"\uc28a\uc28a\uc2a6\uc2a6\uc2c2\uc2c2\uc2de\uc2de\uc2fa\uc2fa\uc316\uc316"+
		"\uc332\uc332\uc34e\uc34e\uc36a\uc36a\uc386\uc386\uc3a2\uc3a2\uc3be\uc3be"+
		"\uc3da\uc3da\uc3f6\uc3f6\uc412\uc412\uc42e\uc42e\uc44a\uc44a\uc466\uc466"+
		"\uc482\uc482\uc49e\uc49e\uc4ba\uc4ba\uc4d6\uc4d6\uc4f2\uc4f2\uc50e\uc50e"+
		"\uc52a\uc52a\uc546\uc546\uc562\uc562\uc57e\uc57e\uc59a\uc59a\uc5b6\uc5b6"+
		"\uc5d2\uc5d2\uc5ee\uc5ee\uc60a\uc60a\uc626\uc626\uc642\uc642\uc65e\uc65e"+
		"\uc67a\uc67a\uc696\uc696\uc6b2\uc6b2\uc6ce\uc6ce\uc6ea\uc6ea\uc706\uc706"+
		"\uc722\uc722\uc73e\uc73e\uc75a\uc75a\uc776\uc776\uc792\uc792\uc7ae\uc7ae"+
		"\uc7ca\uc7ca\uc7e6\uc7e6\uc802\uc802\uc81e\uc81e\uc83a\uc83a\uc856\uc856"+
		"\uc872\uc872\uc88e\uc88e\uc8aa\uc8aa\uc8c6\uc8c6\uc8e2\uc8e2\uc8fe\uc8fe"+
		"\uc91a\uc91a\uc936\uc936\uc952\uc952\uc96e\uc96e\uc98a\uc98a\uc9a6\uc9a6"+
		"\uc9c2\uc9c2\uc9de\uc9de\uc9fa\uc9fa\uca16\uca16\uca32\uca32\uca4e\uca4e"+
		"\uca6a\uca6a\uca86\uca86\ucaa2\ucaa2\ucabe\ucabe\ucada\ucada\ucaf6\ucaf6"+
		"\ucb12\ucb12\ucb2e\ucb2e\ucb4a\ucb4a\ucb66\ucb66\ucb82\ucb82\ucb9e\ucb9e"+
		"\ucbba\ucbba\ucbd6\ucbd6\ucbf2\ucbf2\ucc0e\ucc0e\ucc2a\ucc2a\ucc46\ucc46"+
		"\ucc62\ucc62\ucc7e\ucc7e\ucc9a\ucc9a\uccb6\uccb6\uccd2\uccd2\uccee\uccee"+
		"\ucd0a\ucd0a\ucd26\ucd26\ucd42\ucd42\ucd5e\ucd5e\ucd7a\ucd7a\ucd96\ucd96"+
		"\ucdb2\ucdb2\ucdce\ucdce\ucdea\ucdea\uce06\uce06\uce22\uce22\uce3e\uce3e"+
		"\uce5a\uce5a\uce76\uce76\uce92\uce92\uceae\uceae\uceca\uceca\ucee6\ucee6"+
		"\ucf02\ucf02\ucf1e\ucf1e\ucf3a\ucf3a\ucf56\ucf56\ucf72\ucf72\ucf8e\ucf8e"+
		"\ucfaa\ucfaa\ucfc6\ucfc6\ucfe2\ucfe2\ucffe\ucffe\ud01a\ud01a\ud036\ud036"+
		"\ud052\ud052\ud06e\ud06e\ud08a\ud08a\ud0a6\ud0a6\ud0c2\ud0c2\ud0de\ud0de"+
		"\ud0fa\ud0fa\ud116\ud116\ud132\ud132\ud14e\ud14e\ud16a\ud16a\ud186\ud186"+
		"\ud1a2\ud1a2\ud1be\ud1be\ud1da\ud1da\ud1f6\ud1f6\ud212\ud212\ud22e\ud22e"+
		"\ud24a\ud24a\ud266\ud266\ud282\ud282\ud29e\ud29e\ud2ba\ud2ba\ud2d6\ud2d6"+
		"\ud2f2\ud2f2\ud30e\ud30e\ud32a\ud32a\ud346\ud346\ud362\ud362\ud37e\ud37e"+
		"\ud39a\ud39a\ud3b6\ud3b6\ud3d2\ud3d2\ud3ee\ud3ee\ud40a\ud40a\ud426\ud426"+
		"\ud442\ud442\ud45e\ud45e\ud47a\ud47a\ud496\ud496\ud4b2\ud4b2\ud4ce\ud4ce"+
		"\ud4ea\ud4ea\ud506\ud506\ud522\ud522\ud53e\ud53e\ud55a\ud55a\ud576\ud576"+
		"\ud592\ud592\ud5ae\ud5ae\ud5ca\ud5ca\ud5e6\ud5e6\ud602\ud602\ud61e\ud61e"+
		"\ud63a\ud63a\ud656\ud656\ud672\ud672\ud68e\ud68e\ud6aa\ud6aa\ud6c6\ud6c6"+
		"\ud6e2\ud6e2\ud6fe\ud6fe\ud71a\ud71a\ud736\ud736\ud752\ud752\ud76e\ud76e"+
		"\ud78a\ud78a\u0191\2\uac03\uac1d\uac1f\uac39\uac3b\uac55\uac57\uac71\uac73"+
		"\uac8d\uac8f\uaca9\uacab\uacc5\uacc7\uace1\uace3\uacfd\uacff\uad19\uad1b"+
		"\uad35\uad37\uad51\uad53\uad6d\uad6f\uad89\uad8b\uada5\uada7\uadc1\uadc3"+
		"\uaddd\uaddf\uadf9\uadfb\uae15\uae17\uae31\uae33\uae4d\uae4f\uae69\uae6b"+
		"\uae85\uae87\uaea1\uaea3\uaebd\uaebf\uaed9\uaedb\uaef5\uaef7\uaf11\uaf13"+
		"\uaf2d\uaf2f\uaf49\uaf4b\uaf65\uaf67\uaf81\uaf83\uaf9d\uaf9f\uafb9\uafbb"+
		"\uafd5\uafd7\uaff1\uaff3\ub00d\ub00f\ub029\ub02b\ub045\ub047\ub061\ub063"+
		"\ub07d\ub07f\ub099\ub09b\ub0b5\ub0b7\ub0d1\ub0d3\ub0ed\ub0ef\ub109\ub10b"+
		"\ub125\ub127\ub141\ub143\ub15d\ub15f\ub179\ub17b\ub195\ub197\ub1b1\ub1b3"+
		"\ub1cd\ub1cf\ub1e9\ub1eb\ub205\ub207\ub221\ub223\ub23d\ub23f\ub259\ub25b"+
		"\ub275\ub277\ub291\ub293\ub2ad\ub2af\ub2c9\ub2cb\ub2e5\ub2e7\ub301\ub303"+
		"\ub31d\ub31f\ub339\ub33b\ub355\ub357\ub371\ub373\ub38d\ub38f\ub3a9\ub3ab"+
		"\ub3c5\ub3c7\ub3e1\ub3e3\ub3fd\ub3ff\ub419\ub41b\ub435\ub437\ub451\ub453"+
		"\ub46d\ub46f\ub489\ub48b\ub4a5\ub4a7\ub4c1\ub4c3\ub4dd\ub4df\ub4f9\ub4fb"+
		"\ub515\ub517\ub531\ub533\ub54d\ub54f\ub569\ub56b\ub585\ub587\ub5a1\ub5a3"+
		"\ub5bd\ub5bf\ub5d9\ub5db\ub5f5\ub5f7\ub611\ub613\ub62d\ub62f\ub649\ub64b"+
		"\ub665\ub667\ub681\ub683\ub69d\ub69f\ub6b9\ub6bb\ub6d5\ub6d7\ub6f1\ub6f3"+
		"\ub70d\ub70f\ub729\ub72b\ub745\ub747\ub761\ub763\ub77d\ub77f\ub799\ub79b"+
		"\ub7b5\ub7b7\ub7d1\ub7d3\ub7ed\ub7ef\ub809\ub80b\ub825\ub827\ub841\ub843"+
		"\ub85d\ub85f\ub879\ub87b\ub895\ub897\ub8b1\ub8b3\ub8cd\ub8cf\ub8e9\ub8eb"+
		"\ub905\ub907\ub921\ub923\ub93d\ub93f\ub959\ub95b\ub975\ub977\ub991\ub993"+
		"\ub9ad\ub9af\ub9c9\ub9cb\ub9e5\ub9e7\uba01\uba03\uba1d\uba1f\uba39\uba3b"+
		"\uba55\uba57\uba71\uba73\uba8d\uba8f\ubaa9\ubaab\ubac5\ubac7\ubae1\ubae3"+
		"\ubafd\ubaff\ubb19\ubb1b\ubb35\ubb37\ubb51\ubb53\ubb6d\ubb6f\ubb89\ubb8b"+
		"\ubba5\ubba7\ubbc1\ubbc3\ubbdd\ubbdf\ubbf9\ubbfb\ubc15\ubc17\ubc31\ubc33"+
		"\ubc4d\ubc4f\ubc69\ubc6b\ubc85\ubc87\ubca1\ubca3\ubcbd\ubcbf\ubcd9\ubcdb"+
		"\ubcf5\ubcf7\ubd11\ubd13\ubd2d\ubd2f\ubd49\ubd4b\ubd65\ubd67\ubd81\ubd83"+
		"\ubd9d\ubd9f\ubdb9\ubdbb\ubdd5\ubdd7\ubdf1\ubdf3\ube0d\ube0f\ube29\ube2b"+
		"\ube45\ube47\ube61\ube63\ube7d\ube7f\ube99\ube9b\ubeb5\ubeb7\ubed1\ubed3"+
		"\ubeed\ubeef\ubf09\ubf0b\ubf25\ubf27\ubf41\ubf43\ubf5d\ubf5f\ubf79\ubf7b"+
		"\ubf95\ubf97\ubfb1\ubfb3\ubfcd\ubfcf\ubfe9\ubfeb\uc005\uc007\uc021\uc023"+
		"\uc03d\uc03f\uc059\uc05b\uc075\uc077\uc091\uc093\uc0ad\uc0af\uc0c9\uc0cb"+
		"\uc0e5\uc0e7\uc101\uc103\uc11d\uc11f\uc139\uc13b\uc155\uc157\uc171\uc173"+
		"\uc18d\uc18f\uc1a9\uc1ab\uc1c5\uc1c7\uc1e1\uc1e3\uc1fd\uc1ff\uc219\uc21b"+
		"\uc235\uc237\uc251\uc253\uc26d\uc26f\uc289\uc28b\uc2a5\uc2a7\uc2c1\uc2c3"+
		"\uc2dd\uc2df\uc2f9\uc2fb\uc315\uc317\uc331\uc333\uc34d\uc34f\uc369\uc36b"+
		"\uc385\uc387\uc3a1\uc3a3\uc3bd\uc3bf\uc3d9\uc3db\uc3f5\uc3f7\uc411\uc413"+
		"\uc42d\uc42f\uc449\uc44b\uc465\uc467\uc481\uc483\uc49d\uc49f\uc4b9\uc4bb"+
		"\uc4d5\uc4d7\uc4f1\uc4f3\uc50d\uc50f\uc529\uc52b\uc545\uc547\uc561\uc563"+
		"\uc57d\uc57f\uc599\uc59b\uc5b5\uc5b7\uc5d1\uc5d3\uc5ed\uc5ef\uc609\uc60b"+
		"\uc625\uc627\uc641\uc643\uc65d\uc65f\uc679\uc67b\uc695\uc697\uc6b1\uc6b3"+
		"\uc6cd\uc6cf\uc6e9\uc6eb\uc705\uc707\uc721\uc723\uc73d\uc73f\uc759\uc75b"+
		"\uc775\uc777\uc791\uc793\uc7ad\uc7af\uc7c9\uc7cb\uc7e5\uc7e7\uc801\uc803"+
		"\uc81d\uc81f\uc839\uc83b\uc855\uc857\uc871\uc873\uc88d\uc88f\uc8a9\uc8ab"+
		"\uc8c5\uc8c7\uc8e1\uc8e3\uc8fd\uc8ff\uc919\uc91b\uc935\uc937\uc951\uc953"+
		"\uc96d\uc96f\uc989\uc98b\uc9a5\uc9a7\uc9c1\uc9c3\uc9dd\uc9df\uc9f9\uc9fb"+
		"\uca15\uca17\uca31\uca33\uca4d\uca4f\uca69\uca6b\uca85\uca87\ucaa1\ucaa3"+
		"\ucabd\ucabf\ucad9\ucadb\ucaf5\ucaf7\ucb11\ucb13\ucb2d\ucb2f\ucb49\ucb4b"+
		"\ucb65\ucb67\ucb81\ucb83\ucb9d\ucb9f\ucbb9\ucbbb\ucbd5\ucbd7\ucbf1\ucbf3"+
		"\ucc0d\ucc0f\ucc29\ucc2b\ucc45\ucc47\ucc61\ucc63\ucc7d\ucc7f\ucc99\ucc9b"+
		"\uccb5\uccb7\uccd1\uccd3\ucced\uccef\ucd09\ucd0b\ucd25\ucd27\ucd41\ucd43"+
		"\ucd5d\ucd5f\ucd79\ucd7b\ucd95\ucd97\ucdb1\ucdb3\ucdcd\ucdcf\ucde9\ucdeb"+
		"\uce05\uce07\uce21\uce23\uce3d\uce3f\uce59\uce5b\uce75\uce77\uce91\uce93"+
		"\ucead\uceaf\ucec9\ucecb\ucee5\ucee7\ucf01\ucf03\ucf1d\ucf1f\ucf39\ucf3b"+
		"\ucf55\ucf57\ucf71\ucf73\ucf8d\ucf8f\ucfa9\ucfab\ucfc5\ucfc7\ucfe1\ucfe3"+
		"\ucffd\ucfff\ud019\ud01b\ud035\ud037\ud051\ud053\ud06d\ud06f\ud089\ud08b"+
		"\ud0a5\ud0a7\ud0c1\ud0c3\ud0dd\ud0df\ud0f9\ud0fb\ud115\ud117\ud131\ud133"+
		"\ud14d\ud14f\ud169\ud16b\ud185\ud187\ud1a1\ud1a3\ud1bd\ud1bf\ud1d9\ud1db"+
		"\ud1f5\ud1f7\ud211\ud213\ud22d\ud22f\ud249\ud24b\ud265\ud267\ud281\ud283"+
		"\ud29d\ud29f\ud2b9\ud2bb\ud2d5\ud2d7\ud2f1\ud2f3\ud30d\ud30f\ud329\ud32b"+
		"\ud345\ud347\ud361\ud363\ud37d\ud37f\ud399\ud39b\ud3b5\ud3b7\ud3d1\ud3d3"+
		"\ud3ed\ud3ef\ud409\ud40b\ud425\ud427\ud441\ud443\ud45d\ud45f\ud479\ud47b"+
		"\ud495\ud497\ud4b1\ud4b3\ud4cd\ud4cf\ud4e9\ud4eb\ud505\ud507\ud521\ud523"+
		"\ud53d\ud53f\ud559\ud55b\ud575\ud577\ud591\ud593\ud5ad\ud5af\ud5c9\ud5cb"+
		"\ud5e5\ud5e7\ud601\ud603\ud61d\ud61f\ud639\ud63b\ud655\ud657\ud671\ud673"+
		"\ud68d\ud68f\ud6a9\ud6ab\ud6c5\ud6c7\ud6e1\ud6e3\ud6fd\ud6ff\ud719\ud71b"+
		"\ud735\ud737\ud751\ud753\ud76d\ud76f\ud789\ud78b\ud7a5\20\u0141\2\u0302"+
		"\2\u0371\2\u0485\2\u048b\2\u0593\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4"+
		"\2\u05c6\2\u05c7\2\u05c9\2\u05c9\2\u0612\2\u061c\2\u064d\2\u0661\2\u0672"+
		"\2\u0672\2\u06d8\2\u06de\2\u06e1\2\u06e6\2\u06e9\2\u06ea\2\u06ec\2\u06ef"+
		"\2\u0713\2\u0713\2\u0732\2\u074c\2\u07a8\2\u07b2\2\u07ed\2\u07f5\2\u0818"+
		"\2\u081b\2\u081d\2\u0825\2\u0827\2\u0829\2\u082b\2\u082f\2\u085b\2\u085d"+
		"\2\u08d6\2\u08e3\2\u08e5\2\u0904\2\u093c\2\u093c\2\u093e\2\u093e\2\u0943"+
		"\2\u094a\2\u094f\2\u094f\2\u0953\2\u0959\2\u0964\2\u0965\2\u0983\2\u0983"+
		"\2\u09be\2\u09be\2\u09c0\2\u09c0\2\u09c3\2\u09c6\2\u09cf\2\u09cf\2\u09d9"+
		"\2\u09d9\2\u09e4\2\u09e5\2\u0a03\2\u0a04\2\u0a3e\2\u0a3e\2\u0a43\2\u0a44"+
		"\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53\2\u0a72\2\u0a73\2\u0a77"+
		"\2\u0a77\2\u0a83\2\u0a84\2\u0abe\2\u0abe\2\u0ac3\2\u0ac7\2\u0ac9\2\u0aca"+
		"\2\u0acf\2\u0acf\2\u0ae4\2\u0ae5\2\u0afc\2\u0b01\2\u0b03\2\u0b03\2\u0b3e"+
		"\2\u0b3e\2\u0b40\2\u0b41\2\u0b43\2\u0b46\2\u0b4f\2\u0b4f\2\u0b58\2\u0b59"+
		"\2\u0b64\2\u0b65\2\u0b84\2\u0b84\2\u0bc0\2\u0bc0\2\u0bc2\2\u0bc2\2\u0bcf"+
		"\2\u0bcf\2\u0bd9\2\u0bd9\2\u0c02\2\u0c02\2\u0c40\2\u0c42\2\u0c48\2\u0c4a"+
		"\2\u0c4c\2\u0c4f\2\u0c57\2\u0c58\2\u0c64\2\u0c65\2\u0c83\2\u0c83\2\u0cbe"+
		"\2\u0cbe\2\u0cc1\2\u0cc1\2\u0cc4\2\u0cc4\2\u0cc8\2\u0cc8\2\u0cce\2\u0ccf"+
		"\2\u0cd7\2\u0cd8\2\u0ce4\2\u0ce5\2\u0d02\2\u0d03\2\u0d3d\2\u0d3e\2\u0d40"+
		"\2\u0d40\2\u0d43\2\u0d46\2\u0d4f\2\u0d4f\2\u0d59\2\u0d59\2\u0d64\2\u0d65"+
		"\2\u0dcc\2\u0dcc\2\u0dd1\2\u0dd1\2\u0dd4\2\u0dd6\2\u0dd8\2\u0dd8\2\u0de1"+
		"\2\u0de1\2\u0e33\2\u0e33\2\u0e36\2\u0e3c\2\u0e49\2\u0e50\2\u0eb3\2\u0eb3"+
		"\2\u0eb6\2\u0ebb\2\u0ebd\2\u0ebe\2\u0eca\2\u0ecf\2\u0f1a\2\u0f1b\2\u0f37"+
		"\2\u0f37\2\u0f39\2\u0f39\2\u0f3b\2\u0f3b\2\u0f73\2\u0f80\2\u0f82\2\u0f86"+
		"\2\u0f88\2\u0f89\2\u0f8f\2\u0f99\2\u0f9b\2\u0fbe\2\u0fc8\2\u0fc8\2\u102f"+
		"\2\u1032\2\u1034\2\u1039\2\u103b\2\u103c\2\u103f\2\u1040\2\u105a\2\u105b"+
		"\2\u1060\2\u1062\2\u1073\2\u1076\2\u1084\2\u1084\2\u1087\2\u1088\2\u108f"+
		"\2\u108f\2\u109f\2\u109f\2\u135f\2\u1361\2\u1714\2\u1716\2\u1734\2\u1736"+
		"\2\u1754\2\u1755\2\u1774\2\u1775\2\u17b6\2\u17b7\2\u17b9\2\u17bf\2\u17c8"+
		"\2\u17c8\2\u17cb\2\u17d5\2\u17df\2\u17df\2\u180d\2\u180f\2\u1887\2\u1888"+
		"\2\u18ab\2\u18ab\2\u1922\2\u1924\2\u1929\2\u192a\2\u1934\2\u1934\2\u193b"+
		"\2\u193d\2\u1a19\2\u1a1a\2\u1a1d\2\u1a1d\2\u1a58\2\u1a58\2\u1a5a\2\u1a60"+
		"\2\u1a62\2\u1a62\2\u1a64\2\u1a64\2\u1a67\2\u1a6e\2\u1a75\2\u1a7e\2\u1a81"+
		"\2\u1a81\2\u1ab2\2\u1ac0\2\u1b02\2\u1b05\2\u1b36\2\u1b36\2\u1b38\2\u1b3c"+
		"\2\u1b3e\2\u1b3e\2\u1b44\2\u1b44\2\u1b6d\2\u1b75\2\u1b82\2\u1b83\2\u1ba4"+
		"\2\u1ba7\2\u1baa\2\u1bab\2\u1bad\2\u1baf\2\u1be8\2\u1be8\2\u1bea\2\u1beb"+
		"\2\u1bef\2\u1bef\2\u1bf1\2\u1bf3\2\u1c2e\2\u1c35\2\u1c38\2\u1c39\2\u1cd2"+
		"\2\u1cd4\2\u1cd6\2\u1ce2\2\u1ce4\2\u1cea\2\u1cef\2\u1cef\2\u1cf6\2\u1cf6"+
		"\2\u1cfa\2\u1cfb\2\u1dc2\2\u1dfb\2\u1dfd\2\u1e01\2\u200e\2\u200e\2\u20d2"+
		"\2\u20f2\2\u2cf1\2\u2cf3\2\u2d81\2\u2d81\2\u2de2\2\u2e01\2\u302c\2\u3031"+
		"\2\u309b\2\u309c\2\ua671\2\ua674\2\ua676\2\ua67f\2\ua6a0\2\ua6a1\2\ua6f2"+
		"\2\ua6f3\2\ua804\2\ua804\2\ua808\2\ua808\2\ua80d\2\ua80d\2\ua827\2\ua828"+
		"\2\ua8c6\2\ua8c7\2\ua8e2\2\ua8f3\2\ua928\2\ua92f\2\ua949\2\ua953\2\ua982"+
		"\2\ua984\2\ua9b5\2\ua9b5\2\ua9b8\2\ua9bb\2\ua9be\2\ua9be\2\ua9e7\2\ua9e7"+
		"\2\uaa2b\2\uaa30\2\uaa33\2\uaa34\2\uaa37\2\uaa38\2\uaa45\2\uaa45\2\uaa4e"+
		"\2\uaa4e\2\uaa7e\2\uaa7e\2\uaab2\2\uaab2\2\uaab4\2\uaab6\2\uaab9\2\uaaba"+
		"\2\uaac0\2\uaac1\2\uaac3\2\uaac3\2\uaaee\2\uaaef\2\uaaf8\2\uaaf8\2\uabe7"+
		"\2\uabe7\2\uabea\2\uabea\2\uabef\2\uabef\2\ufb20\2\ufb20\2\ufe02\2\ufe11"+
		"\2\ufe22\2\ufe31\2\uffa0\2\uffa1\2\u01ff\3\u01ff\3\u02e2\3\u02e2\3\u0378"+
		"\3\u037c\3\u0a03\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a11\3\u0a3a\3\u0a3c"+
		"\3\u0a41\3\u0a41\3\u0ae7\3\u0ae8\3\u1003\3\u1003\3\u103a\3\u1048\3\u1081"+
		"\3\u1083\3\u10b5\3\u10b8\3\u10bb\3\u10bc\3\u1102\3\u1104\3\u1129\3\u112d"+
		"\3\u112f\3\u1136\3\u1175\3\u1175\3\u1182\3\u1183\3\u11b8\3\u11c0\3\u11cc"+
		"\3\u11ce\3\u1231\3\u1233\3\u1236\3\u1236\3\u1238\3\u1239\3\u1240\3\u1240"+
		"\3\u12e1\3\u12e1\3\u12e5\3\u12ec\3\u1302\3\u1303\3\u133e\3\u133e\3\u1340"+
		"\3\u1340\3\u1342\3\u1342\3\u1359\3\u1359\3\u1368\3\u136e\3\u1372\3\u1376"+
		"\3\u143a\3\u1441\3\u1444\3\u1446\3\u1448\3\u1448\3\u14b2\3\u14b2\3\u14b5"+
		"\3\u14ba\3\u14bc\3\u14bc\3\u14bf\3\u14bf\3\u14c1\3\u14c2\3\u14c4\3\u14c5"+
		"\3\u15b1\3\u15b1\3\u15b4\3\u15b7\3\u15be\3\u15bf\3\u15c1\3\u15c2\3\u15de"+
		"\3\u15df\3\u1635\3\u163c\3\u163f\3\u163f\3\u1641\3\u1642\3\u16ad\3\u16ad"+
		"\3\u16af\3\u16af\3\u16b2\3\u16b7\3\u16b9\3\u16b9\3\u171f\3\u1721\3\u1724"+
		"\3\u1727\3\u1729\3\u172d\3\u1a03\3\u1a08\3\u1a0b\3\u1a0c\3\u1a35\3\u1a3a"+
		"\3\u1a3d\3\u1a40\3\u1a49\3\u1a49\3\u1a53\3\u1a58\3\u1a5b\3\u1a5d\3\u1a8c"+
		"\3\u1a98\3\u1a9a\3\u1a9b\3\u1c32\3\u1c38\3\u1c3a\3\u1c3f\3\u1c41\3\u1c41"+
		"\3\u1c94\3\u1ca9\3\u1cac\3\u1cb2\3\u1cb4\3\u1cb5\3\u1cb7\3\u1cb8\3\u1d33"+
		"\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d47\3\u1d49\3\u1d49"+
		"\3\u6af2\3\u6af6\3\u6b32\3\u6b38\3\u6f91\3\u6f94\3\ubc9f\3\ubca0\3\ud167"+
		"\3\ud167\3\ud169\3\ud16b\3\ud170\3\ud174\3\ud17d\3\ud184\3\ud187\3\ud18d"+
		"\3\ud1ac\3\ud1af\3\ud244\3\ud246\3\uda02\3\uda38\3\uda3d\3\uda6e\3\uda77"+
		"\3\uda77\3\uda86\3\uda86\3\uda9d\3\udaa1\3\udaa3\3\udab1\3\ue002\3\ue008"+
		"\3\ue00a\3\ue01a\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue8d2"+
		"\3\ue8d8\3\ue946\3\ue94c\3\"\20\u0081\20\u0102\20\u01f1\20\u0093\2\u0905"+
		"\2\u0905\2\u093d\2\u093d\2\u0940\2\u0942\2\u094b\2\u094e\2\u0950\2\u0951"+
		"\2\u0984\2\u0985\2\u09c1\2\u09c2\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u0a05"+
		"\2\u0a05\2\u0a40\2\u0a42\2\u0a85\2\u0a85\2\u0ac0\2\u0ac2\2\u0acb\2\u0acb"+
		"\2\u0acd\2\u0ace\2\u0b04\2\u0b05\2\u0b42\2\u0b42\2\u0b49\2\u0b4a\2\u0b4d"+
		"\2\u0b4e\2\u0bc1\2\u0bc1\2\u0bc3\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce"+
		"\2\u0c03\2\u0c05\2\u0c43\2\u0c46\2\u0c84\2\u0c85\2\u0cc0\2\u0cc0\2\u0cc2"+
		"\2\u0cc3\2\u0cc5\2\u0cc6\2\u0cc9\2\u0cca\2\u0ccc\2\u0ccd\2\u0d04\2\u0d05"+
		"\2\u0d41\2\u0d42\2\u0d48\2\u0d4a\2\u0d4c\2\u0d4e\2\u0d84\2\u0d85\2\u0dd2"+
		"\2\u0dd3\2\u0dda\2\u0de0\2\u0df4\2\u0df5\2\u0e35\2\u0e35\2\u0eb5\2\u0eb5"+
		"\2\u0f40\2\u0f41\2\u0f81\2\u0f81\2\u1033\2\u1033\2\u103d\2\u103e\2\u1058"+
		"\2\u1059\2\u1086\2\u1086\2\u17b8\2\u17b8\2\u17c0\2\u17c7\2\u17c9\2\u17ca"+
		"\2\u1925\2\u1928\2\u192b\2\u192d\2\u1932\2\u1933\2\u1935\2\u193a\2\u1a1b"+
		"\2\u1a1c\2\u1a57\2\u1a57\2\u1a59\2\u1a59\2\u1a6f\2\u1a74\2\u1b06\2\u1b06"+
		"\2\u1b37\2\u1b37\2\u1b3d\2\u1b3d\2\u1b3f\2\u1b43\2\u1b45\2\u1b46\2\u1b84"+
		"\2\u1b84\2\u1ba3\2\u1ba3\2\u1ba8\2\u1ba9\2\u1bac\2\u1bac\2\u1be9\2\u1be9"+
		"\2\u1bec\2\u1bee\2\u1bf0\2\u1bf0\2\u1bf4\2\u1bf5\2\u1c26\2\u1c2d\2\u1c36"+
		"\2\u1c37\2\u1ce3\2\u1ce3\2\u1cf4\2\u1cf5\2\u1cf9\2\u1cf9\2\ua825\2\ua826"+
		"\2\ua829\2\ua829\2\ua882\2\ua883\2\ua8b6\2\ua8c5\2\ua954\2\ua955\2\ua985"+
		"\2\ua985\2\ua9b6\2\ua9b7\2\ua9bc\2\ua9bd\2\ua9bf\2\ua9c2\2\uaa31\2\uaa32"+
		"\2\uaa35\2\uaa36\2\uaa4f\2\uaa4f\2\uaaed\2\uaaed\2\uaaf0\2\uaaf1\2\uaaf7"+
		"\2\uaaf7\2\uabe5\2\uabe6\2\uabe8\2\uabe9\2\uabeb\2\uabec\2\uabee\2\uabee"+
		"\2\u1002\3\u1002\3\u1004\3\u1004\3\u1084\3\u1084\3\u10b2\3\u10b4\3\u10b9"+
		"\3\u10ba\3\u112e\3\u112e\3\u1184\3\u1184\3\u11b5\3\u11b7\3\u11c1\3\u11c2"+
		"\3\u122e\3\u1230\3\u1234\3\u1235\3\u1237\3\u1237\3\u12e2\3\u12e4\3\u1304"+
		"\3\u1305\3\u1341\3\u1341\3\u1343\3\u1346\3\u1349\3\u134a\3\u134d\3\u134f"+
		"\3\u1364\3\u1365\3\u1437\3\u1439\3\u1442\3\u1443\3\u1447\3\u1447\3\u14b3"+
		"\3\u14b4\3\u14bb\3\u14bb\3\u14bd\3\u14be\3\u14c0\3\u14c0\3\u14c3\3\u14c3"+
		"\3\u15b2\3\u15b3\3\u15ba\3\u15bd\3\u15c0\3\u15c0\3\u1632\3\u1634\3\u163d"+
		"\3\u163e\3\u1640\3\u1640\3\u16ae\3\u16ae\3\u16b0\3\u16b1\3\u16b8\3\u16b8"+
		"\3\u1722\3\u1723\3\u1728\3\u1728\3\u1a09\3\u1a0a\3\u1a3b\3\u1a3b\3\u1a59"+
		"\3\u1a5a\3\u1a99\3\u1a99\3\u1c31\3\u1c31\3\u1c40\3\u1c40\3\u1cab\3\u1cab"+
		"\3\u1cb3\3\u1cb3\3\u1cb6\3\u1cb6\3\u6f53\3\u6f80\3\ud168\3\ud168\3\ud16f"+
		"\3\ud16f\3\u012f\2\u0302\2\u0371\2\u0485\2\u0489\2\u0593\2\u05bf\2\u05c1"+
		"\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9\2\u0612\2\u061c"+
		"\2\u064d\2\u0661\2\u0672\2\u0672\2\u06d8\2\u06de\2\u06e1\2\u06e6\2\u06e9"+
		"\2\u06ea\2\u06ec\2\u06ef\2\u0713\2\u0713\2\u0732\2\u074c\2\u07a8\2\u07b2"+
		"\2\u07ed\2\u07f5\2\u0818\2\u081b\2\u081d\2\u0825\2\u0827\2\u0829\2\u082b"+
		"\2\u082f\2\u085b\2\u085d\2\u08d6\2\u08e3\2\u08e5\2\u0904\2\u093c\2\u093c"+
		"\2\u093e\2\u093e\2\u0943\2\u094a\2\u094f\2\u094f\2\u0953\2\u0959\2\u0964"+
		"\2\u0965\2\u0983\2\u0983\2\u09be\2\u09be\2\u09c3\2\u09c6\2\u09cf\2\u09cf"+
		"\2\u09e4\2\u09e5\2\u0a03\2\u0a04\2\u0a3e\2\u0a3e\2\u0a43\2\u0a44\2\u0a49"+
		"\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53\2\u0a72\2\u0a73\2\u0a77\2\u0a77"+
		"\2\u0a83\2\u0a84\2\u0abe\2\u0abe\2\u0ac3\2\u0ac7\2\u0ac9\2\u0aca\2\u0acf"+
		"\2\u0acf\2\u0ae4\2\u0ae5\2\u0afc\2\u0b01\2\u0b03\2\u0b03\2\u0b3e\2\u0b3e"+
		"\2\u0b41\2\u0b41\2\u0b43\2\u0b46\2\u0b4f\2\u0b4f\2\u0b58\2\u0b58\2\u0b64"+
		"\2\u0b65\2\u0b84\2\u0b84\2\u0bc2\2\u0bc2\2\u0bcf\2\u0bcf\2\u0c02\2\u0c02"+
		"\2\u0c40\2\u0c42\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4f\2\u0c57\2\u0c58\2\u0c64"+
		"\2\u0c65\2\u0c83\2\u0c83\2\u0cbe\2\u0cbe\2\u0cc1\2\u0cc1\2\u0cc8\2\u0cc8"+
		"\2\u0cce\2\u0ccf\2\u0ce4\2\u0ce5\2\u0d02\2\u0d03\2\u0d3d\2\u0d3e\2\u0d43"+
		"\2\u0d46\2\u0d4f\2\u0d4f\2\u0d64\2\u0d65\2\u0dcc\2\u0dcc\2\u0dd4\2\u0dd6"+
		"\2\u0dd8\2\u0dd8\2\u0e33\2\u0e33\2\u0e36\2\u0e3c\2\u0e49\2\u0e50\2\u0eb3"+
		"\2\u0eb3\2\u0eb6\2\u0ebb\2\u0ebd\2\u0ebe\2\u0eca\2\u0ecf\2\u0f1a\2\u0f1b"+
		"\2\u0f37\2\u0f37\2\u0f39\2\u0f39\2\u0f3b\2\u0f3b\2\u0f73\2\u0f80\2\u0f82"+
		"\2\u0f86\2\u0f88\2\u0f89\2\u0f8f\2\u0f99\2\u0f9b\2\u0fbe\2\u0fc8\2\u0fc8"+
		"\2\u102f\2\u1032\2\u1034\2\u1039\2\u103b\2\u103c\2\u103f\2\u1040\2\u105a"+
		"\2\u105b\2\u1060\2\u1062\2\u1073\2\u1076\2\u1084\2\u1084\2\u1087\2\u1088"+
		"\2\u108f\2\u108f\2\u109f\2\u109f\2\u135f\2\u1361\2\u1714\2\u1716\2\u1734"+
		"\2\u1736\2\u1754\2\u1755\2\u1774\2\u1775\2\u17b6\2\u17b7\2\u17b9\2\u17bf"+
		"\2\u17c8\2\u17c8\2\u17cb\2\u17d5\2\u17df\2\u17df\2\u180d\2\u180f\2\u1887"+
		"\2\u1888\2\u18ab\2\u18ab\2\u1922\2\u1924\2\u1929\2\u192a\2\u1934\2\u1934"+
		"\2\u193b\2\u193d\2\u1a19\2\u1a1a\2\u1a1d\2\u1a1d\2\u1a58\2\u1a58\2\u1a5a"+
		"\2\u1a60\2\u1a62\2\u1a62\2\u1a64\2\u1a64\2\u1a67\2\u1a6e\2\u1a75\2\u1a7e"+
		"\2\u1a81\2\u1a81\2\u1ab2\2\u1abf\2\u1b02\2\u1b05\2\u1b36\2\u1b36\2\u1b38"+
		"\2\u1b3c\2\u1b3e\2\u1b3e\2\u1b44\2\u1b44\2\u1b6d\2\u1b75\2\u1b82\2\u1b83"+
		"\2\u1ba4\2\u1ba7\2\u1baa\2\u1bab\2\u1bad\2\u1baf\2\u1be8\2\u1be8\2\u1bea"+
		"\2\u1beb\2\u1bef\2\u1bef\2\u1bf1\2\u1bf3\2\u1c2e\2\u1c35\2\u1c38\2\u1c39"+
		"\2\u1cd2\2\u1cd4\2\u1cd6\2\u1ce2\2\u1ce4\2\u1cea\2\u1cef\2\u1cef\2\u1cf6"+
		"\2\u1cf6\2\u1cfa\2\u1cfb\2\u1dc2\2\u1dfb\2\u1dfd\2\u1e01\2\u20d2\2\u20de"+
		"\2\u20e3\2\u20e3\2\u20e7\2\u20f2\2\u2cf1\2\u2cf3\2\u2d81\2\u2d81\2\u2de2"+
		"\2\u2e01\2\u302c\2\u302f\2\u309b\2\u309c\2\ua671\2\ua671\2\ua676\2\ua67f"+
		"\2\ua6a0\2\ua6a1\2\ua6f2\2\ua6f3\2\ua804\2\ua804\2\ua808\2\ua808\2\ua80d"+
		"\2\ua80d\2\ua827\2\ua828\2\ua8c6\2\ua8c7\2\ua8e2\2\ua8f3\2\ua928\2\ua92f"+
		"\2\ua949\2\ua953\2\ua982\2\ua984\2\ua9b5\2\ua9b5\2\ua9b8\2\ua9bb\2\ua9be"+
		"\2\ua9be\2\ua9e7\2\ua9e7\2\uaa2b\2\uaa30\2\uaa33\2\uaa34\2\uaa37\2\uaa38"+
		"\2\uaa45\2\uaa45\2\uaa4e\2\uaa4e\2\uaa7e\2\uaa7e\2\uaab2\2\uaab2\2\uaab4"+
		"\2\uaab6\2\uaab9\2\uaaba\2\uaac0\2\uaac1\2\uaac3\2\uaac3\2\uaaee\2\uaaef"+
		"\2\uaaf8\2\uaaf8\2\uabe7\2\uabe7\2\uabea\2\uabea\2\uabef\2\uabef\2\ufb20"+
		"\2\ufb20\2\ufe02\2\ufe11\2\ufe22\2\ufe31\2\u01ff\3\u01ff\3\u02e2\3\u02e2"+
		"\3\u0378\3\u037c\3\u0a03\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a11\3\u0a3a"+
		"\3\u0a3c\3\u0a41\3\u0a41\3\u0ae7\3\u0ae8\3\u1003\3\u1003\3\u103a\3\u1048"+
		"\3\u1081\3\u1083\3\u10b5\3\u10b8\3\u10bb\3\u10bc\3\u1102\3\u1104\3\u1129"+
		"\3\u112d\3\u112f\3\u1136\3\u1175\3\u1175\3\u1182\3\u1183\3\u11b8\3\u11c0"+
		"\3\u11cc\3\u11ce\3\u1231\3\u1233\3\u1236\3\u1236\3\u1238\3\u1239\3\u1240"+
		"\3\u1240\3\u12e1\3\u12e1\3\u12e5\3\u12ec\3\u1302\3\u1303\3\u133e\3\u133e"+
		"\3\u1342\3\u1342\3\u1368\3\u136e\3\u1372\3\u1376\3\u143a\3\u1441\3\u1444"+
		"\3\u1446\3\u1448\3\u1448\3\u14b5\3\u14ba\3\u14bc\3\u14bc\3\u14c1\3\u14c2"+
		"\3\u14c4\3\u14c5\3\u15b4\3\u15b7\3\u15be\3\u15bf\3\u15c1\3\u15c2\3\u15de"+
		"\3\u15df\3\u1635\3\u163c\3\u163f\3\u163f\3\u1641\3\u1642\3\u16ad\3\u16ad"+
		"\3\u16af\3\u16af\3\u16b2\3\u16b7\3\u16b9\3\u16b9\3\u171f\3\u1721\3\u1724"+
		"\3\u1727\3\u1729\3\u172d\3\u1a03\3\u1a08\3\u1a0b\3\u1a0c\3\u1a35\3\u1a3a"+
		"\3\u1a3d\3\u1a40\3\u1a49\3\u1a49\3\u1a53\3\u1a58\3\u1a5b\3\u1a5d\3\u1a8c"+
		"\3\u1a98\3\u1a9a\3\u1a9b\3\u1c32\3\u1c38\3\u1c3a\3\u1c3f\3\u1c41\3\u1c41"+
		"\3\u1c94\3\u1ca9\3\u1cac\3\u1cb2\3\u1cb4\3\u1cb5\3\u1cb7\3\u1cb8\3\u1d33"+
		"\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d47\3\u1d49\3\u1d49"+
		"\3\u6af2\3\u6af6\3\u6b32\3\u6b38\3\u6f91\3\u6f94\3\ubc9f\3\ubca0\3\ud169"+
		"\3\ud16b\3\ud17d\3\ud184\3\ud187\3\ud18d\3\ud1ac\3\ud1af\3\ud244\3\ud246"+
		"\3\uda02\3\uda38\3\uda3d\3\uda6e\3\uda77\3\uda77\3\uda86\3\uda86\3\uda9d"+
		"\3\udaa1\3\udaa3\3\udab1\3\ue002\3\ue008\3\ue00a\3\ue01a\3\ue01d\3\ue023"+
		"\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue8d2\3\ue8d8\3\ue946\3\ue94c\3\u0102"+
		"\20\u01f1\20w\2%\2%\2,\2,\2\62\2;\2\u00ab\2\u00ab\2\u00b0\2\u00b0\2\u203e"+
		"\2\u203e\2\u204b\2\u204b\2\u2124\2\u2124\2\u213b\2\u213b\2\u2196\2\u219b"+
		"\2\u21ab\2\u21ac\2\u232a\2\u232a\2\u23d1\2\u23d1\2\u23ef\2\u23f1\2\u23f3"+
		"\2\u23f4\2\u23fa\2\u23fc\2\u24c4\2\u24c4\2\u25ac\2\u25ad\2\u25b8\2\u25b8"+
		"\2\u25c2\2\u25c2\2\u25fd\2\u25fe\2\u2602\2\u2606\2\u2610\2\u2610\2\u2613"+
		"\2\u2613\2\u261a\2\u261a\2\u261f\2\u261f\2\u2622\2\u2622\2\u2624\2\u2625"+
		"\2\u2628\2\u2628\2\u262c\2\u262c\2\u2630\2\u2631\2\u263a\2\u263c\2\u2642"+
		"\2\u2642\2\u2644\2\u2644\2\u2662\2\u2662\2\u2665\2\u2665\2\u2667\2\u2668"+
		"\2\u266a\2\u266a\2\u267d\2\u267d\2\u2694\2\u2694\2\u2696\2\u2699\2\u269b"+
		"\2\u269b\2\u269d\2\u269e\2\u26a2\2\u26a2\2\u26b2\2\u26b3\2\u26ca\2\u26ca"+
		"\2\u26d1\2\u26d1\2\u26d3\2\u26d3\2\u26d5\2\u26d5\2\u26eb\2\u26eb\2\u26f2"+
		"\2\u26f3\2\u26f6\2\u26f6\2\u26f9\2\u26fb\2\u2704\2\u2704\2\u270a\2\u270b"+
		"\2\u270e\2\u270f\2\u2711\2\u2711\2\u2714\2\u2714\2\u2716\2\u2716\2\u2718"+
		"\2\u2718\2\u271f\2\u271f\2\u2723\2\u2723\2\u2735\2\u2736\2\u2746\2\u2746"+
		"\2\u2749\2\u2749\2\u2765\2\u2766\2\u27a3\2\u27a3\2\u2936\2\u2937\2\u2b07"+
		"\2\u2b09\2\u3032\2\u3032\2\u303f\2\u303f\2\u3299\2\u3299\2\u329b\2\u329b"+
		"\2\uf172\3\uf173\3\uf180\3\uf181\3\uf204\3\uf204\3\uf239\3\uf239\3\uf323"+
		"\3\uf323\3\uf326\3\uf32e\3\uf338\3\uf338\3\uf37f\3\uf37f\3\uf398\3\uf399"+
		"\3\uf39b\3\uf39d\3\uf3a0\3\uf3a1\3\uf3cd\3\uf3d0\3\uf3d6\3\uf3e1\3\uf3f5"+
		"\3\uf3f5\3\uf3f7\3\uf3f7\3\uf3f9\3\uf3f9\3\uf441\3\uf441\3\uf443\3\uf443"+
		"\3\uf4ff\3\uf4ff\3\uf54b\3\uf54c\3\uf571\3\uf572\3\uf575\3\uf57b\3\uf589"+
		"\3\uf589\3\uf58c\3\uf58f\3\uf592\3\uf592\3\uf5a7\3\uf5a7\3\uf5aa\3\uf5aa"+
		"\3\uf5b3\3\uf5b4\3\uf5be\3\uf5be\3\uf5c4\3\uf5c6\3\uf5d3\3\uf5d5\3\uf5de"+
		"\3\uf5e0\3\uf5e3\3\uf5e3\3\uf5e5\3\uf5e5\3\uf5ea\3\uf5ea\3\uf5f1\3\uf5f1"+
		"\3\uf5f5\3\uf5f5\3\uf5fc\3\uf5fc\3\uf6cd\3\uf6cd\3\uf6cf\3\uf6d1\3\uf6e2"+
		"\3\uf6e7\3\uf6eb\3\uf6eb\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6f5\3M\2\u231c\2"+
		"\u231d\2\u23eb\2\u23ee\2\u23f2\2\u23f2\2\u23f5\2\u23f5\2\u25ff\2\u2600"+
		"\2\u2616\2\u2617\2\u264a\2\u2655\2\u2681\2\u2681\2\u2695\2\u2695\2\u26a3"+
		"\2\u26a3\2\u26ac\2\u26ad\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26d0\2\u26d0"+
		"\2\u26d6\2\u26d6\2\u26ec\2\u26ec\2\u26f4\2\u26f5\2\u26f7\2\u26f7\2\u26fc"+
		"\2\u26fc\2\u26ff\2\u26ff\2\u2707\2\u2707\2\u270c\2\u270d\2\u272a\2\u272a"+
		"\2\u274e\2\u274e\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759\2\u2797"+
		"\2\u2799\2\u27b2\2\u27b2\2\u27c1\2\u27c1\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52"+
		"\2\u2b57\2\u2b57\2\uf006\3\uf006\3\uf0d1\3\uf0d1\3\uf190\3\uf190\3\uf193"+
		"\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf203\3\uf21c\3\uf21c\3\uf231\3\uf231"+
		"\3\uf234\3\uf238\3\uf23a\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf322\3\uf32f"+
		"\3\uf337\3\uf339\3\uf37e\3\uf380\3\uf395\3\uf3a2\3\uf3cc\3\uf3d1\3\uf3d5"+
		"\3\uf3e2\3\uf3f2\3\uf3f6\3\uf3f6\3\uf3fa\3\uf440\3\uf442\3\uf442\3\uf444"+
		"\3\uf4fe\3\uf501\3\uf53f\3\uf54d\3\uf550\3\uf552\3\uf569\3\uf57c\3\uf57c"+
		"\3\uf597\3\uf598\3\uf5a6\3\uf5a6\3\uf5fd\3\uf651\3\uf682\3\uf6c7\3\uf6ce"+
		"\3\uf6ce\3\uf6d2\3\uf6d4\3\uf6ed\3\uf6ee\3\uf6f6\3\uf6fa\3\uf912\3\uf93c"+
		"\3\uf93e\3\uf940\3\uf942\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982"+
		"\3\uf999\3\uf9c2\3\uf9c2\3\uf9d2\3\uf9e8\3\u0093\2%\2%\2,\2,\2\62\2;\2"+
		"\u00ab\2\u00ab\2\u00b0\2\u00b0\2\u203e\2\u203e\2\u204b\2\u204b\2\u2124"+
		"\2\u2124\2\u213b\2\u213b\2\u2196\2\u219b\2\u21ab\2\u21ac\2\u231c\2\u231d"+
		"\2\u232a\2\u232a\2\u23d1\2\u23d1\2\u23eb\2\u23f5\2\u23fa\2\u23fc\2\u24c4"+
		"\2\u24c4\2\u25ac\2\u25ad\2\u25b8\2\u25b8\2\u25c2\2\u25c2\2\u25fd\2\u2600"+
		"\2\u2602\2\u2606\2\u2610\2\u2610\2\u2613\2\u2613\2\u2616\2\u2617\2\u261a"+
		"\2\u261a\2\u261f\2\u261f\2\u2622\2\u2622\2\u2624\2\u2625\2\u2628\2\u2628"+
		"\2\u262c\2\u262c\2\u2630\2\u2631\2\u263a\2\u263c\2\u2642\2\u2642\2\u2644"+
		"\2\u2644\2\u264a\2\u2655\2\u2662\2\u2662\2\u2665\2\u2665\2\u2667\2\u2668"+
		"\2\u266a\2\u266a\2\u267d\2\u267d\2\u2681\2\u2681\2\u2694\2\u2699\2\u269b"+
		"\2\u269b\2\u269d\2\u269e\2\u26a2\2\u26a3\2\u26ac\2\u26ad\2\u26b2\2\u26b3"+
		"\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26ca\2\u26ca\2\u26d0\2\u26d1\2\u26d3"+
		"\2\u26d3\2\u26d5\2\u26d6\2\u26eb\2\u26ec\2\u26f2\2\u26f7\2\u26f9\2\u26fc"+
		"\2\u26ff\2\u26ff\2\u2704\2\u2704\2\u2707\2\u2707\2\u270a\2\u270f\2\u2711"+
		"\2\u2711\2\u2714\2\u2714\2\u2716\2\u2716\2\u2718\2\u2718\2\u271f\2\u271f"+
		"\2\u2723\2\u2723\2\u272a\2\u272a\2\u2735\2\u2736\2\u2746\2\u2746\2\u2749"+
		"\2\u2749\2\u274e\2\u274e\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759"+
		"\2\u2765\2\u2766\2\u2797\2\u2799\2\u27a3\2\u27a3\2\u27b2\2\u27b2\2\u27c1"+
		"\2\u27c1\2\u2936\2\u2937\2\u2b07\2\u2b09\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52"+
		"\2\u2b57\2\u2b57\2\u3032\2\u3032\2\u303f\2\u303f\2\u3299\2\u3299\2\u329b"+
		"\2\u329b\2\uf006\3\uf006\3\uf0d1\3\uf0d1\3\uf172\3\uf173\3\uf180\3\uf181"+
		"\3\uf190\3\uf190\3\uf193\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf204\3\uf21c"+
		"\3\uf21c\3\uf231\3\uf231\3\uf234\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf323"+
		"\3\uf326\3\uf395\3\uf398\3\uf399\3\uf39b\3\uf39d\3\uf3a0\3\uf3f2\3\uf3f5"+
		"\3\uf3f7\3\uf3f9\3\uf4ff\3\uf501\3\uf53f\3\uf54b\3\uf550\3\uf552\3\uf569"+
		"\3\uf571\3\uf572\3\uf575\3\uf57c\3\uf589\3\uf589\3\uf58c\3\uf58f\3\uf592"+
		"\3\uf592\3\uf597\3\uf598\3\uf5a6\3\uf5a7\3\uf5aa\3\uf5aa\3\uf5b3\3\uf5b4"+
		"\3\uf5be\3\uf5be\3\uf5c4\3\uf5c6\3\uf5d3\3\uf5d5\3\uf5de\3\uf5e0\3\uf5e3"+
		"\3\uf5e3\3\uf5e5\3\uf5e5\3\uf5ea\3\uf5ea\3\uf5f1\3\uf5f1\3\uf5f5\3\uf5f5"+
		"\3\uf5fc\3\uf651\3\uf682\3\uf6c7\3\uf6cd\3\uf6d4\3\uf6e2\3\uf6e7\3\uf6eb"+
		"\3\uf6eb\3\uf6ed\3\uf6ee\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6fa\3\uf912\3\uf93c"+
		"\3\uf93e\3\uf940\3\uf942\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982"+
		"\3\uf999\3\uf9c2\3\uf9c2\3\uf9d2\3\uf9e8\3\"\2\u261f\2\u261f\2\u26fb\2"+
		"\u26fb\2\u270c\2\u270f\2\uf387\3\uf387\3\uf3c4\3\uf3c6\3\uf3c9\3\uf3c9"+
		"\3\uf3cc\3\uf3ce\3\uf444\3\uf445\3\uf448\3\uf452\3\uf468\3\uf46b\3\uf470"+
		"\3\uf470\3\uf472\3\uf47a\3\uf47e\3\uf47e\3\uf483\3\uf485\3\uf487\3\uf489"+
		"\3\uf4ac\3\uf4ac\3\uf576\3\uf577\3\uf57c\3\uf57c\3\uf592\3\uf592\3\uf597"+
		"\3\uf598\3\uf647\3\uf649\3\uf64d\3\uf651\3\uf6a5\3\uf6a5\3\uf6b6\3\uf6b8"+
		"\3\uf6c2\3\uf6c2\3\uf6ce\3\uf6ce\3\uf91a\3\uf91e\3\uf920\3\uf921\3\uf928"+
		"\3\uf928\3\uf932\3\uf93b\3\uf93f\3\uf940\3\uf9d3\3\uf9df\3\3\2\uf3fd\3"+
		"\uf401\3\3\2\uf1e8\3\uf201\3h\2\u238a\2\u238a\2\u2607\2\u2607\2\u2609"+
		"\2\u260f\2\u2611\2\u2612\2\u2614\2\u2614\2\u2618\2\u2619\2\u261b\2\u261e"+
		"\2\u2620\2\u2621\2\u2623\2\u2623\2\u2626\2\u2627\2\u2629\2\u262b\2\u262d"+
		"\2\u262f\2\u2632\2\u2639\2\u263d\2\u2649\2\u2656\2\u2661\2\u2663\2\u2664"+
		"\2\u2666\2\u2666\2\u2669\2\u2669\2\u266b\2\u267c\2\u267e\2\u2680\2\u2682"+
		"\2\u2693\2\u2697\2\u2697\2\u269a\2\u269a\2\u269c\2\u269c\2\u269f\2\u26a1"+
		"\2\u26a4\2\u26ab\2\u26ae\2\u26b1\2\u26b4\2\u26be\2\u26c1\2\u26c5\2\u26c8"+
		"\2\u26c9\2\u26cb\2\u26cf\2\u26d2\2\u26d2\2\u26d4\2\u26d4\2\u26d7\2\u26ea"+
		"\2\u26ed\2\u26f1\2\u26f8\2\u26f8\2\u26fd\2\u26fe\2\u2700\2\u2703\2\u2705"+
		"\2\u2706\2\u2710\2\u2710\2\u2712\2\u2713\2\u2767\2\u2769\2\uf002\3\uf005"+
		"\3\uf007\3\uf101\3\uf10f\3\uf111\3\uf131\3\uf131\3\uf16e\3\uf171\3\uf1af"+
		"\3\uf1e7\3\uf205\3\uf211\3\uf23e\3\uf241\3\uf24b\3\uf251\3\uf254\3\uf301"+
		"\3\uf324\3\uf325\3\uf396\3\uf397\3\uf39a\3\uf39a\3\uf39e\3\uf39f\3\uf3f3"+
		"\3\uf3f4\3\uf3f8\3\uf3f8\3\uf500\3\uf500\3\uf540\3\uf54a\3\uf551\3\uf551"+
		"\3\uf56a\3\uf570\3\uf573\3\uf574\3\uf57d\3\uf588\3\uf58a\3\uf58b\3\uf590"+
		"\3\uf591\3\uf593\3\uf596\3\uf599\3\uf5a5\3\uf5a8\3\uf5a9\3\uf5ab\3\uf5b2"+
		"\3\uf5b5\3\uf5bd\3\uf5bf\3\uf5c3\3\uf5c7\3\uf5d2\3\uf5d6\3\uf5dd\3\uf5e1"+
		"\3\uf5e2\3\uf5e4\3\uf5e4\3\uf5e6\3\uf5e9\3\uf5eb\3\uf5f0\3\uf5f2\3\uf5f4"+
		"\3\uf5f6\3\uf5fb\3\uf6c8\3\uf6cc\3\uf6d5\3\uf6e1\3\uf6e8\3\uf6ea\3\uf6ec"+
		"\3\uf6ec\3\uf6ef\3\uf6f1\3\uf6f3\3\uf6f4\3\uf6f9\3\uf701\3\uf776\3\uf781"+
		"\3\uf7d7\3\uf801\3\uf80e\3\uf811\3\uf84a\3\uf851\3\uf85c\3\uf861\3\uf88a"+
		"\3\uf891\3\uf8b0\3\uf911\3\uf921\3\uf921\3\uf92a\3\uf931\3\uf933\3\uf934"+
		"\3\uf941\3\uf941\3\uf94e\3\uf951\3\uf961\3\uf981\3\uf994\3\uf9c1\3\uf9c3"+
		"\3\uffff\3\3\2\"\20\u0080\20\3\2\u0081\20\u0081\20\f\2\u0602\2\u0607\2"+
		"\u06df\2\u06df\2\u0711\2\u0711\2\u08e4\2\u08e4\2\u0d50\2\u0d50\2\u10bf"+
		"\3\u10bf\3\u11c4\3\u11c5\3\u1a3c\3\u1a3c\3\u1a88\3\u1a8b\3\u1d48\3\u1d48"+
		"\3\25\2\f\2\f\2\17\2\17\2\"\2\u0080\2\u00a2\2\u00ae\2\u00b0\2\u061d\2"+
		"\u061f\2\u180f\2\u1811\2\u200c\2\u200e\2\u200f\2\u2012\2\u2029\2\u2031"+
		"\2\u2061\2\u2072\2\ud801\2\ue002\2\uff00\2\uff02\2\ufff1\2\ufffe\2\ubca1"+
		"\3\ubca6\3\ud174\3\ud17d\3\1\17\"\20\u0081\20\u0102\20\u01f1\20\u1002"+
		"\20\1\22\u03d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0103\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113"+
		"\3\2\2\2\3\u0115\3\2\2\2\5\u0119\3\2\2\2\7\u011d\3\2\2\2\t\u0121\3\2\2"+
		"\2\13\u0125\3\2\2\2\r\u0129\3\2\2\2\17\u012d\3\2\2\2\21\u0131\3\2\2\2"+
		"\23\u0135\3\2\2\2\25\u0139\3\2\2\2\27\u013d\3\2\2\2\31\u0141\3\2\2\2\33"+
		"\u0145\3\2\2\2\35\u0149\3\2\2\2\37\u014d\3\2\2\2!\u0151\3\2\2\2#\u0155"+
		"\3\2\2\2%\u0159\3\2\2\2\'\u015d\3\2\2\2)\u0161\3\2\2\2+\u0165\3\2\2\2"+
		"-\u0169\3\2\2\2/\u016d\3\2\2\2\61\u0172\3\2\2\2\63\u0177\3\2\2\2\65\u017c"+
		"\3\2\2\2\67\u0181\3\2\2\29\u0186\3\2\2\2;\u018b\3\2\2\2=\u0190\3\2\2\2"+
		"?\u0195\3\2\2\2A\u019a\3\2\2\2C\u019f\3\2\2\2E\u01a4\3\2\2\2G\u01a9\3"+
		"\2\2\2I\u01ae\3\2\2\2K\u01b3\3\2\2\2M\u01b8\3\2\2\2O\u01bd\3\2\2\2Q\u01c2"+
		"\3\2\2\2S\u01c7\3\2\2\2U\u01cc\3\2\2\2W\u01d1\3\2\2\2Y\u01d6\3\2\2\2["+
		"\u01db\3\2\2\2]\u01e0\3\2\2\2_\u01e5\3\2\2\2a\u01ea\3\2\2\2c\u01ef\3\2"+
		"\2\2e\u01f4\3\2\2\2g\u01f9\3\2\2\2i\u01fe\3\2\2\2k\u0203\3\2\2\2m\u0208"+
		"\3\2\2\2o\u020d\3\2\2\2q\u0212\3\2\2\2s\u0217\3\2\2\2u\u021c\3\2\2\2w"+
		"\u0221\3\2\2\2y\u0226\3\2\2\2{\u022b\3\2\2\2}\u0230\3\2\2\2\177\u0235"+
		"\3\2\2\2\u0081\u023a\3\2\2\2\u0083\u023f\3\2\2\2\u0085\u0244\3\2\2\2\u0087"+
		"\u0249\3\2\2\2\u0089\u024e\3\2\2\2\u008b\u0253\3\2\2\2\u008d\u0258\3\2"+
		"\2\2\u008f\u025d\3\2\2\2\u0091\u0262\3\2\2\2\u0093\u0267\3\2\2\2\u0095"+
		"\u026c\3\2\2\2\u0097\u0271\3\2\2\2\u0099\u0276\3\2\2\2\u009b\u027b\3\2"+
		"\2\2\u009d\u0280\3\2\2\2\u009f\u0285\3\2\2\2\u00a1\u028a\3\2\2\2\u00a3"+
		"\u028f\3\2\2\2\u00a5\u0294\3\2\2\2\u00a7\u0299\3\2\2\2\u00a9\u029e\3\2"+
		"\2\2\u00ab\u02a3\3\2\2\2\u00ad\u02a8\3\2\2\2\u00af\u02ad\3\2\2\2\u00b1"+
		"\u02b2\3\2\2\2\u00b3\u02b7\3\2\2\2\u00b5\u02bc\3\2\2\2\u00b7\u02c1\3\2"+
		"\2\2\u00b9\u02c6\3\2\2\2\u00bb\u02cb\3\2\2\2\u00bd\u02d1\3\2\2\2\u00bf"+
		"\u02d7\3\2\2\2\u00c1\u02dd\3\2\2\2\u00c3\u02e3\3\2\2\2\u00c5\u02e9\3\2"+
		"\2\2\u00c7\u02ef\3\2\2\2\u00c9\u02f5\3\2\2\2\u00cb\u02fb\3\2\2\2\u00cd"+
		"\u0301\3\2\2\2\u00cf\u0307\3\2\2\2\u00d1\u030d\3\2\2\2\u00d3\u0313\3\2"+
		"\2\2\u00d5\u0319\3\2\2\2\u00d7\u031f\3\2\2\2\u00d9\u0325\3\2\2\2\u00db"+
		"\u032b\3\2\2\2\u00dd\u0332\3\2\2\2\u00df\u0339\3\2\2\2\u00e1\u033b\3\2"+
		"\2\2\u00e3\u033d\3\2\2\2\u00e5\u033f\3\2\2\2\u00e7\u0341\3\2\2\2\u00e9"+
		"\u0343\3\2\2\2\u00eb\u0345\3\2\2\2\u00ed\u0347\3\2\2\2\u00ef\u0349\3\2"+
		"\2\2\u00f1\u034c\3\2\2\2\u00f3\u034f\3\2\2\2\u00f5\u0351\3\2\2\2\u00f7"+
		"\u0354\3\2\2\2\u00f9\u0357\3\2\2\2\u00fb\u0359\3\2\2\2\u00fd\u035e\3\2"+
		"\2\2\u00ff\u0369\3\2\2\2\u0101\u036e\3\2\2\2\u0103\u0370\3\2\2\2\u0105"+
		"\u037b\3\2\2\2\u0107\u037e\3\2\2\2\u0109\u0382\3\2\2\2\u010b\u0384\3\2"+
		"\2\2\u010d\u0388\3\2\2\2\u010f\u038a\3\2\2\2\u0111\u038c\3\2\2\2\u0113"+
		"\u03ca\3\2\2\2\u0115\u0116\7]\2\2\u0116\u0117\7\u4e72\2\2\u0117\u0118"+
		"\7_\2\2\u0118\4\3\2\2\2\u0119\u011a\7]\2\2\u011a\u011b\7\u505e\2\2\u011b"+
		"\u011c\7_\2\2\u011c\6\3\2\2\2\u011d\u011e\7]\2\2\u011e\u011f\7\u50b4\2"+
		"\2\u011f\u0120\7_\2\2\u0120\b\3\2\2\2\u0121\u0122\7]\2\2\u0122\u0123\7"+
		"\u51d1\2\2\u0123\u0124\7_\2\2\u0124\n\3\2\2\2\u0125\u0126\7]\2\2\u0126"+
		"\u0127\7\u52a2\2\2\u0127\u0128\7_\2\2\u0128\f\3\2\2\2\u0129\u012a\7]\2"+
		"\2\u012a\u012b\7\u5358\2\2\u012b\u012c\7_\2\2\u012c\16\3\2\2\2\u012d\u012e"+
		"\7]\2\2\u012e\u012f\7\u54ef\2\2\u012f\u0130\7_\2\2\u0130\20\3\2\2\2\u0131"+
		"\u0132\7]\2\2\u0132\u0133\7\u56e9\2\2\u0133\u0134\7_\2\2\u0134\22\3\2"+
		"\2\2\u0135\u0136\7]\2\2\u0136\u0137\7\u56f2\2\2\u0137\u0138\7_\2\2\u0138"+
		"\24\3\2\2\2\u0139\u013a\7]\2\2\u013a\u013b\7\u591c\2\2\u013b\u013c\7_"+
		"\2\2\u013c\26\3\2\2\2\u013d\u013e\7]\2\2\u013e\u013f\7\u5c50\2\2\u013f"+
		"\u0140\7_\2\2\u0140\30\3\2\2\2\u0141\u0142\7]\2\2\u0142\u0143\7\u6657"+
		"\2\2\u0143\u0144\7_\2\2\u0144\32\3\2\2\2\u0145\u0146\7]\2\2\u0146\u0147"+
		"\7\u6c59\2\2\u0147\u0148\7_\2\2\u0148\34\3\2\2\2\u0149\u014a\7]\2\2\u014a"+
		"\u014b\7\u6daa\2\2\u014b\u014c\7_\2\2\u014c\36\3\2\2\2\u014d\u014e\7]"+
		"\2\2\u014e\u014f\7\u7233\2\2\u014f\u0150\7_\2\2\u0150 \3\2\2\2\u0151\u0152"+
		"\7]\2\2\u0152\u0153\7\u725d\2\2\u0153\u0154\7_\2\2\u0154\"\3\2\2\2\u0155"+
		"\u0156\7]\2\2\u0156\u0157\7\u7a7c\2\2\u0157\u0158\7_\2\2\u0158$\3\2\2"+
		"\2\u0159\u015a\7]\2\2\u015a\u015b\7\u7b13\2\2\u015b\u015c\7_\2\2\u015c"+
		"&\3\2\2\2\u015d\u015e\7]\2\2\u015e\u015f\7\u8274\2\2\u015f\u0160\7_\2"+
		"\2\u0160(\3\2\2\2\u0161\u0162\7]\2\2\u0162\u0163\7\u8d2e\2\2\u0163\u0164"+
		"\7_\2\2\u0164*\3\2\2\2\u0165\u0166\7]\2\2\u0166\u0167\7\u8d60\2\2\u0167"+
		"\u0168\7_\2\2\u0168,\3\2\2\2\u0169\u016a\7]\2\2\u016a\u016b\7\u8dce\2"+
		"\2\u016b\u016c\7_\2\2\u016c.\3\2\2\2\u016d\u016e\7]\2\2\u016e\u016f\7"+
		"\u4e0f\2\2\u016f\u0170\7\u5c53\2\2\u0170\u0171\7_\2\2\u0171\60\3\2\2\2"+
		"\u0172\u0173\7]\2\2\u0173\u0174\7\u4e0f\2\2\u0174\u0175\7\u8d60\2\2\u0175"+
		"\u0176\7_\2\2\u0176\62\3\2\2\2\u0177\u0178\7]\2\2\u0178\u0179\7\u4e2f"+
		"\2\2\u0179\u017a\7\u7b80\2\2\u017a\u017b\7_\2\2\u017b\64\3\2\2\2\u017c"+
		"\u017d\7]\2\2\u017d\u017e\7\u4e3d\2\2\u017e\u017f\7\u529d\2\2\u017f\u0180"+
		"\7_\2\2\u0180\66\3\2\2\2\u0181\u0182\7]\2\2\u0182\u0183\7\u4e72\2\2\u0183"+
		"\u0184\7\u5167\2\2\u0184\u0185\7_\2\2\u01858\3\2\2\2\u0186\u0187\7]\2"+
		"\2\u0187\u0188\7\u4eb4\2\2\u0188\u0189\7\u4eb4\2\2\u0189\u018a\7_\2\2"+
		"\u018a:\3\2\2\2\u018b\u018c\7]\2\2\u018c\u018d\7\u4ef2\2\2\u018d\u018e"+
		"\7\u6157\2\2\u018e\u018f\7_\2\2\u018f<\3\2\2\2\u0190\u0191\7]\2\2\u0191"+
		"\u0192\7\u4fd1\2\2\u0192\u0193\7\u76b0\2\2\u0193\u0194\7_\2\2\u0194>\3"+
		"\2\2\2\u0195\u0196\7]\2\2\u0196\u0197\7\u50b4\2\2\u0197\u0198\7\u6164"+
		"\2\2\u0198\u0199\7_\2\2\u0199@\3\2\2\2\u019a\u019b\7]\2\2\u019b\u019c"+
		"\7\u51cd\2\2\u019c\u019d\7\u8c24\2\2\u019d\u019e\7_\2\2\u019eB\3\2\2\2"+
		"\u019f\u01a0\7]\2\2\u01a0\u01a1\7\u51d1\2\2\u01a1\u01a2\7\u4ed5\2\2\u01a2"+
		"\u01a3\7_\2\2\u01a3D\3\2\2\2\u01a4\u01a5\7]\2\2\u01a5\u01a6\7\u5274\2"+
		"\2\u01a6\u01a7\7\u808b\2\2\u01a7\u01a8\7_\2\2\u01a8F\3\2\2\2\u01a9\u01aa"+
		"\7]\2\2\u01aa\u01ab\7\u52a2\2\2\u01ab\u01ac\7\u4ed5\2\2\u01ac\u01ad\7"+
		"_\2\2\u01adH\3\2\2\2\u01ae\u01af\7]\2\2\u01af\u01b0\7\u52a2\2\2\u01b0"+
		"\u01b1\7\u6cbb\2\2\u01b1\u01b2\7_\2\2\u01b2J\3\2\2\2\u01b3\u01b4\7]\2"+
		"\2\u01b4\u01b5\7\u5358\2\2\u01b5\u01b6\7\u51fc\2\2\u01b6\u01b7\7_\2\2"+
		"\u01b7L\3\2\2\2\u01b8\u01b9\7]\2\2\u01b9\u01ba\7\u5358\2\2\u01ba\u01bb"+
		"\7\u8ead\2\2\u01bb\u01bc\7_\2\2\u01bcN\3\2\2\2\u01bd\u01be\7]\2\2\u01be"+
		"\u01bf\7\u53f1\2\2\u01bf\u01c0\7\u601e\2\2\u01c0\u01c1\7_\2\2\u01c1P\3"+
		"\2\2\2\u01c2\u01c3\7]\2\2\u01c3\u01c4\7\u53f1\2\2\u01c4\u01c5\7\u7233"+
		"\2\2\u01c5\u01c6\7_\2\2\u01c6R\3\2\2\2\u01c7\u01c8\7]\2\2\u01c8\u01c9"+
		"\7\u5412\2\2\u01c9\u01ca\7\u820e\2\2\u01ca\u01cb\7_\2\2\u01cbT\3\2\2\2"+
		"\u01cc\u01cd\7]\2\2\u01cd\u01ce\7\u5412\2\2\u01ce\u01cf\7\u8842\2\2\u01cf"+
		"\u01d0\7_\2\2\u01d0V\3\2\2\2\u01d1\u01d2\7]\2\2\u01d2\u01d3\7\u5477\2"+
		"\2\u01d3\u01d4\7\u5477\2\2\u01d4\u01d5\7_\2\2\u01d5X\3\2\2\2\u01d6\u01d7"+
		"\7]\2\2\u01d7\u01d8\7\u54ca\2\2\u01d8\u01d9\7\u54ca\2\2\u01d9\u01da\7"+
		"_\2\2\u01daZ\3\2\2\2\u01db\u01dc\7]\2\2\u01dc\u01dd\7\u54ef\2\2\u01dd"+
		"\u01de\7\u6ce5\2\2\u01de\u01df\7_\2\2\u01df\\\3\2\2\2\u01e0\u01e1\7]\2"+
		"\2\u01e1\u01e2\7\u56f2\2\2\u01e2\u01e3\7\u60d3\2\2\u01e3\u01e4\7_\2\2"+
		"\u01e4^\3\2\2\2\u01e5\u01e6\7]\2\2\u01e6\u01e7\7\u56f2\2\2\u01e7\u01e8"+
		"\7\u9881\2\2\u01e8\u01e9\7_\2\2\u01e9`\3\2\2\2\u01ea\u01eb\7]\2\2\u01eb"+
		"\u01ec\7\u56f6\2\2\u01ec\u01ed\7\u89c4\2\2\u01ed\u01ee\7_\2\2\u01eeb\3"+
		"\2\2\2\u01ef\u01f0\7]\2\2\u01f0\u01f1\7\u590f\2\2\u01f1\u01f2\7\u76da"+
		"\2\2\u01f2\u01f3\7_\2\2\u01f3d\3\2\2\2\u01f4\u01f5\7]\2\2\u01f5\u01f6"+
		"\7\u5929\2\2\u01f6\u01f7\7\u7b13\2\2\u01f7\u01f8\7_\2\2\u01f8f\3\2\2\2"+
		"\u01f9\u01fa\7]\2\2\u01fa\u01fb\7\u5933\2\2\u01fb\u01fc\7\u671d\2\2\u01fc"+
		"\u01fd\7_\2\2\u01fdh\3\2\2\2\u01fe\u01ff\7]\2\2\u01ff\u0200\7\u597f\2"+
		"\2\u0200\u0201\7\u900c\2\2\u0201\u0202\7_\2\2\u0202j\3\2\2\2\u0203\u0204"+
		"\7]\2\2\u0204\u0205\7\u5bb5\2\2\u0205\u0206\7\u7fa0\2\2\u0206\u0207\7"+
		"_\2\2\u0207l\3\2\2\2\u0208\u0209\7]\2\2\u0209\u020a\7\u5c36\2\2\u020a"+
		"\u020b\7\u5c2e\2\2\u020b\u020c\7_\2\2\u020cn\3\2\2\2\u020d\u020e\7]\2"+
		"\2\u020e\u020f\7\u5e74\2\2\u020f\u0210\7\u6771\2\2\u0210\u0211\7_\2\2"+
		"\u0211p\3\2\2\2\u0212\u0213\7]\2\2\u0213\u0214\7\u5f8a\2\2\u0214\u0215"+
		"\7\u8d60\2\2\u0215\u0216\7_\2\2\u0216r\3\2\2\2\u0217\u0218\7]\2\2\u0218"+
		"\u0219\7\u5fb0\2\2\u0219\u021a\7\u7b13\2\2\u021a\u021b\7_\2\2\u021bt\3"+
		"\2\2\2\u021c\u021d\7]\2\2\u021d\u021e\7\u5fc5\2\2\u021e\u021f\7\u5fc5"+
		"\2\2\u021f\u0220\7_\2\2\u0220v\3\2\2\2\u0221\u0222\7]\2\2\u0222\u0223"+
		"\7\u5fc5\2\2\u0223\u0224\7\u7890\2\2\u0224\u0225\7_\2\2\u0225x\3\2\2\2"+
		"\u0226\u0227\7]\2\2\u0227\u0228\7\u6014\2\2\u0228\u0229\7\u4e88\2\2\u0229"+
		"\u022a\7_\2\2\u022az\3\2\2\2\u022b\u022c\7]\2\2\u022c\u022d\7\u601f\2"+
		"\2\u022d\u022e\7\u8005\2\2\u022e\u022f\7_\2\2\u022f|\3\2\2\2\u0230\u0231"+
		"\7]\2\2\u0231\u0232\7\u6212\2\2\u0232\u0233\7\u4ea6\2\2\u0233\u0234\7"+
		"_\2\2\u0234~\3\2\2\2\u0235\u0236\7]\2\2\u0236\u0237\7\u6286\2\2\u0237"+
		"\u0238\7\u5e97\2\2\u0238\u0239\7_\2\2\u0239\u0080\3\2\2\2\u023a\u023b"+
		"\7]\2\2\u023b\u023c\7\u62a2\2\2\u023c\u023d\7\u9f3d\2\2\u023d\u023e\7"+
		"_\2\2\u023e\u0082\3\2\2\2\u023f\u0240\7]\2\2\u0240\u0241\7\u6325\2\2\u0241"+
		"\u0242\7\u6250\2\2\u0242\u0243\7_\2\2\u0243\u0084\3\2\2\2\u0244\u0245"+
		"\7]\2\2\u0245\u0246\7\u6344\2\2\u0246\u0247\7\u813a\2\2\u0247\u0248\7"+
		"_\2\2\u0248\u0086\3\2\2\2\u0249\u024a\7]\2\2\u024a\u024b\7\u63e3\2\2\u024b"+
		"\u024c\7\u624d\2\2\u024c\u024d\7_\2\2\u024d\u0088\3\2\2\2\u024e\u024f"+
		"\7]\2\2\u024f\u0250\7\u644c\2\2\u0250\u0251\7\u624d\2\2\u0251\u0252\7"+
		"_\2\2\u0252\u008a\3\2\2\2\u0253\u0254\7]\2\2\u0254\u0255\7\u65e2\2\2\u0255"+
		"\u0256\7\u8bef\2\2\u0256\u0257\7_\2\2\u0257\u008c\3\2\2\2\u0258\u0259"+
		"\7]\2\2\u0259\u025a\7\u68af\2\2\u025a\u025b\7\u54ca\2\2\u025b\u025c\7"+
		"_\2\2\u025c\u008e\3\2\2\2\u025d\u025e\7]\2\2\u025e\u025f\7\u6ee3\2\2\u025f"+
		"\u0260\7\u4ed5\2\2\u0260\u0261\7_\2\2\u0261\u0090\3\2\2\2\u0262\u0263"+
		"\7]\2\2\u0263\u0264\7\u6ef6\2\2\u0264\u0265\7\u6c59\2\2\u0265\u0266\7"+
		"_\2\2\u0266\u0092\3\2\2\2\u0267\u0268\7]\2\2\u0268\u0269\7\u7330\2\2\u0269"+
		"\u026a\7\u82b3\2\2\u026a\u026b\7_\2\2\u026b\u0094\3\2\2\2\u026c\u026d"+
		"\7]\2\2\u026d\u026e\7\u7521\2\2\u026e\u026f\7\u6c16\2\2\u026f\u0270\7"+
		"_\2\2\u0270\u0096\3\2\2\2\u0271\u0272\7]\2\2\u0272\u0273\7\u7593\2\2\u0273"+
		"\u0274\7\u95f0\2\2\u0274\u0275\7_\2\2\u0275\u0098\3\2\2\2\u0276\u0277"+
		"\7]\2\2\u0277\u0278\7\u770d\2\2\u0278\u0279\7\u591c\2\2\u0279\u027a\7"+
		"_\2\2\u027a\u009a\3\2\2\2\u027b\u027c\7]\2\2\u027c\u027d\7\u770d\2\2\u027d"+
		"\u027e\7\u7a7c\2\2\u027e\u027f\7_\2\2\u027f\u009c\3\2\2\2\u0280\u0281"+
		"\7]\2\2\u0281\u0282\7\u79da\2\2\u0282\u0283\7\u5bc8\2\2\u0283\u0284\7"+
		"_\2\2\u0284\u009e\3\2\2\2\u0285\u0286\7]\2\2\u0286\u0287\7\u7a7c\2\2\u0287"+
		"\u0288\7\u4ed5\2\2\u0288\u0289\7_\2\2\u0289\u00a0\3\2\2\2\u028a\u028b"+
		"\7]\2\2\u028b\u028c\7\u7b13\2\2\u028c\u028d\7\u54ef\2\2\u028d\u028e\7"+
		"_\2\2\u028e\u00a2\3\2\2\2\u028f\u0290\7]\2\2\u0290\u0291\7\u80de\2\2\u0291"+
		"\u0292\7\u522b\2\2\u0292\u0293\7_\2\2\u0293\u00a4\3\2\2\2\u0294\u0295"+
		"\7]\2\2\u0295\u0296\7\u8baa\2\2\u0296\u0297\7\u538e\2\2\u0297\u0298\7"+
		"_\2\2\u0298\u00a6\3\2\2\2\u0299\u029a\7]\2\2\u029a\u029b\7\u8bc7\2\2\u029b"+
		"\u029c\7\u5494\2\2\u029c\u029d\7_\2\2\u029d\u00a8\3\2\2\2\u029e\u029f"+
		"\7]\2\2\u029f\u02a0\7\u8c05\2\2\u02a0\u02a1\7\u76b0\2\2\u02a1\u02a2\7"+
		"_\2\2\u02a2\u00aa\3\2\2\2\u02a3\u02a4\7]\2\2\u02a4\u02a5\7\u8d2c\2\2\u02a5"+
		"\u02a6\7\u8d24\2\2\u02a6\u02a7\7_\2\2\u02a7\u00ac\3\2\2\2\u02a8\u02a9"+
		"\7]\2\2\u02a9\u02aa\7\u8d60\2\2\u02aa\u02ab\7\u6212\2\2\u02ab\u02ac\7"+
		"_\2\2\u02ac\u00ae\3\2\2\2\u02ad\u02ae\7]\2\2\u02ae\u02af\7\u8dec\2\2\u02af"+
		"\u02b0\7\u4e88\2\2\u02b0\u02b1\7_\2\2\u02b1\u00b0\3\2\2\2\u02b2\u02b3"+
		"\7]\2\2\u02b3\u02b4\7\u8df5\2\2\u02b4\u02b5\7\u6c36\2\2\u02b5\u02b6\7"+
		"_\2\2\u02b6\u00b2\3\2\2\2\u02b7\u02b8\7]\2\2\u02b8\u02b9\7\u95ef\2\2\u02b9"+
		"\u02ba\7\u5636\2\2\u02ba\u02bb\7_\2\2\u02bb\u00b4\3\2\2\2\u02bc\u02bd"+
		"\7]\2\2\u02bd\u02be\7\u96c0\2\2\u02be\u02bf\7\u8fc9\2\2\u02bf\u02c0\7"+
		"_\2\2\u02c0\u00b6\3\2\2\2\u02c1\u02c2\7]\2\2\u02c2\u02c3\7\u97ef\2\2\u02c3"+
		"\u02c4\7\u83de\2\2\u02c4\u02c5\7_\2\2\u02c5\u00b8\3\2\2\2\u02c6\u02c7"+
		"\7]\2\2\u02c7\u02c8\7\u9f15\2\2\u02c8\u02c9\7\u638e\2\2\u02c9\u02ca\7"+
		"_\2\2\u02ca\u00ba\3\2\2\2\u02cb\u02cc\7]\2\2\u02cc\u02cd\7\u4e02\2\2\u02cd"+
		"\u02ce\7\u576a\2\2\u02ce\u02cf\7\u5c50\2\2\u02cf\u02d0\7_\2\2\u02d0\u00bc"+
		"\3\2\2\2\u02d1\u02d2\7]\2\2\u02d2\u02d3\7\u4e0f\2\2\u02d3\u02d4\7\u77e7"+
		"\2\2\u02d4\u02d5\7\u9055\2\2\u02d5\u02d6\7_\2\2\u02d6\u00be\3\2\2\2\u02d7"+
		"\u02d8\7]\2\2\u02d8\u02d9\7\u4e0f\2\2\u02d9\u02da\7\u8bf6\2\2\u02da\u02db"+
		"\7\u4e88\2\2\u02db\u02dc\7_\2\2\u02dc\u00c0\3\2\2\2\u02dd\u02de\7]\2\2"+
		"\u02de\u02df\7\u4e3c\2\2\u02df\u02e0\7\u4ec2\2\2\u02e0\u02e1\7\u4e4a\2"+
		"\2\u02e1\u02e2\7_\2\2\u02e2\u00c2\3\2\2\2\u02e3\u02e4\7]\2\2\u02e4\u02e5"+
		"\7\u4e91\2\2\u02e5\u02e6\7\u5929\2\2\u02e6\u02e7\7\u4e88\2\2\u02e7\u02e8"+
		"\7_\2\2\u02e8\u00c4\3\2\2\2\u02e9\u02ea\7]\2\2\u02ea\u02eb\7\u56ff\2\2"+
		"\u02eb\u02ec\7\u5bb8\2\2\u02ec\u02ed\7\u9621\2\2\u02ed\u02ee\7_\2\2\u02ee"+
		"\u00c6\3\2\2\2\u02ef\u02f0\7]\2\2\u02f0\u02f1\7\u597f\2\2\u02f1\u02f2"+
		"\7\u56f2\2\2\u02f2\u02f3\7\u60d3\2\2\u02f3\u02f4\7_\2\2\u02f4\u00c8\3"+
		"\2\2\2\u02f5\u02f6\7]\2\2\u02f6\u02f7\7\u597f\2\2\u02f7\u02f8\7\u5933"+
		"\2\2\u02f8\u02f9\7\u671d\2\2\u02f9\u02fa\7_\2\2\u02fa\u00ca\3\2\2\2\u02fb"+
		"\u02fc\7]\2\2\u02fc\u02fd\7\u5fc5\2\2\u02fd\u02fe\7\u7890\2\2\u02fe\u02ff"+
		"\7\u4e88\2\2\u02ff\u0300\7_\2\2\u0300\u00cc\3\2\2\2\u0301\u0302\7]\2\2"+
		"\u0302\u0303\7\u60f5\2\2\u0303\u0304\7\u4e02\2\2\u0304\u0305\7\u4e0d\2"+
		"\2\u0305\u0306\7_\2\2\u0306\u00ce\3\2\2\2\u0307\u0308\7]\2\2\u0308\u0309"+
		"\7\u62a6\2\2\u0309\u030a\7\u57d0\2\2\u030a\u030b\7\u6cb5\2\2\u030b\u030c"+
		"\7_\2\2\u030c\u00d0\3\2\2\2\u030d\u030e\7]\2\2\u030e\u030f\7\u6bdd\2\2"+
		"\u030f\u0310\7\u4f32\2\2\u0310\u0311\7\u4f32\2\2\u0311\u0312\7_\2\2\u0312"+
		"\u00d2\3\2\2\2\u0313\u0314\7]\2\2\u0314\u0315\7\u7330\2\2\u0315\u0316"+
		"\7\u82b3\2\2\u0316\u0317\7\u82b3\2\2\u0317\u0318\7_\2\2\u0318\u00d4\3"+
		"\2\2\2\u0319\u031a\7]\2\2\u031a\u031b\7\u80ff\2\2\u031b\u031c\7\u529d"+
		"\2\2\u031c\u031d\7\u570a\2\2\u031d\u031e\7_\2\2\u031e\u00d6\3\2\2\2\u031f"+
		"\u0320\7]\2\2\u0320\u0321\7\u8d5c\2\2\u0321\u0322\7\u5929\2\2\u0322\u0323"+
		"\7\u4e88\2\2\u0323\u0324\7_\2\2\u0324\u00d8\3\2\2\2\u0325\u0326\7]\2\2"+
		"\u0326\u0327\7\u9f15\2\2\u0327\u0328\7\u9f15\2\2\u0328\u0329\7\u638e\2"+
		"\2\u0329\u032a\7_\2\2\u032a\u00da\3\2\2\2\u032b\u032c\7]\2\2\u032c\u032d"+
		"\7\u5175\2\2\u032d\u032e\7\u7071\2\2\u032e\u032f\7\u5405\2\2\u032f\u0330"+
		"\7\u9764\2\2\u0330\u0331\7_\2\2\u0331\u00dc\3\2\2\2\u0332\u0333\7]\2\2"+
		"\u0333\u0334\7\u5477\2\2\u0334\u0335\7\u5477\2\2\u0335\u0336\7\u50bd\2"+
		"\2\u0336\u0337\7\u903e\2\2\u0337\u0338\7_\2\2\u0338\u00de\3\2\2\2\u0339"+
		"\u033a\t\n\2\2\u033a\u00e0\3\2\2\2\u033b\u033c\7\u200f\2\2\u033c\u00e2"+
		"\3\2\2\2\u033d\u033e\t\13\2\2\u033e\u00e4\3\2\2\2\u033f\u0340\7\ufe10"+
		"\2\2\u0340\u00e6\3\2\2\2\u0341\u0342\7\ufe11\2\2\u0342\u00e8\3\2\2\2\u0343"+
		"\u0344\t\f\2\2\u0344\u00ea\3\2\2\2\u0345\u0346\t\r\2\2\u0346\u00ec\3\2"+
		"\2\2\u0347\u0348\t\16\2\2\u0348\u00ee\3\2\2\2\u0349\u034a\5\u00edw\2\u034a"+
		"\u034b\5\u00e5s\2\u034b\u00f0\3\2\2\2\u034c\u034d\5\u00ebv\2\u034d\u034e"+
		"\5\u00e7t\2\u034e\u00f2\3\2\2\2\u034f\u0350\t\17\2\2\u0350\u00f4\3\2\2"+
		"\2\u0351\u0352\t\20\2\2\u0352\u0353\t\21\2\2\u0353\u00f6\3\2\2\2\u0354"+
		"\u0355\t\22\2\2\u0355\u0356\t\22\2\2\u0356\u00f8\3\2\2\2\u0357\u0358\t"+
		"\23\2\2\u0358\u00fa\3\2\2\2\u0359\u035a\t\2\2\2\u035a\u00fc\3\2\2\2\u035b"+
		"\u035f\5\u00f1y\2\u035c\u035f\5\u00efx\2\u035d\u035f\5\u00edw\2\u035e"+
		"\u035b\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u0363\3\2"+
		"\2\2\u0360\u0362\5\u00fb~\2\u0361\u0360\3\2\2\2\u0362\u0365\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u00fe\3\2\2\2\u0365\u0363\3\2"+
		"\2\2\u0366\u036a\5\u00f5{\2\u0367\u036a\5\u00fd\177\2\u0368\u036a\5\u00f7"+
		"|\2\u0369\u0366\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036a"+
		"\u0100\3\2\2\2\u036b\u036f\5\u00f3z\2\u036c\u036f\5\u00f1y\2\u036d\u036f"+
		"\5\u00f5{\2\u036e\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2"+
		"\2\u036f\u0102\3\2\2\2\u0370\u0374\5\u0101\u0081\2\u0371\u0372\5\u00e1"+
		"q\2\u0372\u0373\5\u0101\u0081\2\u0373\u0375\3\2\2\2\u0374\u0371\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0104"+
		"\3\2\2\2\u0378\u037c\5\u00f3z\2\u0379\u037c\5\u00f5{\2\u037a\u037c\5\u00f1"+
		"y\2\u037b\u0378\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037a\3\2\2\2\u037c"+
		"\u0106\3\2\2\2\u037d\u037f\t\24\2\2\u037e\u037d\3\2\2\2\u037f\u0380\3"+
		"\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0108\3\2\2\2\u0382"+
		"\u0383\t\25\2\2\u0383\u010a\3\2\2\2\u0384\u0385\5\u0105\u0083\2\u0385"+
		"\u0386\5\u0107\u0084\2\u0386\u0387\5\u0109\u0085\2\u0387\u010c\3\2\2\2"+
		"\u0388\u0389\t\26\2\2\u0389\u010e\3\2\2\2\u038a\u038b\t\27\2\2\u038b\u0110"+
		"\3\2\2\2\u038c\u038d\t\3\2\2\u038d\u038e\t\4\2\2\u038e\u0112\3\2\2\2\u038f"+
		"\u0391\t\5\2\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0395"+
		"\u0397\t\6\2\2\u0396\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0396\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399\u039d\3\2\2\2\u039a\u039c\t\7\2\2\u039b"+
		"\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2"+
		"\2\2\u039e\u03cb\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a2\t\5\2\2\u03a1"+
		"\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03aa\t\b\2\2\u03a7"+
		"\u03a9\t\6\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b0\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad"+
		"\u03af\t\7\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2"+
		"\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03cb\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3"+
		"\u03b5\t\5\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9"+
		"\u03bd\t\t\2\2\u03ba\u03bc\t\7\2\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2"+
		"\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03cb\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03c0\u03c2\t\5\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c3\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03cb\3\2\2\2\u03c5"+
		"\u03c7\t\7\2\2\u03c6\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u0392\3\2\2\2\u03ca"+
		"\u03a3\3\2\2\2\u03ca\u03b6\3\2\2\2\u03ca\u03c1\3\2\2\2\u03ca\u03c6\3\2"+
		"\2\2\u03cb\u0114\3\2\2\2\25\2\u035e\u0363\u0369\u036e\u0376\u037b\u0380"+
		"\u0392\u0398\u039d\u03a3\u03aa\u03b0\u03b6\u03bd\u03c3\u03c8\u03ca\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}