package com.springb5r6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.springb5r6.*")
public class SpringB5r6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringB5r6Application.class, args);
	}

}
