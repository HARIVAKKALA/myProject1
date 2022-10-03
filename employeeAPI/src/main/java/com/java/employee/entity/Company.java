package com.java.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_company")
public class Company {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int company_Id;
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String company_name;
	@Column
	private String dateofEstablishment;
	@Column
	private  String description;
	@Column
	private String address;
	

	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getDateofEstablishment() {
		return dateofEstablishment;
	}
	public void setDateofEstablishment(String dateofEstablishment) {
		this.dateofEstablishment = dateofEstablishment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [company_Id=" + company_Id + ", company_name=" + company_name + ", dateofEstablishment="
				+ dateofEstablishment + ", description=" + description + ", address=" + address + "]";
	}
}
