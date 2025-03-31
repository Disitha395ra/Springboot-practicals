package com.example.demo.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DemoApplication;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/app")
public class MyapplicationController {

    private final DemoApplication demoApplication;
	
	Student Bob = new Student("2020/ICT/113","Bob",23,"IT",1.0);
	Student Naml = new Student("2020/ICT/12","Naml",24,"AMC",2.0);
	Student Kaml = new Student("2020/ICT/13","Kaml",20,"ASB",3.0);
	Student Kasun = new Student("2020/ICT/110","Kasun",21,"TECH",1.4);
	
	java.util.List<Student> students = new ArrayList<Student>();

        public Myapplicationcontroller() {
		students.add(Bob);
		students.add(Naml);
		students.add(Kaml);
		students.add(Kasun);
	}
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

	//print all student
	@GetMapping("/allstudents")
	public List<Student>getAllStudent(){
		return students;
	}
	
	//return all the students using proper datastructure
	@GetMapping("/findbyregno/{regNo}")
	public Student findstudentbyregNo(@PathVariable("regNo") String regNo){
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				return student;
			}
		}
		return null;
	}
	
	//find the students whoose age is between 20 and 23
	@GetMapping("/findbyagerange/{min}/{max}")
	public List<Student> findstudentbyagerange(@PathVariable("min") int min, @PathVariable("max") int max) {
		List<Student> filteredStudents = new ArrayList<>();
		for(Student student:students) {
			if(student.getAge() >= min && student.getAge() <= max) {
				
				filteredStudents.add(student);
			}
		}
		return filteredStudents;
	}
	
	//sorts the students by their GPA
	@GetMapping("/students/sorted-by-gpa")
    public java.util.List<Student> sortStudentsByGPA() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
	
	//create CRUD opperations for students
}
