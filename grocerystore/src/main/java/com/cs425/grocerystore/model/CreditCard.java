package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by alexanderlerma on 12/4/16.
 */

public class CreditCard {

    private String cardNumber;
    private String secCode;
    private String expirationDate;
    private String streetName;
    private int streetNumber;
    private String aptNumber;
    private String city;
    private int zipcode;
    private String state;
    private String firstName;
    private char middleInitial;
    private String lastName;

    public CreditCard() {}

    public CreditCard(String cardNumber, String secCode, String expirationDate,
                      String streetName, int streetNumber, String aptNumber, String city,
                      int zipcode, String state, String firstName, char middleInitial, String lastName) {
        this.cardNumber = cardNumber;
        this.secCode = secCode;
        this.expirationDate = expirationDate;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.aptNumber = aptNumber;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cardNumber", cardNumber)
                .append("expirationDate", expirationDate)
                .append("secCode", secCode)
                .append("streetName", streetName)
                .append("streetNumber", streetNumber)
                .append("aptNumber", aptNumber)
                .append("city", city)
                .append("zipcode", zipcode)
                .append("state", state)
                .append("firstName", firstName)
                .append("middleInitial", middleInitial)
                .append("lastName", lastName)
                .toString();
    }
}
