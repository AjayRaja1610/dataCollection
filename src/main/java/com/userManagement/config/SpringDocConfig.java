package com.userManagement.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
	@Bean
	public GroupedOpenApi PlanControllerApi() {
		return GroupedOpenApi.builder().group("Data-Collection").packagesToScan("com.userManagement.controller").build();
	}

}
