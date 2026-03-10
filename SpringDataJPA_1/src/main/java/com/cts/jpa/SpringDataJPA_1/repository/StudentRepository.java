package com.cts.jpa.SpringDataJPA_1.repository;

import com.cts.jpa.SpringDataJPA_1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
