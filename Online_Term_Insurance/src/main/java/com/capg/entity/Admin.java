package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity @Data @Table(name = "AdminLogin")
@AllArgsConstructor
public class Admin {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private String email;
	private String password;
	
}
