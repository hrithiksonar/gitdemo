package com.monocept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BillingAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BillingAppApplication.class, args);
	}

}
