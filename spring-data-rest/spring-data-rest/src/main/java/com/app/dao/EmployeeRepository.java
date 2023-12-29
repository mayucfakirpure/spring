package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.entity.Employee;


@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
	@Query(value="select count(id) from Employee")
	public int getEmployeeCount();


}
