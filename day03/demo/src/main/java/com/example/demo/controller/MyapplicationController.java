package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
@RestController
@RequestMapping("/app")
public class MyapplicationController {
	
	Student Bob = new Student("2020/ICT/23","Bob",23,"IT",1.0);
	
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
}
