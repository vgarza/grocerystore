package com.cs425.grocerystore.model;

import com.cs425.grocerystore.model.enums.OrderStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

/**
 * Created by alexanderlerma on 12/4/16.
 */
public class Order {
    @Id
    private int orderId;
    private OrderStatus status;
    private Timestamp dateIssued;
    private String cardNumber;
    private String streetName;
    private int streetNumber;
    private String aptNumber;
    private int zipcode;

    public Order(int orderId, OrderStatus status, Timestamp dateIssued, String cardNumber, String streetName, int streetNumber, String aptNumber, int zipcode) {
        this.orderId = orderId;
        this.status = status;
        this.dateIssued = dateIssued;
        this.cardNumber = cardNumber;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.aptNumber = aptNumber;
        this.zipcode = zipcode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Timestamp getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Timestamp dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("orderId", orderId)
                .append("status", status)
                .append("dateIssued", dateIssued)
                .append("cardNumber", cardNumber)
                .append("streetName", streetName)
                .append("streetNumber", streetNumber)
                .append("aptNumber", aptNumber)
                .append("zipcode", zipcode)
                .toString();
    }
}
