package com.cs422.grocerystore.model;

import com.cs422.grocerystore.model.enums.OrderStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private List<Product> products;
    private LocalDate timestamp;
    private OrderStatus orderStatus;
    private CreditCard creditCard;

    public Order(List<Product> products, LocalDate timestamp, OrderStatus orderStatus, CreditCard creditCard) {
        this.products = products;
        this.timestamp = timestamp;
        this.orderStatus = orderStatus;
        this.creditCard = creditCard;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("products", products)
                .append("timestamp", timestamp)
                .append("orderStatus", orderStatus)
                .append("creditCard", creditCard)
                .toString();
    }
}
