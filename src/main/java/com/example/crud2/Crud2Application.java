package com.example.crud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication

@EnableScheduling
public class Crud2Application {

	public static void main(String[] args) {
		SpringApplication.run(Crud2Application.class, args);
	}

}
