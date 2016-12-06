package com.cs425.grocerystore.service;

import com.cs425.grocerystore.model.Customer;

import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */
public interface GroceryStoreService {
    Customer createCustomer(Customer customer);

    List<Customer> findAllCustomers();
}
