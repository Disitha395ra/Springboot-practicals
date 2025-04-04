package com.example.demo.model;

public class Course {
	private String courseid;
	private String coursename;
	private String courselecturer;
	public Course(String courseid, String coursename, String courselecturer) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courselecturer = courselecturer;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCourselecturer() {
		return courselecturer;
	}
	public void setCourselecturer(String courselecturer) {
		this.courselecturer = courselecturer;
	}
	
	

}
