package com.academy.goals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.academy.goals.model.Blog;
import com.academy.goals.service.BlogServiceImpl;

@Controller
public class HomeController {

	@RequestMapping("/blogs")
	public ModelAndView showMessage() {
		BlogServiceImpl blogService = new BlogServiceImpl();
		List<Blog> blogs = blogService.getBlogs();
		ModelAndView mv = new ModelAndView("blogs");
		mv.addObject("blogs", blogs);
		return mv;
	}
}