package com.securebanking.securebanking_app.controller;

import com.securebanking.securebanking_app.model.User;
import com.securebanking.securebanking_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "find";  // Return the name of the template for the login page
    }

    // Handle user search by name
    @PostMapping("/find")
    public String findUsers(@RequestParam String name, Model model) {
        List<User> users = userService.findUsersByName(name);
        model.addAttribute("users", users);
        return "result";  // Return the result template
    }

    // Handle user search by email
    @PostMapping("/search")
    public String searchByEmail(@RequestParam String searchTerm, Model model) {
        List<User> users = userService.searchUsersByEmail(searchTerm);
        model.addAttribute("users", users);
        return "result";  // Return the result template
    }
}
