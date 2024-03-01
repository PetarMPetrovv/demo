package com.example.demo;

import org.springframework.boot.CommandLineRunner;

public class DataSeeder implements CommandLineRunner {
    private SellerRepository sellerRepository;
    public void setSellerRepository(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public void run(String... args) {
        if (sellerRepository.count() == 0) {

            Seller seller = new Seller();
            seller.setName("Jane Doe");
            seller.setPhoneNumber("9876543210");

            sellerRepository.save(seller);

            System.out.println("Data seeded successfully!");
        }
    }
}
