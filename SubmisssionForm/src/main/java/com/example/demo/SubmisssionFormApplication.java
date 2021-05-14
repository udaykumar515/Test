package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.SubmisssionFormApplication;

@ComponentScan
@SpringBootApplication
public class SubmisssionFormApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SubmisssionFormApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SubmisssionFormApplication.class, args);
	}

}
