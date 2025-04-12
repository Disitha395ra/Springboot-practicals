package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class project {
	@Id
	private int id;
	private String name;
	private long totalcost;
	
	
	@ManyToMany
	private List<employee> employees;
}
