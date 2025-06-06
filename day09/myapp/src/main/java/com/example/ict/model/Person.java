package com.example.ict.model;


import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	private String name;
	private String gender;
	private int age;
}
