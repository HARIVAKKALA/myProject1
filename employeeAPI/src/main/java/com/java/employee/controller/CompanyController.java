package com.java.employee.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.employee.dto.CompanyRequest;
import com.java.employee.entity.Company;
import com.java.employee.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	private static final Logger logger = (Logger)LoggerFactory.logger(CompanyController.class);
	 
	@PostMapping("/savecomp")
	public ResponseEntity<Company> saveCompanyDetails(@RequestBody CompanyRequest company) {
		System.out.println(company.toString());
		logger.info("Info Message Logged !!! = "+company.toString());	
		logger.debug("Debug Message Logged !!!= "+company);
		if(company.getCompany()!=null) {
		return new ResponseEntity<Company>(companyService.saveCompanyDetails(company.getCompany()), HttpStatus.OK);
	}else {
		return null;
	}
}
}
