package com.cs422.grocerystore.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Entity
public class Staff {
    private Name name;
    private Address address;
    private double salary;
    private String jobTitle;

    public Staff(Name name, Address address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("address", address)
                .append("salary", salary)
                .append("jobTitle", jobTitle)
                .toString();
    }
}
