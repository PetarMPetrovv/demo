package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {


    List<Seller> findAll();
    @Query(value = "SELECT MAX(id) + 1 FROM Seller", nativeQuery = true)
    Integer getNextAvailableId();

}
