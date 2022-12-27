package com.management.hr.user;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.hr.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	UserRepository userRepo;
	
	@Transactional
	@Override
	public User create(UserDto userDto) {
		
		User user = this.modelMapper.map(userDto, User.class);
		user.setCreatedAt(LocalDateTime.now());
		User persistedUser = this.userRepo.save(user);
		
		return persistedUser;
	}

//	@Transactional
//	public User findUserByEmail(String email) {
//		
//		User user = this.userRepo.findByEmail(email);
//		return user;
//	}
	
	@Transactional
	@Override
	public User addInfo(UserDto userDto, String email) {
		
		User user = this.userRepo.findByEmail(email);
		
		user.setFirst_name(userDto.getFirst_name());
		user.setMiddle_name(userDto.getMiddle_name());
		user.setLast_name(userDto.getLast_name());
		user.setContact(userDto.getContact());
		user.setAddressLine1(userDto.getAddressLine1());
		user.setAddressLine2(userDto.getAddressLine2());
		user.setCity(userDto.getCity());
		user.setCountry(userDto.getCountry());
		user.setGender(userDto.getGender());
		user.setMaritalStatus(userDto.getMaritalStatus());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setEmergencyContactNumber1(userDto.getEmergencyContactNumber1());
		user.setEmergencyContactNumber2(userDto.getEmergencyContactNumber2());
		
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setCreatedAt(user.getCreatedAt());
//		user = this.modelMapper.map(userDto, User.class);
		User persistedUser = this.userRepo.save(user);
		return persistedUser;
	}

	@Override
	public User showUser(String email) {
		return this.userRepo.findByEmail(email);
	}
}
