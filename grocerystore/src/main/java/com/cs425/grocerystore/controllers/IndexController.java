package com.cs425.grocerystore.controllers;

import com.cs425.grocerystore.service.GroceryStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by alexanderlerma on 12/6/16.
 *
 * Controller for the grocery store homepage
 *
 */
@Controller
public class IndexController {

    private final GroceryStoreService groceryStoreService;

    @Autowired
    public IndexController(GroceryStoreService groceryStoreService) {
        this.groceryStoreService = groceryStoreService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
