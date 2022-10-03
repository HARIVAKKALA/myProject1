package com.java.basics;

public class Employee extends Object implements Comparable<Employee> {

	public int id;
	public String empname;
	
	Employee(int id, String empname){
		this.id = id;
		this.empname = empname;
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.empname.compareTo(o.empname);
	}
	
	public String toString() {
		return "id = "+id+"Name = "+empname;
	}
}
