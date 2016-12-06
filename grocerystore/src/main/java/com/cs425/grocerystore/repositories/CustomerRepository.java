package com.cs425.grocerystore.repositories;

import com.cs425.grocerystore.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alexanderlerma on 12/4/16.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>, PagingAndSortingRepository<Customer, String> {
    List<Customer> findByFirstNameAndMiddleInitialAndLastName(String firstName, char middleInitial, String Last);
}
