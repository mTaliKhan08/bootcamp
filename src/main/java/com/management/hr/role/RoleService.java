package com.management.hr.role;

import org.springframework.stereotype.Service;

@Service
public interface RoleService {
	
	Role create(Role role);

	Role findByName(String string);
}
