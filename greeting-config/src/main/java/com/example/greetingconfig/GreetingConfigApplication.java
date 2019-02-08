package com.example.greetingconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class GreetingConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingConfigApplication.class, args);
	}

}

