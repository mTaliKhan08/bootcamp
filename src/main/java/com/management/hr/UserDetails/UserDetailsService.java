package com.management.hr.UserDetails;

import org.springframework.stereotype.Service;

@Service
public interface UserDetailsService {

	UserDetails create(UserDetails userDetails);
	
}
