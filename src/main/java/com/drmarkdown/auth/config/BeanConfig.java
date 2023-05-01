package com.drmarkdown.auth.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BeanConfig {
	
	@Bean 
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
	}
	
	
	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
