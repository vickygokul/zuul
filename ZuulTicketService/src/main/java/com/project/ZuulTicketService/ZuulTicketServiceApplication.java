package com.project.ZuulTicketService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@SpringBootApplication
public class ZuulTicketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulTicketServiceApplication.class, args);
	}
}
