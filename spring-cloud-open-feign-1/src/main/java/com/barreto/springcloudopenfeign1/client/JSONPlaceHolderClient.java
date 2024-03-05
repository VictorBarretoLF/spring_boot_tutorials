package com.barreto.springcloudopenfeign1.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
		value = "jsonplaceholder",
		url = "https://jsonplaceholder.typicode.com/"
		)
public interface JSONPlaceHolderClient {

}
