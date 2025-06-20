package com.example.demo.bookrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{
	
	@Query("select b from Book where b.type=?1")
	public List<Book>filterByGenre(String type);
}
