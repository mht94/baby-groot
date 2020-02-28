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

	@RequestMapping("/song")
	public String heartbeat(@RequestParam(value = "heartbeat", defaultValue = "60") int heartBeat) {
		String song = "";

		if (heartBeat < 60) {
			song = "Remember Me by Umi";
		} else if ( heartBeat < 70) {
			song = "While We're young by Jhene Aiko";
		} else if (heartBeat < 80) {
			song = "Going Bad by Meek Mill feat Drake";
		} else if (heartBeat < 90) {
			song = "Never Recover by Lil Baby, Gunna, Drake";
		} else if (heartBeat < 100) {
			song = "Dreams and Nightmares by Meek Mill";
		}

		return String.format("Hello, your song is %s!", song);
	}

}
