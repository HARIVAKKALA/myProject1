package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.beans.copy.MydataSource;

@Configuration
@PropertySource("classpath:mydatasource.properties")//Loads the .properiesfile
public class MyConfiguration {

	@Bean
	public MydataSource myDataSource(@Value("${mydatasource.username}")String username, //read the values from .properties file
			                         @Value("${mydatasource.password}")String password){
		
		  MydataSource mydata =new  MydataSource() ;
		  mydata.setUsername(username);
		  mydata.setPassword(password);
		  System.out.println(mydata.getUsername());
		  System.out.println(mydata.getPassword());
		  return mydata;
	}
}
