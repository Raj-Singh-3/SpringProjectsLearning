package com.cts.jpa.SpringDataJPA_1.controller;

import com.cts.jpa.SpringDataJPA_1.entity.Student;
import com.cts.jpa.SpringDataJPA_1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s)
    {
        return studentService.addStudent(s);
    }
    @GetMapping
    public List<Student>  getStudent()
    {
        return studentService.getAllStudent();
    }

}
