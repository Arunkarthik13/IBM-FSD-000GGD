package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServer181919Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServer181919Application.class, args);
	}

}
