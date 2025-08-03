package com.tnsif.RestApI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class RestApIApplication {
    @GetMapping("/hello/{name}")
	public static void main(String[] args) {
		SpringApplication.run(RestApIApplication.class, args);
    }
}