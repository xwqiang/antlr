package com.xueqiu.tools.emoji;

public class EmojiParserTest {
    public static void main(String[] strings) {
        String input = "😂2👨‍👩‍👧‍👧l5😂[微笑][呵呵傻逼]7";
//        judgeEmoji(input);

//        input = StringUtils.repeat(input, 10000);
        long start = System.currentTimeMillis();
        System.out.println(EmojiUtils.subString(input, 0, 1));
        System.out.println(EmojiUtils.subString(input, 0, 2));
        System.out.println(EmojiUtils.subString(input, 0, 3));
        System.out.println(EmojiUtils.subString(input, 0, 4));
        System.out.println(EmojiUtils.subString(input, 0, 5));
        System.out.println(EmojiUtils.subString(input, 0, 6));
        System.out.println(EmojiUtils.subString(input, 0, 7));
        System.out.println(EmojiUtils.subString(input, 0, 8));
        System.out.println(EmojiUtils.subString(input, 0, 9));
        System.out.println(System.currentTimeMillis() - start);
    }


}
