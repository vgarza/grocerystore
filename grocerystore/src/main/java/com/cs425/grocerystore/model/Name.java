package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by alexanderlerma on 12/4/16.
 */
public class Name {
    private String first;
    private String middleInitial;
    private String last;

    public Name(String first, String middleInitial, String last) {
        this.first = first;
        this.middleInitial = middleInitial;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("first", first)
                .append("middleInitial", middleInitial)
                .append("last", last)
                .toString();
    }
}
