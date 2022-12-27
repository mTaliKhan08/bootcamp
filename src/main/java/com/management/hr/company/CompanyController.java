package com.management.hr.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.hr.dto.CompanyDto;
import com.management.hr.user.User;

@RestController
@RequestMapping("/api/hrms/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/")
	public Company createUser(@RequestBody CompanyDto companyDto) {
		return companyService.create(companyDto);
	}
	@GetMapping("/{name}/")
	public Company showCompany(@PathVariable String name) {
		return companyService.showCompany(name);
	}
}
