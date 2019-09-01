package com.accolite.thinkingmovie.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.omertron.omdbapi.OmdbApi;

@Configuration
public class ConfigClass {
	@Value("${omdb.api.key}")
	private String apikey;

	@Bean
	public OmdbApi jpaDataService() {
		return new OmdbApi(apikey);
	}
}
