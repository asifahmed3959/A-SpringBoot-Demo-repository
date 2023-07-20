package com.example.demo;

import com.example.demo.course.Course;
import com.example.demo.course.CourseRepository;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(CourseRepository courseRepository, StudentRepository studentRepository){
        return args -> {
            Course course = new Course(
                    "Computer Science", "CSI 101"
            );

            Course course2 = new Course(
                    "Sociology", "SIO 101"
            );

            Course course3 = new Course(
                    "Mathematics", "Math 101"
            );

            courseRepository.saveAll(
                    List.of(course, course2, course3)
            );

            Student mariam = new Student(
                    "Mariam", "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student rick = new Student(
                    "Rick",
                    "rick@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student olsa = new Student(
                    "Olsa",
                    "olsa@gmail.com",
                    LocalDate.of(2002, JANUARY, 5)
            );
            studentRepository.saveAll(
                    List.of(mariam, alex, rick, olsa)
            );

        };
    }
}
