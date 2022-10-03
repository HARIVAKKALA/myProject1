package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

public interface StudentDAO extends JpaRepository<Student,Integer> {
}
