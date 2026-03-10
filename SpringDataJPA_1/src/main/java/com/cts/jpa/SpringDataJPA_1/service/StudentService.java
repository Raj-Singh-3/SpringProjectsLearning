package com.cts.jpa.SpringDataJPA_1.service;

import com.cts.jpa.SpringDataJPA_1.entity.Student;
import com.cts.jpa.SpringDataJPA_1.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student s)
    {
        return studentRepository.save(s);
    }

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }

}
