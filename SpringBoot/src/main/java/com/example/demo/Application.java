package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;

import com.example.demo.jdbc.dao.SpringJdbcDaiompl;
import com.example.demo.jpa.dao.JPAinsert;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	SpringJdbcDaiompl daoimpl;
	
	@Autowired
	JPAinsert jpa;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
		//daoimpl.insertDataToDBUsingSpringJDBC();		
			jpa.insertDataUsingJpa();
	     }
		catch(DataAccessException d) {
			System.out.println(d);
			System.out.println(d.getClass());
			System.out.println(d.getMessage());
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
