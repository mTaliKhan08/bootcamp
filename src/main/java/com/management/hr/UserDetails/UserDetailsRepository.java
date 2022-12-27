package com.management.hr.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.hr.user.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, User> {

}
