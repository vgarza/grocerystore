package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Name name;
    private double balance;

    @ManyToMany
    @JoinColumn(name = "addressId")
    private List<Address> addresses;

    @OneToMany
    @JoinColumn(name = "cardId")
    private List<CreditCard> creditCards;

    public Customer() {
    }

    public Customer(Name name, double balance, List<Address> addresses, List<CreditCard> creditCards) {
        this.name = name;
        this.balance = balance;
        this.addresses = addresses;
        this.creditCards = creditCards;
    }

    public long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("balance", balance)
                .append("addresses", addresses)
                .append("creditCards", creditCards)
                .toString();
    }
}
