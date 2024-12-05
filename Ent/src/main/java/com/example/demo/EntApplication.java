package com.example.demo;

import org.apache.catalina.Server;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages = {"co.edu.controller"})
@SpringBootApplication
@EntityScan({"co.edu.ue.model"})
@EnableJpaRepositories(basePackages = {"co.edu.ue.dao"})
@ComponentScan(basePackages = {"co.edu.ue.services","co.edu.ue.controler","co.edu.ue.dao"})
public class EntApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntApplication.class, args);
		
		System.getProperties().put("Server.port",8090);
		SpringApplication.run(ApplicationArguments.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
