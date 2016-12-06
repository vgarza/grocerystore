package com.cs425.grocerystore.controllers;

import com.cs425.grocerystore.model.Staff;
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
 * Add/Delete/Modify a product and product pricing (staff)
 * Add stock to a warehouse (staff)
 *
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

    private final GroceryStoreService groceryStoreService;

    @Autowired
    public StaffController(GroceryStoreService groceryStoreService) {
        this.groceryStoreService = groceryStoreService;
    }

    @GetMapping("/form")
    public String staffForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "staff";
    }

    @PostMapping("/form")
    public String staffSubmit(@ModelAttribute Staff staff) {
        return "result";
    }
}
