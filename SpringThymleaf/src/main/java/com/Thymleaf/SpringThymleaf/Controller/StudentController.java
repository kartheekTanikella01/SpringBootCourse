package com.Thymleaf.SpringThymleaf.Controller;

import com.Thymleaf.SpringThymleaf.Model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${places}")
    private List<String> places;

    @Value("${favouriteLanguage}")
    private List<String> favouriteLanguage;

    @Value("${favouriteOS}")
    private List<String> favouriteOS;

    @GetMapping("/studentForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("places", places);
        model.addAttribute("favouriteLanguage", favouriteLanguage);
        model.addAttribute("favouriteOS", favouriteOS);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String studentProcessing(@ModelAttribute("student") Student theStudent) {
        // Log the input data
        System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName());
        System.out.println("Favourite OS: " + theStudent.getFavouriteOS());
        return "student-confirm";
    }
}
