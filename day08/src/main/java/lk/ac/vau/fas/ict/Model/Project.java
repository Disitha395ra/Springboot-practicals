package com.system.Model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Project {

//	Attributes
	@Id
	@Column(name = "P_ID")
	private String projectID;
	@Column(name = "P_Name", nullable = false)
	private String projectName;
	private Date startDate;
	private Date deadLine;
	@ManyToMany(mappedBy = "projects")
	private List<Employee>employees;
	
//	Constructor
	public Project(String projectID, String projectName, Date startDate, Date deadLine, List<Employee> employees) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.startDate = startDate;
		this.deadLine = deadLine;
		this.employees = employees;
	}

//	Getters & Setters
	public String getProjectID() {
		return projectID;
	}


	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}