package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;



@RestController
@RequestMapping("/app")
public class Myapplicationcontroller {
	
	Student Bob = new Student("2020-ICT-113", "Bob", "IT", 23,2.5);
	Student Bib = new Student("2020-ICT-13", "Bib", "IT", 22,2.8);
	Student Lho = new Student("2020-ICT-103", "Lho", "IT", 22,2.2);
	Student Rcs = new Student("2020-ICT-03", "Rcs", "IT", 21,2.3);
	
	List<Student> students = new ArrayList<Student>();
	
	public Myapplicationcontroller() {
		students.add(Bob);
		students.add(Bib);
		students.add(Lho);
		students.add(Rcs);
	}
	
	@GetMapping("/mymsg")
	public String myMsg() {
		return "Hii Spring boot";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return Bob;
	}
	
	//print all student
	@GetMapping("/allstudents")
	public List<Student>getAllStudent(){
		return students;
	}
	
	//find student using regNo
	@GetMapping("/findbyregno/{regNo}")
	public Student findstudentbyregNo(@PathVariable("regNo") String regNo){
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				return student;
			}
		}
		return null;
	}
	
	//find student by age range
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
	
	//sort student by their gpa
	@GetMapping("/students/sortbygpa")
	public List<Student> sortbygpa(){
		return students.stream()
				.sorted(Comparator.comparingDouble(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	//CRUD (Create, Read, Update, Delete) operations
	//create student
	@PostMapping("/student/addstudent")
	public String addStudent(@RequestBody Student student) {
		students.add(student);
		return "Student add successfully";
	}
	
	//Read all students
	@GetMapping("/students/allstudents")
	public List<Student> getAll(){
		return students;
	}
	
	//update student
	@PutMapping("studentdetails/{regNo}")
	public String updateStudent(@PathVariable String regNo, @RequestBody Student updatedStudent) {
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				student.setName(updatedStudent.getName());
				student.setCourse(updatedStudent.getCourse());
				student.setAge(updatedStudent.getAge());
				student.setGpa(updatedStudent.getGpa());
				return "Student update successfully";
			}
		}
		return "Student not found";
	}
	
	//Delete Student
	
	

}
