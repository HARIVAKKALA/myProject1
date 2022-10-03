package com.springboot.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;
	
	/*implementing pagination and sorting*/
	@Override
	public List<Employee> getEmployees(int pageNumber,int size) {
		Sort sort = Sort.by(Sort.Direction.ASC,"id");
		Pageable pages = (Pageable) PageRequest.of(pageNumber, size,sort);
		return (List<Employee>) eRepository.findAll((Sort) pages);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		
		Optional<Employee> emp= eRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new RuntimeException("Employee Object not found"+id);
		}
		
	}

	@Override
	public void deleteEmployee(Long id) {
		eRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return eRepository.save(employee);
	}

	@Override
	public List<Employee>getEmployeesByName(String name){
		return eRepository.findByName(name);
	}

	@Override
	public List<Employee> getEmployeesByNameAndLocation(String name, String location) {
		
		return eRepository.findByNameAndLocation(name, location);
	}
	@Override
	public List<Employee> getEmployeeByKeyWord(String name) {
		
		Sort sort= Sort.by(Sort.Direction.DESC, "id");
		return eRepository.findByNameContaining(name,sort);
	}

	@Override
	public List<Employee> getEmployeesByNameOrLocation(String name, String location) {
		
		return eRepository.getEmployeesByNameAndLocation(name, location);
	}

	@Override
	public Integer deleteEmplyeeByIdAndName(Long id, String name) {
		// TODO Auto-generated method stub
		return eRepository.deleteEmployeeByIdAndLocation(id, name);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>)eRepository.findAll();
	}
}
