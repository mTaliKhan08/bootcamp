package com.management.hr.UserDetails;

import com.management.hr.company.Company;
import com.management.hr.post.Post;
import com.management.hr.user.User;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name="user_details")
@Entity
@Data
@AllArgsConstructor
public class UserDetails {

	@Id
	@Column(name= "user")
	private int id;
	
	@OneToOne
	@JoinColumn(name="user")
	@MapsId
	private User user;
	
	@ManyToOne
	@JoinColumn(name="company")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="post")
	private Post post;

	public UserDetails(User user, Company company, Post post) {
		super();
		this.user = user;
		this.company = company;
		this.post = post;
	}
	
}
