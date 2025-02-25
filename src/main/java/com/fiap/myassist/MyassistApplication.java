package com.fiap.myassist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fiap.myassist.resources.repository"})
public class MyassistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyassistApplication.class, args);
	}

}
