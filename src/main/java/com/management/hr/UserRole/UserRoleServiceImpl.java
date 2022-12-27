package com.management.hr.UserRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleRepository userRoleRepo;
	
	@Transactional
	@Override
	public UserRole create(UserRole userRole) {
		return this.userRoleRepo.save(userRole);
	}
}
