package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beer;

@RestController
public class DemoController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${demo.name:}")
	String name;

	@GetMapping("beer")
	public ResponseEntity<String> getBeers() {
		// Read records:
		List<Beer> beers = jdbcTemplate.query("SELECT * FROM beers",
				(resultSet, rowNum) -> new Beer(resultSet.getString("name"), name));

		return new ResponseEntity<String>(beers.toString(), HttpStatus.OK);
	}

}
