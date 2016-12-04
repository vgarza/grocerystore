package com.cs422.grocerystore;
import com.cs422.grocerystore.model.Address;
import com.cs422.grocerystore.model.CreditCard;
import com.cs422.grocerystore.model.Customer;
import com.cs422.grocerystore.model.Name;
import com.cs422.grocerystore.repositories.CustomerRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class GrocerystoreApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(GrocerystoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address(
				"122", "E 32nd St.",
				StringUtils.EMPTY,
				"Chicago",
				"IL",
				"60616");
		Customer customer = new Customer(
				new Name("Alexander", "R", "Lerma"),
				9999.99,
				Collections.singletonList(address),
				Collections.singletonList(new CreditCard("1111-1111-3333-2222", "09/22", "999",address)));

		customer = customerRepository.save(customer);
		Customer found = customerRepository.findOne(customer.getId());

	}
}
