package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService stuservice;
	
	@GetMapping("/filterby/{id}")
	public ResponseEntity<List<Student>>filterstudentbyid(@PathVariable("id")String id){
		return new ResponseEntity<List<Student>>(stuservice.filterbyId(id),HttpStatus.OK); 
	}
	
}
