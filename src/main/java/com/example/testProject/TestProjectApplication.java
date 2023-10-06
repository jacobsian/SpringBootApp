package com.example.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class TestProjectApplication {
//http://localhost:8080/swagger-ui/index.html#/
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
