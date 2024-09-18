package com.example.JPACrudDemo.DAO;

import com.example.JPACrudDemo.Entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student retrieveByID(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void updateStudent(Student theStudent);

    void deleteByID(int id);


    int deleteAll();
}
