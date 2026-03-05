package com.rs.SpringBoot1._RestApi.controllers;
import java.util.*;
import com.rs.SpringBoot1._RestApi.entity.Student;
import com.rs.SpringBoot1._RestApi.services.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService s;
    public StudentController(StudentService s)
    {
        this.s = s;
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return s.saveStudent(student);
    }
    @GetMapping
     public List<Student> getAllStudents()
    {
        return s.getAllStudent();
    }
}
