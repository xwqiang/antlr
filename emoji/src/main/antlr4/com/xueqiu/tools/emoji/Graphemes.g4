grammar Graphemes;

Extend: [\p{Grapheme_Cluster_Break=Extend}];
ZWJ: '\u200D';
SpacingMark: [\p{Grapheme_Cluster_Break=SpacingMark}];
fragment VS15: '\uFE0E';
fragment VS16: '\uFE0F';
fragment NonspacingMark: [\p{Nonspacing_Mark}];
fragment TextPresentationCharacter: [\p{EmojiPresentation=TextDefault}];
fragment EmojiPresentationCharacter: [\p{EmojiPresentation=EmojiDefault}];
fragment TextPresentationSequence: EmojiPresentationCharacter VS15;
fragment EmojiPresentationSequence: TextPresentationCharacter VS16;
fragment EmojiCharacter: [\p{Emoji}];
fragment EmojiModifierSequence:
    [\p{Grapheme_Cluster_Break=E_Base}\p{Grapheme_Cluster_Break=E_Base_GAZ}] [\p{Grapheme_Cluster_Break=E_Modifier}];
fragment EmojiFlagSequence:
    [\p{Grapheme_Cluster_Break=Regional_Indicator}] [\p{Grapheme_Cluster_Break=Regional_Indicator}];
fragment ExtendedPictographic: [\p{Extended_Pictographic}];
fragment EnclosingMark: [\p{General_Category=Enclosing_Mark}];
fragment EmojiCombiningSequence:
  (   EmojiPresentationSequence
    | TextPresentationSequence
    | EmojiPresentationCharacter )
  EnclosingMark*;
EmojiCoreSequence:
    EmojiModifierSequence
  | EmojiCombiningSequence
  | EmojiFlagSequence;
fragment EmojiZWJElement:
    EmojiCharacter
  | EmojiPresentationSequence
  | EmojiModifierSequence;
EmojiZWJSequence:
    EmojiZWJElement (ZWJ EmojiZWJElement)+;
fragment TagBase:
    EmojiCharacter
  | EmojiModifierSequence
  | EmojiPresentationSequence;
fragment TagSpec:
    [\u{E0020}-\u{E007E}]+;
fragment TagTerm: '\u{E007F}';
fragment EmojiTagSequence:
    TagBase TagSpec TagTerm;
emoji_sequence:
  (   EmojiZWJSequence
    | EmojiCoreSequence
    | EmojiTagSequence )
  ( Extend | ZWJ | SpacingMark )*|xueqiu_emoji;

Prepend: [\p{Grapheme_Cluster_Break=Prepend}];
NonControl: [\P{Grapheme_Cluster_Break=Control}];
CRLF: [\p{Grapheme_Cluster_Break=CR}][\p{Grapheme_Cluster_Break=LF}];
HangulSyllable:
    [\p{Grapheme_Cluster_Break=L}]* [\p{Grapheme_Cluster_Break=V}]+ [\p{Grapheme_Cluster_Break=T}]*
  | [\p{Grapheme_Cluster_Break=L}]* [\p{Grapheme_Cluster_Break=LV}] [\p{Grapheme_Cluster_Break=V}]* [\p{Grapheme_Cluster_Break=T}]*
  | [\p{Grapheme_Cluster_Break=L}]* [\p{Grapheme_Cluster_Break=LVT}] [\p{Grapheme_Cluster_Break=T}]*
  | [\p{Grapheme_Cluster_Break=L}]+
  | [\p{Grapheme_Cluster_Break=T}]+;

grapheme_cluster:
    CRLF
  | Prepend* ( emoji_sequence | HangulSyllable | NonControl ) ( Extend | ZWJ | SpacingMark )*;

xueqiu_emoji:'[买]'|'[停]'|'[傲]'|'[减]'|'[加]'|'[卖]'|'[哭]'|'[囧]'|'[困]'|'[多]'|'[屎]'|'[晕]'|'[汗]'|'[涨]'|'[爱]'|'[牛]'|'[空]'|'[笑]'|'[色]'|'[贬]'|'[赞]'|'[跌]'|'[不屑]'|'[不赞]'|'[中签]'|'[主力]'|'[买入]'|'[亲亲]'|'[仰慕]'|'[俏皮]'|'[傲慢]'|'[凋谢]'|'[减仓]'|'[割肉]'|'[加仓]'|'[加油]'|'[卖出]'|'[卖身]'|'[可怜]'|'[可爱]'|'[吐舌]'|'[吐血]'|'[呵呵]'|'[哈哈]'|'[哭泣]'|'[困惑]'|'[困顿]'|'[围观]'|'[复盘]'|'[大笑]'|'[失望]'|'[好逊]'|'[害羞]'|'[尴尬]'|'[干杯]'|'[很赞]'|'[微笑]'|'[心心]'|'[心碎]'|'[怒了]'|'[思考]'|'[成交]'|'[抄底]'|'[抠鼻]'|'[挣扎]'|'[捂脸]'|'[握手]'|'[摊手]'|'[无语]'|'[梭哈]'|'[满仓]'|'[滴汗]'|'[献花]'|'[生气]'|'[疑问]'|'[看多]'|'[看空]'|'[秘密]'|'[空仓]'|'[笑哭]'|'[胜利]'|'[讨厌]'|'[诅咒]'|'[调皮]'|'[贪财]'|'[赞成]'|'[跪了]'|'[跳水]'|'[闭嘴]'|'[难过]'|'[韭菜]'|'[鼓掌]'|'[一坨屎]'|'[不知道]'|'[不说了]'|'[为什么]'|'[亏大了]'|'[国家队]'|'[好困惑]'|'[好失望]'|'[心碎了]'|'[想一下]'|'[护城河]'|'[毛估估]'|'[献花花]'|'[能力圈]'|'[赚大了]'|'[鼓鼓掌]'|'[关灯吃面]'|'[呵呵傻逼]';
graphemes: grapheme_cluster* EOF;
