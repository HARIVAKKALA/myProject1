package com.springboot.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.mapping.entity.Customer;
import com.springboot.mapping.entity.Item;
import com.springboot.mapping.repo.CustomerRepo;
import com.springboot.mapping.repo.ItemRepo;

@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner{

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer = new Customer("hari");
		Item item = new Item("apple");
		customer.setItem(item);
		customerRepo.save(customer);
		
		
		
		
		
	}

}
