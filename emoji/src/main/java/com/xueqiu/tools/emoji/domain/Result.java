package com.xueqiu.tools.emoji.domain;


import java.util.Objects;

public class Result {
    public enum Type {
        EMOJI,
        NON_EMOJI
    }

    public final Result.Type type;
    public final int stringOffset;
    public final int stringLength;

    public Result(Result.Type type, int stringOffset, int stringLength) {
        this.type = type;
        this.stringOffset = stringOffset;
        this.stringLength = stringLength;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Result)) {
            return false;
        }

        Result that = (Result) other;
        return
                Objects.equals(this.type, that.type) &&
                        this.stringOffset == that.stringOffset &&
                        this.stringLength == that.stringLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, stringOffset, stringLength);
    }

    @Override
    public String toString() {
        return String.format("%s type=%s stringOffset=%d stringLength=%d", super.toString(), type, stringLength, stringOffset);
    }
}
