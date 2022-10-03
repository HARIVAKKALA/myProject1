package com.java.employee.dto;

import com.java.employee.entity.Company;

public class CompanyRequest {
	
	private Company company;

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "CompanyRequest [company=" + company + "]";
	}
}
