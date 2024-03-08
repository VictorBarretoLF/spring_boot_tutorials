package com.barreto.springcloudopenfeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOpenFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenFeign1Application.class, args);
	}

}
