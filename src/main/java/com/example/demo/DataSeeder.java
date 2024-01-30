package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists
        if (customerRepository.count() == 0) {
            // Seed initial data
            Customer customer1 = new Customer();
            customer1.setName("John Doe");
            customer1.setPhoneNumber("1234567890");
            // set other properties as needed...

            Customer customer2 = new Customer();
            customer2.setName("Jane Doe");
            customer2.setPhoneNumber("9876543210");
            // set other properties as needed...

            // Save the data to the database
            customerRepository.save(customer1);
            customerRepository.save(customer2);

            System.out.println("Data seeded successfully!");
        }
    }
}
