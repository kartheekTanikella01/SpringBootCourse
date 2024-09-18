package com.example.JPACrudDemo.DAO;

import com.example.JPACrudDemo.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO {
    //define field for entitymanger
    private EntityManager entityManager;

    //inject entitymanager
    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);

    }

    @Override
    public Student retrieveByID(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        //create Query
        TypedQuery<Student> typedQuery=entityManager.createQuery("From Student order by LastName",Student.class);

        List<Student> studentList=typedQuery.getResultList();
        //returnQuery
        return studentList;
    }

    @Override

    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query=entityManager.createQuery("From Student where LastName=:theData",Student.class);
        //set parameter
        query.setParameter("theData",lastName);
        return query.getResultList();
    }


    @Override
    @Transactional
    public void updateStudent(Student theStudent) {
        entityManager.merge(theStudent);  // Use merge to update any fields of the student
    }

    @Override
    @Transactional
    public void deleteByID(int id) {
        Student student=entityManager.find(Student.class,id);
        entityManager.remove(student);
    }
    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }


}
