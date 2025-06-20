package com.example.demo.bookrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Student;



public interface StudentRepository extends JpaRepository<Student, String>{
	
		@Query("select b from Student s join s.id. b where s.id=?1 ")
		public List<Student>filterBystudent(int bid);
}
