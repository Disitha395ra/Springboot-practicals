package lk.ac.vau.fas.ict.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/msg")
	public String myMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String myName() {
		return "My name is Spring Boot";
	}
	
	
}
