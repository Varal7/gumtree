package com.github.gumtreediff.actions.model;

public class Range {
    private Integer startLine;
    private Integer endLine;
    private Integer startColumn;
    private Integer endColumn;

    public Range(Integer startLine, Integer endLine, Integer startColumn, Integer endColumn) {
        this.startLine = startLine;
        this.endLine = endLine;
        this.startColumn = startColumn;
        this.endColumn = endColumn;
    }

    @Override
    public String toString() {
        return "Range{"
                + "startLine="
                + startLine
                + ", endLine="
                + endLine
                + ", startColumn="
                + startColumn
                + ", endColumn="
                + endColumn
                + '}';
    }

    public Integer getStartLine() {
        return startLine;
    }

    public Integer getEndLine() {
        return endLine;
    }

    public Integer getStartColumn() {
        return startColumn;
    }

    public Integer getEndColumn() {
        return endColumn;
    }
}
