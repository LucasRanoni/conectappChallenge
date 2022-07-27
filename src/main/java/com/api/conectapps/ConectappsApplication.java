package com.api.conectapps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConectappsApplication extends SpringBootServletInitializer {

	 private static final Logger LOGGER = LogManager.getLogger(ConectappsApplication.class);
	 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ConectappsApplication.class);
	}
	 
	public static void main(String[] args) {
        LOGGER.info("Conectapps API started");
		SpringApplication.run(ConectappsApplication.class, args);
	}

}
