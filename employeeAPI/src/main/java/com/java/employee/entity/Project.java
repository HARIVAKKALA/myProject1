package com.java.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tbl_project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  projectId;
	@Column
	private String projectName;
	@Column
	private String description;
	@Column
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String startdate;
	@Column
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String enddate;
	@Column
	private String location;
	@Column
	private double price;
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

	
	
}
