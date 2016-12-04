package com.cs422.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexanderlerma on 12/4/16.
 */

@Entity
public class Product {

    private String name;
    private double size;
    private String category;
    private Map<String, String> moreInfo;

    public Product(String name, double size, String category, Map<String, String> moreInfo) {
        this.name = name;
        this.size = size;
        this.category = category;
        this.moreInfo = moreInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Map<String, String> getMoreInfo() {
        return new HashMap<>(moreInfo);
    }

    public void setMoreInfo(Map<String, String> moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("size", size)
                .append("category", category)
                .append("moreInfo", moreInfo)
                .toString();
    }
}
