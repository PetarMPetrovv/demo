package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE TYPE(c) = 'Seller'")
    List<Customer> findBuyers();

    @Query("SELECT c FROM Customer c WHERE TYPE(c) = 'Buyer'")
    List<Customer> findSellers();


}
