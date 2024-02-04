package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class DataSeeder implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists
        if (customerRepository.count() == 0) {
            // Seed initial data
            Buyer buyer1 = new Buyer();
            buyer1.setName("John Buyer");
            buyer1.setPhoneNumber("1234567890");
            // set other properties as needed...

            Seller seller2 = new Seller();
            seller2.setName("Jane Doe");
            seller2.setPhoneNumber("9876543210");
            // set other properties as needed...

            // Save the data to the database
            customerRepository.save(buyer1);
            customerRepository.save(seller2);

            System.out.println("Data seeded successfully!");
        }
    }
}
