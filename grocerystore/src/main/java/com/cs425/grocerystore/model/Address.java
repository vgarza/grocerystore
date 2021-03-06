package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Created by alexanderlerma on 12/4/16.
 */
public class Address {

    private int streetNumber;
    private String streetName;
    private String aptNumber;
    private String city;
    private String state;
    private int zipcode;

    public Address() {}

    public Address(int streetNumber, String streetName, String aptNumber, String city, String state, int zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
                .append("streetNumber", streetNumber)
                .append("streetName", streetName)
                .append("aptNumber", aptNumber)
                .append("city", city)
                .append("state", state)
                .append("zipcode", zipcode)
                .toString();
    }
}
