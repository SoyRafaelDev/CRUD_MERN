package com.projectBack.javaprojectlogin2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Javaprojectlogin2Application {

	public static void main(String[] args) {
		SpringApplication.run(Javaprojectlogin2Application.class, args);
                System.out.println("Hola mundo");
                
	}
         @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "JAVA") String name) {
      return String.format("Hello %s!", name);
    }
}

