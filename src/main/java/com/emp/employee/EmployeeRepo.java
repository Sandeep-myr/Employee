package com.emp.employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	
	
}
