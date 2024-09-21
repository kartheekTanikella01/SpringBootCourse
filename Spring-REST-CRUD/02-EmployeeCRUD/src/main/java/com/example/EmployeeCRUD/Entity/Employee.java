package com.example.EmployeeCRUD.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "last_name")
    private String LastName;
    @Column(name = "email")
    private String email;

    public Employee() {
    }

    public Employee( String firstName, String lastName, String email) {

        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
