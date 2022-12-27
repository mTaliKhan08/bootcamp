package com.management.hr.company;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Table(name="company")
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String domain;
	private String contact;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private boolean active;
	private LocalDateTime createdAt;
	
	public Company(String name, String contact, String city, String country, boolean active) {
		super();
		this.name = name;
		this.contact = contact;
		this.city = city;
		this.country = country;
		this.active = active;
	}
	
	
}
