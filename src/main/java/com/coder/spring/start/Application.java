package com.coder.spring.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.coder.spring.controller"}) //seeking for controller class
@EntityScan("com.coder.spring.entity") //let it to search for entity class in this path
@EnableJpaRepositories("com.coder.spring.dao") //enable jpa repository interface in this path
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
