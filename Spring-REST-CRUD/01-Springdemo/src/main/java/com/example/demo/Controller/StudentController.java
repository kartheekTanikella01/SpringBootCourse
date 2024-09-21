package com.example.demo.Controller;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Kartheek", "Tanikeela"));
        students.add(new Student("Somayaja", "Venkata"));
        students.add(new Student("Kartheek", "Somayaja"));
    }

    @GetMapping("/studentById/{id}")
    public Student getStudentById(@PathVariable int id) {
        if (id >= 0 && id < students.size()) {  // Checking if the id is within valid range
            return students.get(id);
        } else {
            throw new StudentException("Student with ID " + id + " not found");
        }
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents() {
        return students;
    }



}
