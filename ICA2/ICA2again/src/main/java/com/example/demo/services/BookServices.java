package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bookrepo.BookRepository;
import com.example.demo.models.Book;

@Service
public class BookServices {

	@Autowired
	private BookRepository BookRe;
	
	
	public List<Book>filterBooks(String type){
		return BookRe.filterByGenre(type);
	}
	
	
}
