package com.example.JPACrudDemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    //define fields
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    private String FirstName;
    private String LastName;
    private String Email;

    //define constructor
    public Student(){

    }

    public Student(String firstName, String lastName, String email) {

        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }


    //define getter and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
