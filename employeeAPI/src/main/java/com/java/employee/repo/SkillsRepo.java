package com.java.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.employee.entity.Skill;

@Repository
public interface SkillsRepo extends JpaRepository<Skill, Integer> {

}
