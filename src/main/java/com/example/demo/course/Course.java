package com.example.demo.course;

import jakarta.persistence.*;


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

    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public Course(){}

    public Course(Long id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Course(String name, String code){
        this.name = name;
        this.code = code;
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

    @Override
    public String toString(){
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
