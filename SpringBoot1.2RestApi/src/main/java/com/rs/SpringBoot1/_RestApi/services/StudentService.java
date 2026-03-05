package com.rs.SpringBoot1._RestApi.services;
import java.util.*;
import com.rs.SpringBoot1._RestApi.entity.Student;
import com.rs.SpringBoot1._RestApi.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository s;
    public StudentService(StudentRepository s)
    {
        this.s = s;
    }

    public Student saveStudent(Student student)
    {
        return s.save(student);
    }

    public List<Student> getAllStudent()
    {
        return s.findAll();
    }
}
