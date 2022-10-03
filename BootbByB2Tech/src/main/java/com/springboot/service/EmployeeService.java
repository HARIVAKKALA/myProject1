package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {
	
	public List<Employee>getEmployees(int pagenumber,int size);
	public Employee saveEmployee(Employee employee);
	public Employee getSingleEmployee(Long id);
	public void deleteEmployee(Long id);
	public Employee updateEmployee(Employee employee);
	public List<Employee>getEmployeesByName(String name);
	public List<Employee>getEmployeesByNameAndLocation(String name,String location);
	public List<Employee>getEmployeeByKeyWord(String name);
	public List<Employee>getEmployeesByNameOrLocation(String name,String location);
	public Integer deleteEmplyeeByIdAndName(Long id,String name);
	
	public List<Employee>getAllEmployees();
	
}
