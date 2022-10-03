package com.java.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.employee.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
