package com.cs425.grocerystore.service;

import com.cs425.grocerystore.model.Customer;
import com.cs425.grocerystore.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Service
public class GroceryStoreServiceImpl implements GroceryStoreService {

    private CustomerRepository customerRepository;

    @Autowired
    public GroceryStoreServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Assert.notNull(customer);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }
}
