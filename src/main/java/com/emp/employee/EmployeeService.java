package com.emp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	  @Autowired
		private EmployeeRepo employeeRepo;
	  
	  public String AddEmployee(List<Employee> empList) {
		  employeeRepo.saveAll(empList);
		  return "All Employee Added";
	  }
}
