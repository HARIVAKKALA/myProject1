package com.springboot.repository;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.model.Employee;

@Repository								/*implementing paging*/
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> /*JpaRepository<Employee, Long>*/ {
	
	/*in certain cases JPA will create the queries for us*/
	
	List<Employee>findByName(String name);
	
	//select *From employee where name="hari"and location="bangalore"
	List<Employee>findByNameAndLocation(String name,String location);

	//select *From employee where name like="%hari%"/*implementing sorting*/
	List<Employee>findByNameContaining(String name, Sort sort);
	
	@Query("from Employee where name=:name or location=:location")
	List<Employee> getEmployeesByNameAndLocation(@Param("name")String name,@Param("location")String location);
	
	@Transactional/*creating/updating/deleting we should use this annotation*/
	@Modifying/*creating/updating/deleting we should use this annotation*/
	@Query("Delete from Employee where id=:id and location =:location")
	public Integer deleteEmployeeByIdAndLocation(Long id,String location);

}
