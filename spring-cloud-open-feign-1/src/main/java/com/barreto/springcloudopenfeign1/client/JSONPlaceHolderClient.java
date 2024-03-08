package com.barreto.springcloudopenfeign1.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.barreto.springcloudopenfeign1.model.Post;

@FeignClient(name = "jsonplaceholder", value = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {

	@GetMapping("/posts")
	List<Post> getPosts();

}
