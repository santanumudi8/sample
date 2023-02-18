package com.hcl.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Changes in remote main branch");
	}

	@GetMapping
	public String greet(){
		return "<h1>Hello World</h1>";
	}

}
