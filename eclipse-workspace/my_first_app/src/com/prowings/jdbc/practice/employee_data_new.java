package com.prowings.jdbc.practice;

public class employee_data_new {
	
	private int id;
	private String name;
	private int age;
	private long salary;
	private String department;
	
	public employee_data_new() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee_data_new(int id, String name, int age, long salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "employee_data_new [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	
	
	
	
}

