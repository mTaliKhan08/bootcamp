package com.management.hr.UserRole;

import com.management.hr.role.Role;
import com.management.hr.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name="user_role")
@Entity
@Data
@AllArgsConstructor
public class UserRole {

	@Id
	@Column(name = "user")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user")
	@MapsId
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;

	public UserRole(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}
	
	
	
}
