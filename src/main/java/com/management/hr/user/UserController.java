package com.management.hr.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.hr.dto.UserDto;

@RestController
@RequestMapping("/api/hrms/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody UserDto userDto) {
		return userService.create(userDto);
	}
	
	@PutMapping("/{email}/")
	public User addInfo(@RequestBody UserDto userDto, @PathVariable String email) {
		return userService.addInfo(userDto, email);
	}
	
	@GetMapping("/{email}/")
	public User showUser(@PathVariable String email) {
		return userService.showUser(email);
	}
}
