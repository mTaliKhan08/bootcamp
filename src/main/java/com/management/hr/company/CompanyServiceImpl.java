package com.management.hr.company;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.hr.UserDetails.UserDetails;
import com.management.hr.UserDetails.UserDetailsService;
import com.management.hr.UserRole.UserRole;
import com.management.hr.UserRole.UserRoleService;
import com.management.hr.dto.CompanyDto;
import com.management.hr.dto.UserDto;
import com.management.hr.post.Post;
import com.management.hr.post.PostService;
import com.management.hr.role.Role;
import com.management.hr.role.RoleService;
import com.management.hr.user.User;
import com.management.hr.user.UserService;

@Service
public class CompanyServiceImpl implements CompanyService {

	private String findPost = "HR";
	private String findRole = "ADMIN";
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Autowired
	PostService postService;
	
	@Transactional
	@Override
	public Company create(CompanyDto companyDto) {
		
		Company company = this.modelMapper.map(companyDto, Company.class);
		company.setCreatedAt(LocalDateTime.now());
		Company persistedCompany = this.companyRepo.save(company);
		
		UserDto userDto = new UserDto(companyDto.getEmail(), companyDto.getPassword());
		User persistedUser = userService.create(userDto);
		
		Post post = postService.findByName(findPost);
		
		UserDetails userDetails = new UserDetails(persistedUser, persistedCompany, post);
		userDetailsService.create(userDetails);
		
		Role role = roleService.findByName(findRole);
		
		UserRole userRole = new UserRole(persistedUser, role);
		userRoleService.create(userRole);
		
		return persistedCompany;
	}

	@Override
	public Company showCompany(String name) {
		return this.companyRepo.findByName(name);
	}
}
