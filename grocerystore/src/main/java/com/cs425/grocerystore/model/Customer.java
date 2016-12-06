package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */

public class Customer {

    private double balance;
    private String firstName;
    private char middleInitial;
    private String lastName;

    public Customer() {}

    public Customer(double balance, String firstName, char middleInitial, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
                .append("balance", balance)
                .append("firstName", firstName)
                .append("middleInitial", middleInitial)
                .append("lastName", lastName)
                .toString();
    }
}
