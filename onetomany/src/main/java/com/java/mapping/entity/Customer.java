package com.java.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;


@Entity
@Table(name="tbl_customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String gender;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL )
	@JoinColumn(name="cid_fk",referencedColumnName = "id")
	private List<Product>products;
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
