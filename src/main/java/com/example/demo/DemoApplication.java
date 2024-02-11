package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public DataSeeder dataSeeder(CustomerRepository customerRepository) {
		DataSeeder dataSeeder = new DataSeeder();
		dataSeeder.setCustomerRepository(customerRepository);
		return dataSeeder;
	}
}