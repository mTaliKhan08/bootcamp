package com.management.hr.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserDetailsRepository userDetailsRepo;
	
	@Transactional
	@Override
	public UserDetails create(UserDetails userDetails) {
		
		return this.userDetailsRepo.save(userDetails);	
	}
}
