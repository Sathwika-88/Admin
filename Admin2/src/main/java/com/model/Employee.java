package com.model;

public class Employee {
private int id;
private String name;
private int age;
private int salary;
private String mobile;
private boolean isActive;
public Employee(int id, String name, int age, int salary, String mobile, boolean isActive) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.mobile = mobile;
	this.isActive = isActive;
}
public Employee(String name, int age, int salary, String mobile) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.mobile = mobile;
	//this.isActive = isActive;
}

public Employee(String name, int age, int salary, String mobile, boolean isActive) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.mobile = mobile;
	this.isActive = isActive;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", mobile=" + mobile
			+ ", isActive=" + isActive + "]";
}

}
