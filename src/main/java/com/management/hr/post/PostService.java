package com.management.hr.post;

import org.springframework.stereotype.Service;

@Service
public interface PostService {
	
	Post create(Post post);

	Post findByName(String string);
	
}
