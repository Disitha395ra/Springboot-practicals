package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookServices;

@RestController
@RequestMapping("/api/book")
public class BookController {

	
	@Autowired
	private BookServices bookservics;
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Book>>FilterBooksByGenric(@PathVariable("name")String type){
		return new ResponseEntity<List<Book>>(bookservics.filterBooks(type),HttpStatus.OK);
	}
	
}
