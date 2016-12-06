package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by alexanderlerma on 12/6/16.
 */
public class CustomerAddress {

    private String firstName;
    private char middleInitial;
    private String lastName;
    private int streetNumber;
    private String streetName;
    private String aptNumber;
    private int zipcode;

    public CustomerAddress(String firstName, char middleInitial, String lastName, int streetNumber, String streetName, String aptNumber, int zipcode) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName", firstName)
                .append("middleInitial", middleInitial)
                .append("lastName", lastName)
                .append("streetNumber", streetNumber)
                .append("streetName", streetName)
                .append("aptNumber", aptNumber)
                .append("zipcode", zipcode)
                .toString();
    }
}
