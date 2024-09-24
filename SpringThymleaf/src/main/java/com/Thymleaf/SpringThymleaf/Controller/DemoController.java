package com.Thymleaf.SpringThymleaf.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    // Method to display a greeting page
    @GetMapping("/greet")
    public String greet(Model model) {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("name", "Karthek");
        attributes.put("theDate", java.time.LocalDate.now());

        model.addAllAttributes(attributes);
        return "Greeting";  // Thymeleaf will look for Greeting.html
    }

    // Controller method to show the form
    @GetMapping("/showForm")
    public String showForm() {
        return "form";  // Returns the form.html
    }

    // Controller method to process the form (version 1)
    @PostMapping("/processForm")
    public String processForm() {
        return "Hello-world";  // Displays the Hello-world.html
    }

    // Controller method to process form data and display result (version 2)
    @PostMapping("/processFormV2")
    public String LetsShoutDude(@RequestParam("StudentName")String theName, Model model) {
        


        // Convert the data to uppercase
        theName = theName.toUpperCase();

        // Create the message
        String result = "Yo " + theName;

        // Add the message to the model
        model.addAttribute("message", result);

        return "Hello-world";  // Displays the Hello-world.html
    }
}
