package com.example.demo.course;

import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private Long id;
    private String name;
    private String code;


    @JsonIgnore // Add this annotation to break the circular reference
    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    // Default Constructor
    public Course() {

    }

    public Course(Long id, String name, String code, List<Student> students){
        this.id = id;
        this.name = name;
        this.code = code;
        this.students = students;
    }

    public Course(String name, String code, List<Student> students){
        this.name = name;
        this.code = code;
        this.students = students;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public Long getId(){
        return this.id;
    }


    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString(){
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", student='" + students + '\'' +
                '}';
    }
}
