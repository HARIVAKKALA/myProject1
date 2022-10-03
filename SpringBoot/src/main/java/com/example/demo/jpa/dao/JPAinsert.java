package com.example.demo.jpa.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class JPAinsert {
	
	@Autowired
	EntityManager entityManger;
	
	@Transactional
	public void insertDataUsingJpa() {
		
		Student student = new Student();
		student.setCountry("India");
		student.setName("hari");
		entityManger.persist(student);
		System.out.println("Data inserted successfully by using JPA");
	}

}
