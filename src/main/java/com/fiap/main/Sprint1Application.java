package com.fiap.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.fiap.br.controllers, com.fiap.br.config")
@EnableJpaRepositories("com.fiap.br.repositories")
public class Sprint1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprint1Application.class, args);
	}

}
