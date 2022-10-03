package com.java.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.employee.dto.CompanyRequest;
import com.java.employee.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {


}
