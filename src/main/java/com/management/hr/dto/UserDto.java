package com.management.hr.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class UserDto {
	
	@Size(min = 3, max = 10, message = "First Name must be 3 to 10 Characters")
	private String first_name;
	
	@Size(min = 3, max = 10, message = "First Name must be 3 to 10 Characters")
	private String middle_name;
	
	@Size(min = 3, max = 10, message = "First Name must be 3 to 10 Characters")
	private String last_name;
	
	@NotNull(message = "Email is Required Field")
	@Email(message = "Invalid Email Entered")
	@Size(min = 6, max = 30)
	private String email;
	
	@NotNull(message = "Password is Required Field")
	@Size(min = 8, max = 20, message = "Password must be 8 to 20 Digits Long")
	private String password;
	
	@Size(min = 11, max = 11, message = "Contact must be 11 Digits")
	private String contact;
	
	@Size(min = 20, max = 300, message = "Address must be 20 to 300 Digits")
	private String addressLine1;
	
	@Size(min = 20, max = 300, message = "Address must be 20 to 300 Digits")
	private String addressLine2;
	
	@Size(min = 3, max = 20, message = "City must be 20 to 300 Digits")
	private String city;
	
	@Size(min = 5, max = 20, message = "Country must be 20 to 300 Digits")
	private String country;
	private Date joiningDate;
	
	private int salary;
	
	@Size(min = 4, max = 6, message = "Gender must be Male or Female")
	private String gender;
	
	@Size(min = 6, max = 7, message = "Marital Status must be Single or Married")
	private String maritalStatus;
	
	private Date dateOfBirth;
	
	@Size(min = 11, max = 11, message = "Emergency Contact Number 1 must be 11 Digits")
	private String emergencyContactNumber1;
	
	@Size(min = 11, max = 11, message = "Emergency Contact Number 2 must be 11 Digits")
	private String emergencyContactNumber2;
	
	public UserDto(
			@NotNull(message = "Email is Required Field") @Email(message = "Invalid Email Entered") @Size(min = 6, max = 30) String email,
			@NotNull(message = "Password is Required Field") @Size(min = 8, max = 20, message = "Password must be 8 to 20 Digits Long") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	
}
