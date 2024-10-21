package com.juansefdz.aluraSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AluraSpringApplication  {

	private final Dotenv dotenv = Dotenv.load();
	public static void main(String[] args) {
		SpringApplication.run(AluraSpringApplication.class, args);
	}
}
