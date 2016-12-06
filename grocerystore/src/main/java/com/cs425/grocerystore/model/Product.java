package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by alexanderlerma on 12/4/16.
 */

public class Product {

    private String pName;
    private double size;
    private String category;
    private String moreInfo;

    public Product() {}

    public Product(String pName, double size, String category, String moreInfo) {
        this.pName = pName;
        this.size = size;
        this.category = category;
        this.moreInfo = moreInfo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pName", pName)
                .append("size", size)
                .append("category", category)
                .append("moreInfo", moreInfo)
                .toString();
    }
}
