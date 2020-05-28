package com.xueqiu.tools.emoji;// Generated from /Users/xuwuqiang/Documents/workspace/antlr/emoji/src/main/antlr4/com/xueqiu/tools/emoji/Graphemes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphemesParser extends Parser {
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
		CRLF=118, HangulSyllable=119, EmojiTagSequence=120;
	public static final int
		RULE_emoji_sequence = 0, RULE_grapheme_cluster = 1, RULE_xueqiu_emoji = 2, 
		RULE_graphemes = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"emoji_sequence", "grapheme_cluster", "xueqiu_emoji", "graphemes"
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
			"EmojiZWJSequence", "Prepend", "NonControl", "CRLF", "HangulSyllable", 
			"EmojiTagSequence"
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
	public String getGrammarFileName() { return "Graphemes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphemesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Emoji_sequenceContext extends ParserRuleContext {
		public TerminalNode EmojiZWJSequence() { return getToken(GraphemesParser.EmojiZWJSequence, 0); }
		public TerminalNode EmojiCoreSequence() { return getToken(GraphemesParser.EmojiCoreSequence, 0); }
		public TerminalNode EmojiTagSequence() { return getToken(GraphemesParser.EmojiTagSequence, 0); }
		public List<TerminalNode> Extend() { return getTokens(GraphemesParser.Extend); }
		public TerminalNode Extend(int i) {
			return getToken(GraphemesParser.Extend, i);
		}
		public List<TerminalNode> ZWJ() { return getTokens(GraphemesParser.ZWJ); }
		public TerminalNode ZWJ(int i) {
			return getToken(GraphemesParser.ZWJ, i);
		}
		public List<TerminalNode> SpacingMark() { return getTokens(GraphemesParser.SpacingMark); }
		public TerminalNode SpacingMark(int i) {
			return getToken(GraphemesParser.SpacingMark, i);
		}
		public Xueqiu_emojiContext xueqiu_emoji() {
			return getRuleContext(Xueqiu_emojiContext.class,0);
		}
		public Emoji_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoji_sequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphemesVisitor ) return ((GraphemesVisitor<? extends T>)visitor).visitEmoji_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Emoji_sequenceContext emoji_sequence() throws RecognitionException {
		Emoji_sequenceContext _localctx = new Emoji_sequenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_emoji_sequence);
		int _la;
		try {
			int _alt;
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EmojiCoreSequence:
			case EmojiZWJSequence:
			case EmojiTagSequence:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (EmojiCoreSequence - 114)) | (1L << (EmojiZWJSequence - 114)) | (1L << (EmojiTagSequence - 114)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(12);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(9);
						_la = _input.LA(1);
						if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (Extend - 111)) | (1L << (ZWJ - 111)) | (1L << (SpacingMark - 111)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(14);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				xueqiu_emoji();
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

	public static class Grapheme_clusterContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(GraphemesParser.CRLF, 0); }
		public Emoji_sequenceContext emoji_sequence() {
			return getRuleContext(Emoji_sequenceContext.class,0);
		}
		public TerminalNode HangulSyllable() { return getToken(GraphemesParser.HangulSyllable, 0); }
		public TerminalNode NonControl() { return getToken(GraphemesParser.NonControl, 0); }
		public List<TerminalNode> Prepend() { return getTokens(GraphemesParser.Prepend); }
		public TerminalNode Prepend(int i) {
			return getToken(GraphemesParser.Prepend, i);
		}
		public List<TerminalNode> Extend() { return getTokens(GraphemesParser.Extend); }
		public TerminalNode Extend(int i) {
			return getToken(GraphemesParser.Extend, i);
		}
		public List<TerminalNode> ZWJ() { return getTokens(GraphemesParser.ZWJ); }
		public TerminalNode ZWJ(int i) {
			return getToken(GraphemesParser.ZWJ, i);
		}
		public List<TerminalNode> SpacingMark() { return getTokens(GraphemesParser.SpacingMark); }
		public TerminalNode SpacingMark(int i) {
			return getToken(GraphemesParser.SpacingMark, i);
		}
		public Grapheme_clusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grapheme_cluster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphemesVisitor ) return ((GraphemesVisitor<? extends T>)visitor).visitGrapheme_cluster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grapheme_clusterContext grapheme_cluster() throws RecognitionException {
		Grapheme_clusterContext _localctx = new Grapheme_clusterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grapheme_cluster);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRLF:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(CRLF);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case EmojiCoreSequence:
			case EmojiZWJSequence:
			case Prepend:
			case NonControl:
			case HangulSyllable:
			case EmojiTagSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Prepend) {
					{
					{
					setState(19);
					match(Prepend);
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__103:
				case T__104:
				case T__105:
				case T__106:
				case T__107:
				case T__108:
				case T__109:
				case EmojiCoreSequence:
				case EmojiZWJSequence:
				case EmojiTagSequence:
					{
					setState(25);
					emoji_sequence();
					}
					break;
				case HangulSyllable:
					{
					setState(26);
					match(HangulSyllable);
					}
					break;
				case NonControl:
					{
					setState(27);
					match(NonControl);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (Extend - 111)) | (1L << (ZWJ - 111)) | (1L << (SpacingMark - 111)))) != 0)) {
					{
					{
					setState(30);
					_la = _input.LA(1);
					if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (Extend - 111)) | (1L << (ZWJ - 111)) | (1L << (SpacingMark - 111)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Xueqiu_emojiContext extends ParserRuleContext {
		public Xueqiu_emojiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xueqiu_emoji; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphemesVisitor ) return ((GraphemesVisitor<? extends T>)visitor).visitXueqiu_emoji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xueqiu_emojiContext xueqiu_emoji() throws RecognitionException {
		Xueqiu_emojiContext _localctx = new Xueqiu_emojiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xueqiu_emoji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)))) != 0)) ) {
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

	public static class GraphemesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GraphemesParser.EOF, 0); }
		public List<Grapheme_clusterContext> grapheme_cluster() {
			return getRuleContexts(Grapheme_clusterContext.class);
		}
		public Grapheme_clusterContext grapheme_cluster(int i) {
			return getRuleContext(Grapheme_clusterContext.class,i);
		}
		public GraphemesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphemes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphemesVisitor ) return ((GraphemesVisitor<? extends T>)visitor).visitGraphemes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphemesContext graphemes() throws RecognitionException {
		GraphemesContext _localctx = new GraphemesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_graphemes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (EmojiCoreSequence - 64)) | (1L << (EmojiZWJSequence - 64)) | (1L << (Prepend - 64)) | (1L << (NonControl - 64)) | (1L << (CRLF - 64)) | (1L << (HangulSyllable - 64)) | (1L << (EmojiTagSequence - 64)))) != 0)) {
				{
				{
				setState(40);
				grapheme_cluster();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\63\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\5\2\23\n\2\3"+
		"\3\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\5\3\37\n\3\3\3\7\3\"\n"+
		"\3\f\3\16\3%\13\3\5\3\'\n\3\3\4\3\4\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3"+
		"\5\3\5\2\2\6\2\4\6\b\2\5\4\2tuzz\3\2qs\3\2\3p\2\66\2\22\3\2\2\2\4&\3\2"+
		"\2\2\6(\3\2\2\2\b-\3\2\2\2\n\16\t\2\2\2\13\r\t\3\2\2\f\13\3\2\2\2\r\20"+
		"\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\23\3\2\2\2\20\16\3\2\2\2\21\23"+
		"\5\6\4\2\22\n\3\2\2\2\22\21\3\2\2\2\23\3\3\2\2\2\24\'\7x\2\2\25\27\7v"+
		"\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\36\3\2"+
		"\2\2\32\30\3\2\2\2\33\37\5\2\2\2\34\37\7y\2\2\35\37\7w\2\2\36\33\3\2\2"+
		"\2\36\34\3\2\2\2\36\35\3\2\2\2\37#\3\2\2\2 \"\t\3\2\2! \3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$\'\3\2\2\2%#\3\2\2\2&\24\3\2\2\2&\30\3\2\2\2"+
		"\'\5\3\2\2\2()\t\4\2\2)\7\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2"+
		"\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\t\3\2\2\2\t\16\22"+
		"\30\36#&-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}