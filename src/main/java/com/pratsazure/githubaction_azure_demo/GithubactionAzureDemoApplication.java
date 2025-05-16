package com.pratsazure.githubaction_azure_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionAzureDemoApplication {

	@GetMapping("/message")
	public String message() {
		return "Congratulations Welcome !";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubactionAzureDemoApplication.class, args);
	}

}
