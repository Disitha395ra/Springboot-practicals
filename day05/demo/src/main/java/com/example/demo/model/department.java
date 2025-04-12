package com.example.demo.model;

import java.util.List;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class department {
	@Id
	@Column(name="depy_id")
	private int id;
	private String name;
	private Date established;
	
	@OneToMany(mappedBy="department")
	private List<employee>employees;
}
