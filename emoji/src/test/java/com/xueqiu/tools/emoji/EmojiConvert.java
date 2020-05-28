package com.xueqiu.tools.emoji;

import com.vdurmont.emoji.EmojiParser;

public class EmojiConvert {
    public static void main(String args[]) {
        String str = "苍天厚土\uD83D\uDE01 \uD83D\uDC36 \uD83E\uDD14 \uD83D\uDC7B \uD83D\uDE92 👨‍👩‍👧‍👧";
        System.out.println("原始字符为：\n" + str);

        System.out.println("to aliases 之后：");
        String alias = EmojiParser.parseToAliases(str);
        System.out.println(alias);
        System.out.println("remove emoji:");
        System.out.println(EmojiParser.removeAllEmojis(str));
        System.out.println(EmojiParser.parseToAliases(str, EmojiParser.FitzpatrickAction.PARSE));
        System.out.println("alias to ejoji:");
        System.out.println(EmojiParser.parseToUnicode(alias+"😂"));
    }
}
