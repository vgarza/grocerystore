package com.cs422.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
public class Warehouse {

    private String id;
    private Address address;
    private double storageCapacity;

    public Warehouse(Address address, double storageCapacity) {
        this.address = address;
        this.storageCapacity = storageCapacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("address", address)
                .append("storageCapacity", storageCapacity)
                .toString();
    }
}
