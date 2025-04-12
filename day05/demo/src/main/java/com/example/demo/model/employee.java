package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class employee {
	
	@Id
	private String EmpNo;
	private String name;
	private int age;
	private double salary;
	
	
	@ManyToOne
	private department department;

}
