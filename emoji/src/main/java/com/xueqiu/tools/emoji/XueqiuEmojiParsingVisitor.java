package com.xueqiu.tools.emoji;

import com.xueqiu.tools.emoji.domain.CodePointCounter;
import com.xueqiu.tools.emoji.domain.Result;

import java.util.ArrayList;
import java.util.List;

public class XueqiuEmojiParsingVisitor extends GraphemesBaseVisitor {
    private final CodePointCounter codePointCounter;
    private int clusterStringStartIndex;
    public final List<Result> result;
    public boolean containsEmoji;
    private int maxLength = Integer.MAX_VALUE;

    public XueqiuEmojiParsingVisitor(String string) {
        this.codePointCounter = new CodePointCounter(string);
        this.result = new ArrayList<>();
    }

    public XueqiuEmojiParsingVisitor(String string, int maxLength) {
        this.codePointCounter = new CodePointCounter(string);
        this.result = new ArrayList<>();
        if (maxLength > 0) {
            this.maxLength = maxLength;
        }
    }


    @Override
    public Object visitEmoji_sequence(GraphemesParser.Emoji_sequenceContext ctx) {
        if (result.size() > maxLength) {
            return null;
        }
        clusterStringStartIndex = codePointCounter.advanceToIndex(ctx.getStart().getStartIndex());
        int clusterStringStopIndex = codePointCounter.advanceToIndex(ctx.getStop().getStopIndex() + 1);
        int clusterStringLength = clusterStringStopIndex - clusterStringStartIndex;
        result.add(new Result(Result.Type.EMOJI, clusterStringStartIndex, clusterStringLength));
        containsEmoji = true;
        return null;
    }

    @Override
    public Object visitGrapheme_cluster(GraphemesParser.Grapheme_clusterContext ctx) {
        if (result.size() > maxLength) {
            return null;
        }
        clusterStringStartIndex = codePointCounter.advanceToIndex(ctx.getStart().getStartIndex());
        int clusterStringStopIndex = codePointCounter.advanceToIndex(ctx.getStop().getStopIndex() + 1);
        int clusterStringLength = clusterStringStopIndex - clusterStringStartIndex;
        result.add(new Result(Result.Type.NON_EMOJI, clusterStringStartIndex, clusterStringLength));
        return null;
    }

}
