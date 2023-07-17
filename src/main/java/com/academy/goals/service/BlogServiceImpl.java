package com.academy.goals.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Blog;
import com.academy.goals.repository.BlogRepository;
import com.academy.goals.repository.BlogRepositoryImpl;

@Service
public class BlogServiceImpl implements BlogService {
	// storing data temporary…
	List<Blog> list;

	@Override
	public List<Blog> getBlogs() {
		BlogRepository blogRepository = new BlogRepositoryImpl();
		this.list = blogRepository.addBlogs();
		return list;
	}
}