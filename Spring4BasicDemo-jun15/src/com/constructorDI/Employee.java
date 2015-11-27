package com.constructorDI;


public class Employee {
	String name,department;
	int salary,mobile;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public Employee(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public Employee(String name, int salary, int mobile) {
		super();
		this.name = name;
		this.salary = salary;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department
				+ ", salary=" + salary + ", mobile=" + mobile + "]";
	}
	
	

}
