package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Service Started");

		SpringApplication.run(DemoApplication.class, args);
	}

}
