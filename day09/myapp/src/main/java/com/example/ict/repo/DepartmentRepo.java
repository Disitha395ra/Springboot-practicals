package com.example.ict.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ict.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
