package com.management.hr.user;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Table(name="user")
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String email;
	private String password;
	private String contact;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private Date joiningDate;
	private int salary;
	private String gender;
	private String maritalStatus;
	private Date dateOfBirth;
	private String emergencyContactNumber1;
	private String emergencyContactNumber2;
	private LocalDateTime createdAt;
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	
}
