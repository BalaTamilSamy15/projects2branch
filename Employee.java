package com.onesoft.day12;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private int salary;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, String ge, int sa) {
		this.name = name;
		this.age = age;
		gender = ge;
		salary = sa;
	}
	
	public String toString() {
		return "name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary ;
	}
	

}
