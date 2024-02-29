package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataSeeder implements CommandLineRunner {
    @Autowired
    private SellerRepository customerRepository;
    public void setCustomerRepository(SellerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists
        if (customerRepository.count() == 0) {
            // Seed initial data

            Seller seller = new Seller();
            seller.setName("Jane Doe");
            seller.setPhoneNumber("9876543210");
            // set other properties as needed...

            // Save the data to the database
            customerRepository.save(seller);

            System.out.println("Data seeded successfully!");
        }
    }
}
