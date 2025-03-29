package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyapplicationController {
	
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
