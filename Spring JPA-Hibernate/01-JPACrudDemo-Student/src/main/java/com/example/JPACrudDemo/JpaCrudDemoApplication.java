package com.example.JPACrudDemo;

import com.example.JPACrudDemo.DAO.StudentDAO;
import com.example.JPACrudDemo.Entity.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		 return runner->{
//			 createStudent(studentDAO);
//			 readStudent(studentDAO);
////			 queryToGetAllStudents(studentDAO);
//			 queryToGetStudentByLastName(studentDAO);
//			 updateLastNameByID(studentDAO);
//			 deleteById(studentDAO);
			 deleteAllStudents(studentDAO);
		 };

	}
	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	private void deleteById(StudentDAO studentDAO) {
		int studentId=1;
		Student myStudent=studentDAO.retrieveByID(studentId);
		if (myStudent!= null){
			System.out.println("StudentId"+ studentId);
			studentDAO.deleteByID(studentId);
			System.out.println("deleted");

		}else {
			System.out.println("Student with ID " + studentId + " not found.");

		}
	}

	private void updateLastNameByID(StudentDAO studentDAO) {
		int studentId = 1;
		Student myStudent = studentDAO.retrieveByID(studentId);

		if (myStudent != null) {
			System.out.println("Before updating: " + myStudent);
			myStudent.setLastName("TVS");
			studentDAO.updateStudent(myStudent);  // Use the general method name
			System.out.println("After updating: " + myStudent);
		} else {
			System.out.println("Student with ID " + studentId + " not found.");
		}
	}



	private void queryToGetStudentByLastName(StudentDAO studentDAO) {
		List<Student> st=studentDAO.findByLastName("don");
		System.out.println("by lastname: "+st);
	}

	private void queryToGetAllStudents(StudentDAO studentDAO) {
		List<Student> theStudents=studentDAO.findAll();

		System.out.println("studen list is: "+ theStudents);
	}

	private void readStudent(StudentDAO studentDAO) {
		int id = 1;
		System.out.println("Getting Student by ID: " + id);
		Student tstudent = studentDAO.retrieveByID(id);

		if (tstudent != null) {
			System.out.println("Student found: " + tstudent);
		} else {
			System.out.println("Student with ID " + id + " not found");
		}


	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("create a student");
		Student tempStudent=new Student("KARTHHEK","TANIKELLA","ABC@GMAIL.COM");
		Student tempStudent1=new Student("joe","don","don@mai");
		Student tempStudent2=new Student("john","don","don@mai");
		System.out.println("save the student");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		System.out.println("get id of the student");
		tempStudent.getId();


	}



}
