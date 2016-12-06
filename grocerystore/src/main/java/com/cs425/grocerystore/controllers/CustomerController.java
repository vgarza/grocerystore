package com.cs425.grocerystore.controllers;

import com.cs425.grocerystore.model.Customer;
import com.cs425.grocerystore.service.GroceryStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexanderlerma on 12/4/16.
 *
 *
 *
 *
 *
 */
@Controller
@RequestMapping("/")
public class CustomerController {

    private GroceryStoreService groceryStoreService;

    @Autowired
    private CustomerController(GroceryStoreService groceryStoreService) {
        this.groceryStoreService = groceryStoreService;
    }

    @GetMapping("/customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/customer")
    public String customerSubmit(@ModelAttribute Customer customer) {
        return "result";
    }

}
