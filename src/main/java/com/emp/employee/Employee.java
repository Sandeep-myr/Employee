package com.emp.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Column(name = "empno")
    @Id
	private int empno;
	@Column(name = "ename")
	private String ename;
	@Column(name = "job")
	private String job;
	@Column(name = "MobileNumber")
	private String mobileNumber;
	@Column(name = "EmailId")
	private String emailId;
	@Column(name = "Age")
	private int age;
	@Column(name = "Salary")
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empno, String ename, String job, String mobileNumber, String emailId, int age, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.age = age;
		this.salary = salary;

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", age=" + age + ", salary=" + salary + "]";
	}

}
