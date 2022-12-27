package com.management.hr.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepo;
	
	@Transactional
	@Override
	public Role create(Role role) {
		
		return this.roleRepo.save(role);
	}

	@Transactional
	@Override
	public Role findByName(String name) {
		return this.roleRepo.findByName(name);
		
	}

}
