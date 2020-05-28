package com.xueqiu.tools.emoji;

import com.xueqiu.tools.emoji.domain.CodePointCounter;
import com.xueqiu.tools.emoji.domain.Result;

import java.util.ArrayList;
import java.util.List;

public class GraphemesParsingVisitor extends GraphemesBaseVisitor {
    private final CodePointCounter codePointCounter;
    private int clusterStringStartIndex;
    public final List<Result> result;
    public boolean containsEmoji;

    public GraphemesParsingVisitor(String string) {
        this.codePointCounter = new CodePointCounter(string);
        this.result = new ArrayList<>();
    }


    @Override
    public Object visitEmoji_sequence(GraphemesParser.Emoji_sequenceContext ctx) {
        clusterStringStartIndex = codePointCounter.advanceToIndex(ctx.getStart().getStartIndex());
        int clusterStringStopIndex = codePointCounter.advanceToIndex(ctx.getStop().getStopIndex() + 1);
        int clusterStringLength = clusterStringStopIndex - clusterStringStartIndex;
        result.add(new Result(Result.Type.EMOJI, clusterStringStartIndex, clusterStringLength));
        containsEmoji = true;
        return null;
    }

    @Override
    public Object visitGrapheme_cluster(GraphemesParser.Grapheme_clusterContext ctx) {
        clusterStringStartIndex = codePointCounter.advanceToIndex(ctx.getStart().getStartIndex());
        int clusterStringStopIndex = codePointCounter.advanceToIndex(ctx.getStop().getStopIndex() + 1);
        int clusterStringLength = clusterStringStopIndex - clusterStringStartIndex;
        result.add(new Result(Result.Type.NON_EMOJI, clusterStringStartIndex, clusterStringLength));
        return null;
    }

}
