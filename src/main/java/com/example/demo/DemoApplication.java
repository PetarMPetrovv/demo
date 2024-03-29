package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public DataSeeder dataSeeder(SellerRepository customerRepository) {
		DataSeeder dataSeeder = new DataSeeder();
		dataSeeder.setSellerRepository(customerRepository);
		return dataSeeder;
	}
}