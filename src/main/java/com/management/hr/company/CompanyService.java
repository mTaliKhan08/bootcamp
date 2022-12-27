package com.management.hr.company;

import org.springframework.stereotype.Service;

import com.management.hr.dto.CompanyDto;

@Service
public interface CompanyService {

	Company create(CompanyDto companyDto);

	Company showCompany(String name);
	
}
