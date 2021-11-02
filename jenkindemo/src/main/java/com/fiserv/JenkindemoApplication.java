package com.fiserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkindemoApplication.class, args);
		System.out.println("WElcome to jenkins");
	}

}
