package edu.dks.cicd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

	@GetMapping("/")
	public String service(){
		return "This github action application....!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

}
