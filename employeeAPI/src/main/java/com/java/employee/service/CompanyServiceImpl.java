package com.java.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.employee.entity.Company;
import com.java.employee.repo.CompanyRepo;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepo companyRepo;
	
	@Override
	public Company saveCompanyDetails(Company company) {
		return companyRepo.save(company);
	}
}
