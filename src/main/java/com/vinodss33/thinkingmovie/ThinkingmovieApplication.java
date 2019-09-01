package com.accolite.thinkingmovie;

import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ThinkingmovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkingmovieApplication.class, args);
	}

	@PreDestroy
	public void destroy() {
	}
}
