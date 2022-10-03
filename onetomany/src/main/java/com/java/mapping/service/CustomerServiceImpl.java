package com.java.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mapping.entity.Customer;
import com.java.mapping.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer savedata(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> fetchData() {
		return customerRepo.findAll();
	}

}
