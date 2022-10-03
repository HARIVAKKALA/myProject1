 package com.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

//adding @Controller annotation this class is responsible for the handling the http requests
//@Controller

/*@RequestMapping("/api/v1")  /* now the url changed to for all the controller like   Ex:localhost:8080/api/v1/employees		
if we create N number of controllers in every controller we should annotated with this path("/api/v1")instead of giving in every class we can 
give application.properties file which is common for all controller classes*/

@RestController    //it is combination of @Controller+@ResponseBody
public class EmployeeController {
	
   //The EmployeeService object automatically injected by the @Autowired annotation
	@Autowired
	private EmployeeService eservice;
	
	//reading the values from properties file
	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	private String appVersion;
	@GetMapping("/version")
	public String getAppDetails(){
		return "appName = "+appName+" appVersion "+appVersion;
	}
	
	//@RequestMapping(value="/employees", method = RequestMethod.GET)
	//@ResponseBody
	//fetching all the records from database
	@GetMapping("/employees")
	public ResponseEntity <List<Employee>> getEmployees(@RequestParam int pageNumber,@RequestParam int size) {
		return new ResponseEntity<List<Employee>> (eservice.getEmployees(pageNumber,size),HttpStatus.OK);
	}
	
	//get all employees without paging
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>>getAllEmployees(){
		return new ResponseEntity<List<Employee>>(eservice.getAllEmployees(),HttpStatus.OK);
	}
	
	
	//Ex:localhost:8080/employees/1
	//fetch by employee id
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(eservice.getSingleEmployee(id),HttpStatus.OK);
	}
	
	//fetching the data by Name
	@GetMapping("/employees/filterByName")
	public ResponseEntity<List<Employee>>getEmployeesByName(@RequestParam String name) {
		return new ResponseEntity<List<Employee>>(eservice.getEmployeesByName(name),HttpStatus.OK);
	}
	
	//fetching the data by name and location
	@GetMapping("/employees/filterByNameandLocation")
	public ResponseEntity<List<Employee>> getEmployeesByNameAndLocation(@RequestParam String name, @RequestParam String location){
		return new ResponseEntity<List<Employee>>(eservice.getEmployeesByNameAndLocation(name, location),HttpStatus.OK);
	}
	
	//fetching the data by name Or location
		@GetMapping("/employees/{name}/{location}")
		public ResponseEntity<List<Employee>> getEmployeesByNameOrLocation(@PathVariable String name, @PathVariable String location){
			return new ResponseEntity<List<Employee>>(eservice.getEmployeesByNameOrLocation(name, location),HttpStatus.OK);
		}
		
	//fetch by Department
	@GetMapping("/employees/filterByKeyWord")
	public ResponseEntity<List<Employee>>getEmployeeByKeyWord(@RequestParam String name){
		return new ResponseEntity<List<Employee>>(eservice.getEmployeeByKeyWord(name),HttpStatus.OK);
	}
	//ex:localhost:8080/employees?id=12
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") Long id) {
		eservice.deleteEmployee(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	
	//delete by Id and name 
	@DeleteMapping("/employee/delete/{id}/{name}")
	public ResponseEntity<String>deleteByIdAndName(@PathVariable Long id, @PathVariable String name) {
		return new ResponseEntity<String>(eservice.deleteEmplyeeByIdAndName(id, name)+"number of records",HttpStatus.NO_CONTENT);
	}
	
	
	//creating object 
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
		return new ResponseEntity<Employee> (eservice.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//updating the data
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return new ResponseEntity<Employee>(eservice.updateEmployee(employee), HttpStatus.OK);
	}
}