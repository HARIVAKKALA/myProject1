package com.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
 
@Entity
@Table(name="tbl_employee")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	//@JsonProperty("full_name")// it will provide alias name in json response
	@Column(name = "name")
	//@NotNull(message="name must not be null value") it will check only Null value but  accept "" empty space as a value 
	//@NotEmpty(message="name must not be null value") it is also having the issue it's accepted ("   ") as a null value
	@NotBlank(message="name must not be null value")
	private String name;
	
	@Column(name="age")
	private Long age=0L;//setting default value if user not providing it will be zero by default
	
	@Column(name="location")
	//@NotEmpty(message = "location is mandatory")
	@NotBlank(message="location must not be null value")
	private String location;
	
	@Column(name="email")
	//@NotEmpty(message = "Email is mandatory")
	@NotBlank(message="email must not be null value")
	private String email;
	
	//@JsonIgnore// it will hide while getting response in postman
	@Column(name="department")
	//@NotNull(message="department must not be null value")
	//@NotEmpty(message="department must not be null value")
	@NotBlank(message="department must not be null value")
	private String department;
	
	@CreationTimestamp
	@Column(name="created_at", nullable = false, updatable=false)
	private Date createdat;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedat;
	
	
	public Date getCreatedat() {
		return createdat;
	}
	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}
	public Date getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", email=" + email
				+ ", department=" + department + "]";
	}
	
}
