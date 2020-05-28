package com.xueqiu.tools.emoji.domain;

public class CodePointCounter {
    private final String input;
    public int inputIndex;
    public int codePointIndex;

    public CodePointCounter(String input) {
        this.input = input;
        this.inputIndex = 0;
        this.codePointIndex = 0;
    }

    public int advanceToIndex(int newCodePointIndex) {
        while (codePointIndex < newCodePointIndex) {
            int codePoint = Character.codePointAt(input, inputIndex);
            inputIndex += Character.charCount(codePoint);
            codePointIndex++;
        }
        return inputIndex;
    }
}
