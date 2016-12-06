package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by alexanderlerma on 12/6/16.
 */
public class Stock {

    private int quantity;
    private String name;
    private int streetNumber;
    private String streetName;
    private String aptNumber;
    private int zipcode;


    public Stock(int quantity, String name, int streetNumber, String streetName, String aptNumber, int zipcode) {
        this.quantity = quantity;
        this.name = name;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.zipcode = zipcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("quantity", quantity)
                .append("name", name)
                .append("streetNumber", streetNumber)
                .append("streetName", streetName)
                .append("aptNumber", aptNumber)
                .toString();
    }
}
