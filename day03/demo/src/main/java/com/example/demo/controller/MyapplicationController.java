package com.example.demo.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
@RestController
@RequestMapping("/app")
public class MyapplicationController {
	
	Student Bob = new Student("2020/ICT/113","Bob",23,"IT",1.0);
	Student Naml = new Student("2020/ICT/12","Naml",24,"AMC",2.0);
	Student Kaml = new Student("2020/ICT/13","Kaml",20,"ASB",3.0);
	Student Kasun = new Student("2020/ICT/110","Kasun",21,"TECH",1.4);
	
	java.util.List<Student> students = new ArrayList<Student>();
	
	@GetMapping("/msg")
	public String mymsg() {
		return "Hello Springboot";
	}
	
	@GetMapping("/name")
	public String myName() {
		return "Hello Iam Disith";
	}
	
	@GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag") int age) {
		return "My age is "+age;
	}
	
	//method to return only one student
	@GetMapping("/Bobstudent")
	public Student getStudent() {
		return Bob;
	}
	
	//return all the students using proper datastructure
	public java.util.List<Student> getAllStudent(){
		return students;
	}
	
	public Student findStudent(@PathVariable("regNo") String regNo) {
		for(Student student : students) {
			if(student.getRegNo().equals(regNo)) {
				return student;
			}
		}
		return null;
	}
	
	//find the students whoose age is between 20 and 23
	
	
	//sorts the students by their GPA
	
	
	//create CRUD opperations for students
}
