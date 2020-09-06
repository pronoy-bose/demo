package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Override
	// public void run(String... args) {
	// // Create the database table:
	// jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS beers(name
	// VARCHAR(100))");
	//
	// // Insert a record:
	// jdbcTemplate.execute("INSERT INTO beers VALUES ('Stella')");
	//
	// }

}
