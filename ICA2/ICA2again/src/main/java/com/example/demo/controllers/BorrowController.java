package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BookServices;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

	@GetMapping("/book")
	@Autowired
	private BookServices bookservices;
	private StudentService studentservice;
	
	//basic validation
	if(studentID == null || itemList == null || itemList.isEmpty()) {
		Map<String, Object> errorResponse  = new HashMap()<>();
		errorResponse.put("code", 400);
		errorResponse.put("status", "BAD REQUEST");
		errorResponse.put("message","Missing requiered data");
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	for(Map<String, Object>itemData : itemList) {
		String bookId = (String)itemData.get("bookId");
		Integer qty = (Integer) itemData.get("qty");
		
		if(bookId == null || qty == null || qty <=0) {
			Map<String, Object> errorResponse  = new HashMap<>();
			errorResponse.put("code", 400);
			errorResponse.put("status", "BAD REQUEST");
			errorResponse.put("message","in valid authority");
			return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
		}
	}
	
	Optional<Book> bookOpt = bookservices.findByBookid(bookId);
	
}
