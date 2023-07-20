package com.example.demo.course;

import com.example.demo.student.StudentController;
import com.example.demo.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
private final CourseService courseService;

@Autowired
    public CourseController(CourseService courseService){
    this.courseService = courseService;
}

@GetMapping
    public List<Course> getCourses() {return courseService.getCourses();}

}
