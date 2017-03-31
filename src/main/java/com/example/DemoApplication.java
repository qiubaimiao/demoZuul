package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.filter.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class DemoApplication {

	@RequestMapping(value = "/springBoot")
    public String checkedOut() {
        return "Spring Boot in Action";
    }
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
