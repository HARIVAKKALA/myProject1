package com.java.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tbl_empinfo")
public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String address;
	@Column
	private String pnum;
	@Column
	private String gender;
	@Column
	private int age;
	
	
	@OneToMany(targetEntity = Skill.class, cascade = CascadeType.ALL )
	@JoinColumn(name="empid",referencedColumnName ="empid" )
	private List<Skill> skills;
	 
	
	
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
