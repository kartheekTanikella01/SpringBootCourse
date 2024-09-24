package com.Thymleaf.SpringThymleaf.Model;

public class Student {
    private String firstName;
    private String lastName;
    private String place;
    private String favouriteLanguage;
    private String favouriteOS;

    public Student() {
    }

    public Student(String firstName, String lastName, String place, String favouriteLanguage, String favouriteOS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
        this.favouriteLanguage = favouriteLanguage;
        this.favouriteOS = favouriteOS;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFavouriteOS() {
        return favouriteOS;
    }

    public void setFavouriteOS(String favouriteOS) {
        this.favouriteOS = favouriteOS;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", place='" + place + '\'' +
                ", favouriteLanguage='" + favouriteLanguage + '\'' +
                ", favouriteOS='" + favouriteOS + '\'' +
                '}';
    }
}
