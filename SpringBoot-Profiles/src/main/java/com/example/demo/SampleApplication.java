package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.example.demo.beans.copy.Animal;
import com.example.demo.beans.copy.Cat;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner{

	@Autowired
	private Animal animal;
	
	
	@Value("${mycomp.name}")
	private String companyName;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Mycompany Name = "+companyName);
		animal.makeSound();
	}
	
	@Profile("cat")
	@Bean
	Cat catObject() {
		return new Cat();
	}

}
