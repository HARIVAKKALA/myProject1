package com.java.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.employee.entity.EmployeeInfo;

@Repository
public interface EmployeeInfoRepo extends JpaRepository<EmployeeInfo, Integer>{

}
