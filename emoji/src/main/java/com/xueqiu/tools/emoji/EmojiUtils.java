package com.xueqiu.tools.emoji;

import com.xueqiu.tools.emoji.domain.Result;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.util.List;

public class EmojiUtils {

    public static List<Result> parse(String string, int maxLength) {
        try {
            GraphemesLexer lexer = new GraphemesLexer(CharStreams.fromString(string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GraphemesParser parser = new GraphemesParser(tokens);
            GraphemesParser.GraphemesContext tree = parser.graphemes();
            XueqiuEmojiParsingVisitor visitor = new XueqiuEmojiParsingVisitor(string, maxLength);
            visitor.visit(tree);
            return visitor.result;
        } catch (RecognitionException re) {
            System.err.format("Exception %s when parsing\n", re);
            throw re;
        }
    }

    public static List<Result> parse(String string) {
        return parse(string, -1);
    }

    public static String subString(String input, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        int idx = 0;
        for (Result grapheme : EmojiUtils.parse(input, end)) {
            String s = input.substring(grapheme.stringOffset, grapheme.stringOffset + grapheme.stringLength);
            if (start <= idx && idx < end) {
                stringBuilder.append(s);
            }
            idx++;
        }
        return stringBuilder.toString();
    }

    public static String subString(String input, int end) {
        return subString(input, 0, end);
    }

    public static void judgeEmoji(String input) {
        System.out.format("Parsing string: %s\n", input);
        for (Result grapheme : EmojiUtils.parse(input)) {
            String s = input.substring(grapheme.stringOffset, grapheme.stringOffset + grapheme.stringLength);
            String type = (grapheme.type == Result.Type.EMOJI ? "Emoji" : "Non-Emoji");
            System.out.format("%s: [%s] (offset=%d, length=%d)\n", type, s, grapheme.stringOffset, grapheme.stringLength);
        }
    }

}
