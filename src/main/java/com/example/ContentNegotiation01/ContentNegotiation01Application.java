package com.example.ContentNegotiation01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class ContentNegotiation01Application {

	public static void main(String[] args) {
		SpringApplication.run(ContentNegotiation01Application.class, args);
	}

}
