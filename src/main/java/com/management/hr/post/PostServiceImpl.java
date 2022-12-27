package com.management.hr.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	postRepository postRepo;
	
	@Transactional
	@Override
	public Post create(Post post) {
		return this.postRepo.save(post);
	}

	@Transactional
	@Override
	public Post findByName(String name) {
		return this.postRepo.findByName(name);
	}

}
