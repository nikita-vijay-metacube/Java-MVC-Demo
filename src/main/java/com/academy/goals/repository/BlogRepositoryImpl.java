package com.academy.goals.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Blog;

@Service
public class BlogRepositoryImpl implements BlogRepository {
	// storing data temporary…
	List<Blog> list;

	// adding constructor of List<Blog>
	public BlogRepositoryImpl() {
		// adding data into this constructor.
		list = new ArrayList<>();
		list.add(new Blog(1, "Blogs",
				"This is blog 1, hey this is cool.."));
		list.add(new Blog(2, "Blog",
				"This is blog 2. Hey just wait for it.."));
	}

	@Override
	public List<Blog> addBlogs() {
		// TODO Auto-generated method stub
		return list;
	}
}