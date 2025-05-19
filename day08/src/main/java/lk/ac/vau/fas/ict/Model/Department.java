package com.system.Model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

//	Attributes
	@Id
	@Column(name = "dep_id")
	private String depID;
	@Column(nullable = false)
	private String depName;
	private Date established;
	@OneToMany(mappedBy = "department")
	private List<Employee>employees;
	
	//	Constructor
	public Department(String depID, String depName, Date established) {
		super();
		this.depID = depID;
		this.depName = depName;
		this.established = established;
	}


//	Getters & Setters
	public String getDepID() {
		return depID;
	}

	public void setDepID(String depID) {
		this.depID = depID;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Date getEstablished() {
		return established;
	}

	public void setEstablished(Date established) {
		this.established = established;
	}
	
	
}