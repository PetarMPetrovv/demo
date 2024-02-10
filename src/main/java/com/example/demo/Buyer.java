package com.example.demo;


import javax.persistence.Entity;

@Entity
public class Buyer extends Customer{
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
