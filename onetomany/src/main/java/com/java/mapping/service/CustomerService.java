package com.java.mapping.service;

import java.util.List;

import com.java.mapping.entity.Customer;

public interface CustomerService {

	public Customer savedata(Customer customer);
	public List<Customer>fetchData();
}
