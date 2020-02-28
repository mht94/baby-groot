package com.example.groot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GrootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrootApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "heartbeat", defaultValue = "World") String heartbeat) {
		return String.format("Hello, your heartbeat is %s!", heartbeat);
	}

}
