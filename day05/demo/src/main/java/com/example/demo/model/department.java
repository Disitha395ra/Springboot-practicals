package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class department {
	@Id
	@Column(name="depy_id")
	private int id;
	private String name;
	private Date established;
}
