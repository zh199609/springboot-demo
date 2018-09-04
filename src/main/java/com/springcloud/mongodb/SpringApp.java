package com.springcloud.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//缓存的开启
public class SpringApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
}
