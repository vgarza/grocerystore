package com.cs425.grocerystore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GroceryStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {}
}
