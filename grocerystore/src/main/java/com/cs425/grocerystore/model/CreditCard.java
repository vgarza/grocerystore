package com.cs425.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
@Table(name = "creditcard")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @CreditCardNumber
    private String cardNumber;
    private String expirationDate;
    private String secCode;
    private Address address;

    public CreditCard(String cardNumber, String expirationDate, String secCode, Address address) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.secCode = secCode;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cardNumber", cardNumber)
                .append("expirationDate", expirationDate)
                .append("secCode", secCode)
                .toString();
    }
}