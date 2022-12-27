package com.management.hr.user;

import org.springframework.stereotype.Service;

import com.management.hr.dto.UserDto;

@Service
public interface UserService {

	User create(UserDto userDto);
	User addInfo(UserDto userDto, String email);
	User showUser(String email);
	
}
