package com.management.hr.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.hr.user.User;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, User> {

}
