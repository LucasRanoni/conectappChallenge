package com.api.conectapps;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class ConectappsApplication  {
@OpenAPIDefinition(info =@Info(title = "API", version = "1.0.0.0", description = "BASE API"))
public class ConectappsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ConectappsApplication.class);
	}
	
	public static void main(String[] args) {
			SpringApplication.run(ConectappsApplication.class, args);
	}
	
}
