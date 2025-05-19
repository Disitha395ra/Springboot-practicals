package com.system.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
//	Attributes
	@Id
	private String empID;
	@Column(nullable = false)
	private String name;
	private int age;
	private double salary;
	private String address;
	@ManyToOne
	private Department department;
	@ManyToMany
	private List<Project>projects;
	@OneToOne
	private Insurance insurance;
	
//	Getters & Setters
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
//	Constructor
	public Employee(String empID, String name, int age, double salary, String address) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	

}