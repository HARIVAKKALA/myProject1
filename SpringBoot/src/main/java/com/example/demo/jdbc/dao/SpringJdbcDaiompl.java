package com.example.demo.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbcDaiompl {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void insertDataToDBUsingSpringJDBC() {
		
	    String sql = "insert into Student values(2,'abhilash','india')";
		jdbctemplate.update(sql);
		
		System.out.println("Data inserted successfully");
	}

}
