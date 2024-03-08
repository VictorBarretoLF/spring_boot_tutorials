package com.barreto.springcloudopenfeign1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barreto.springcloudopenfeign1.client.JSONPlaceHolderClient;
import com.barreto.springcloudopenfeign1.model.Post;
import com.barreto.springcloudopenfeign1.service.JSONPlaceHolderService;

@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService {

	@Autowired
	private JSONPlaceHolderClient jsonPlaceHolderClient;
	
    @Override
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }
    
}
