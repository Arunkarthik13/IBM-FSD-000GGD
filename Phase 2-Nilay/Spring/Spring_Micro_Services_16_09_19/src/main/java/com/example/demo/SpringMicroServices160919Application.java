package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMicroServices160919Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServices160919Application.class, args);
	}

}
