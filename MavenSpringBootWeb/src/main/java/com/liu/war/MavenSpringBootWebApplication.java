package com.liu.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.liu.war")
public class MavenSpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootWebApplication.class, args);
	}

}
