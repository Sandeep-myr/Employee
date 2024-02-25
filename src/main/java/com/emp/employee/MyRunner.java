package com.emp.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements  CommandLineRunner	 {

	@Autowired
	private EmployeeService employeeService;
	@Override
	public void run(String... args) throws Exception {
		
		Employee emp1 = new Employee(111,"sandeep","developer","7000517223","sansahu921@gmail.com",22,12000);
		Employee emp2 = new Employee(112,"satyendra","Manager","7000552875","satyendra21@gmail.com",25,19000);
		Employee emp3 = new Employee(113,"Manish","Tester","7693937561","Manish21@gmail.com",19,42000);
		Employee emp4 = new Employee(114,"Pankaj","Manager","9685719998","pankaj7725@gmail.com",29,20000);
		Employee emp5= new Employee(115,"Akhil","developer","7000531275","akhil@gmail.com",50,2000);
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		String result= employeeService.AddEmployee(empList);
		System.out.println(result);
		
		
		
		
	}

}
