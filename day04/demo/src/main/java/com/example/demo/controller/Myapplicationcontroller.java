package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.Course;

@RestController
@RequestMapping("/app")
public class Myapplicationcontroller {

	Student Bob = new Student("2020-ICT-113", "Bob", 21, "IT", 2.5);
	Student Bib = new Student("2020-ICT-13", "Bib", 22, "IT", 2.8);
	Student Lho = new Student("2020-ICT-103", "Lho", 23, "IT", 2.2);
	Student Rcs = new Student("2020-ICT-03", "Rcs", 23, "IT", 2.3);
	
	Course c1 =  new Course("123","IT","ABC");
	Course c2 =  new Course("321","BIO","CDE");
	Course c3 =  new Course("132","AMC","EFG");
	Course c4 =  new Course("143","TEC","HIJ");

	List<Student> students = new ArrayList<Student>();
	List<Course> courses= new ArrayList<Course>();

	public Myapplicationcontroller() {
		students.add(Bob);
		students.add(Bib);
		students.add(Lho);
		students.add(Rcs);
		courses.add(c1);
		courses.add(c2);	
		courses.add(c3);	
		courses.add(c4);	
	}

	
	@GetMapping("/mymsg")
	public String myMsg() {
		return "Hii Spring boot";
	}

	@GetMapping("/student")
	public Student getStudent() {
		return Bob;
	}

	// print all student
	@GetMapping("/allstudents")
	public List<Student> getAllStudent() {
		return students;
	}

	// find student using regNo
	@GetMapping("/findbyregno/{regNo}")
	public Student findstudentbyregNo(@PathVariable("regNo") String regNo) {
		for (Student student : students) {
			if (student.getRegNo().equals(regNo)) {
				return student;
			}
		}
		return null;
	}

	// find student by age range
	@GetMapping("/findbyagerange/{min}/{max}")
	public List<Student> findstudentbyagerange(@PathVariable("min") int min, @PathVariable("max") int max) {
		List<Student> filteredStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getAge() >= min && student.getAge() <= max) {

				filteredStudents.add(student);
			}
		}
		return filteredStudents;
	}

	// sort student by their gpa
	@GetMapping("/students/sortbygpa")
	public List<Student> sortbygpa() {
		return students.stream()
				.sorted(Comparator.comparingDouble(Student::getGpa))
				.collect(Collectors.toList());
	}

	// CRUD (Create, Read, Update, Delete) operations
	// create student
	@PostMapping("/student/addstudent")
	public String addStudent(@RequestBody Student student) {
		students.add(student);
		return "Student add successfully";
	}

	// Read all students
	@GetMapping("/students/allstudents")
	public List<Student> getAll() {
		return students;
	}

	// update student
	@PutMapping("studentdetails/{regNo}")
	public String updateStudent(@PathVariable String regNo, @RequestBody Student updatedStudent) {
		for (Student student : students) {
			if (student.getRegNo().equals(regNo)) {
				student.setName(updatedStudent.getName());
				student.setCourse(updatedStudent.getCourse());
				student.setAge(updatedStudent.getAge());
				student.setGpa(updatedStudent.getGpa());
				return "Student update successfully";
			}
		}
		return "Student not found";
	}

	// Delete Student
	@DeleteMapping("/studentdelete/{regNo}")
	public String deleteStudent(@PathVariable String regNo) {
		students.removeIf(student -> student.getRegNo().equals(regNo));
		return "Student deleted successfully";
	}
	
	// print all courses
		@GetMapping("/allcourses")
		public List<Course> getAllCourses() {
			return courses;
		}

}
