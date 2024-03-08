package com.barreto.springcloudopenfeign1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barreto.springcloudopenfeign1.model.Post;
import com.barreto.springcloudopenfeign1.service.JSONPlaceHolderService;

@RestController
public class PostsController {
	
	@Autowired
	private JSONPlaceHolderService jsonPlaceHolderService;

	@GetMapping("/posts")
	public List<Post> getPosts() {
		return jsonPlaceHolderService.getPosts();
	}
}
