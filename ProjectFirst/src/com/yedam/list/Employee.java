package com.yedam.list;

public class Employee {
	//필드
	private int employeeId;
	private String lastName;
	private int salary;
	private String hireDate;
	
	//생성자
	public Employee(int employeeid, String lastName, int salary, String hireDate) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
		
	}
	
	// get set 메소드
	public int getEmployeeid() {
		return employeeId;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeId = employeeid;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + "]";
	}
	
}
