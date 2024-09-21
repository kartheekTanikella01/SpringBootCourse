package com.example.EmployeeCRUD.Service;


import com.example.EmployeeCRUD.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);


}
