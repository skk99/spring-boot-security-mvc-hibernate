package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Explicit component scanning mentioning all the base packages and subpackages (since we moved Coach.java and
// CricketCoach.java to different base package
//@SpringBootApplication(scanBasePackages = {"com.luv2code.springcoredemo," +
//		"com.luv2code.util"})

// Default component scanning only the base package and subpackages
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
