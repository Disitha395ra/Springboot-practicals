package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bookrepo.StudentRepository;
import com.example.demo.models.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepo;
	
	public List<Student> filterbyId(String id){
		return studentrepo.filterBystudent(id);
	}
	
}
