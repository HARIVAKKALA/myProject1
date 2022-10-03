package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentDAO;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

	@Autowired
	StudentDAO repo;
	
	@PostMapping(path = {"/add"},consumes = {"application/json"})
	public Student addStudent(@RequestBody Student student) {
		
		Student stu  =repo.save(student);
		
		return stu;
	}
	
}
