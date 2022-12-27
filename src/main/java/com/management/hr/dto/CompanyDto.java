package com.management.hr.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CompanyDto {

	
	@NotNull(message = "Name is Required Field")
	@Size(min = 3, max = 20, message = "Name must be 3 to 20 Characters")
	private String name;
	
	@Size(min = 3, max = 20, message = "Domain must be 3 to 20 Characters")
	private String domain;
	
	@NotNull(message = "Contact is Required Field")
	@Size(min = 11, max = 11, message = "Contact must be 11 Digits")
	private String contact;
	
	@Size(min = 20, max = 300, message = "Address must be 20 to 300 Digits")
	private String addressLine1;
	
	@Size(min = 20, max = 300, message = "Address must be 20 to 300 Digits")
	private String addressLine2;
	
	@NotNull(message = "City is Required Field")
	@Size(min = 3, max = 20, message = "City must be 20 to 300 Digits")
	private String city;
	
	@NotNull(message = "Country is Required Field")
	@Size(min = 5, max = 20, message = "Country must be 20 to 300 Digits")
	private String country;
	
	@NotNull(message = "Active is Required Field")
	private boolean active;
	
	@NotNull(message = "Email is Required Field")
	@Email(message = "Invalid Email Entered")
	@Size(min = 6, max = 30)
	private String email;
	
	@NotNull(message = "Password is Required Field")
	@Size(min = 8, max = 20, message = "Password must be 8 to 20 Digits Long")
	private String password;
	
	private LocalDateTime createdAt;

	public CompanyDto(
			@NotNull(message = "Name is Required Field") @Size(min = 3, max = 20, message = "Name must be 3 to 20 Characters") String name,
			@NotNull(message = "Contact is Required Field") @Size(min = 11, max = 11, message = "Contact must be 11 Digits") String contact,
			@NotNull(message = "City is Required Field") @Size(min = 3, max = 20, message = "City must be 20 to 300 Digits") String city,
			@NotNull(message = "Country is Required Field") @Size(min = 5, max = 20, message = "Country must be 20 to 300 Digits") String country,
			@NotNull(message = "Active is Required Field") boolean active,
			@NotNull(message = "Email is Required Field") @Email(message = "Invalid Email Entered") @Size(min = 6, max = 30) String email,
			@NotNull(message = "Password is Required Field") @Size(min = 8, max = 20, message = "Password must be 8 to 20 Digits Long") String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.city = city;
		this.country = country;
		this.active = active;
		this.email = email;
		this.password = password;
	}
	
	
	
}
