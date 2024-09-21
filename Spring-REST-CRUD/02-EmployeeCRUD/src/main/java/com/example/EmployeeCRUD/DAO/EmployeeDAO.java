package com.example.EmployeeCRUD.DAO;

import com.example.EmployeeCRUD.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);



}
