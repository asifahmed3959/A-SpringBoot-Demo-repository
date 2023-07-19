package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

//data access layer
public interface StudentRepository
        extends JpaRepository<Student, Long> { //Object, id

    @Query("SELECT s FROM Student s where s.email = ?1") //this is not a java query, this is an JQuery
    Optional<Student> findStudentByEmail(String email);
}
