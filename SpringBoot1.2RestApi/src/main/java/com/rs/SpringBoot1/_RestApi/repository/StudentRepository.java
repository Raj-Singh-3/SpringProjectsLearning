package com.rs.SpringBoot1._RestApi.repository;

import com.rs.SpringBoot1._RestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
