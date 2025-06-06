package com.example.ict.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ict.model.Department;
import com.example.ict.repo.DepartmentRepo;

@Service
public class DepartmentService {
@Autowired
private DepartmentRepo repo;

public List<Department> getDept(){
	return repo.findAll();
}

public Department getDept(@PathVariable("id") int id) {
	if(repo.findById(id).isEmpty()) {
		return null;
	}
	return repo.findById(id).get();
}
}
