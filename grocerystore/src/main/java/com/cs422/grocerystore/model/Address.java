package com.cs422.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;


/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String streetNumber;
    private String streetName;
    private String aptNumber;
    private String city;
    private String state;
    private String zipcode;


    public Address(String streetNumber, String streetName, String aptNumber, String city, String state, String zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("streetNumber", streetNumber)
                .append("streetName", streetName)
                .append("aptNumber", aptNumber)
                .append("city", city)
                .append("zipcode", zipcode)
                .append("state", state)
                .toString();
    }
}
