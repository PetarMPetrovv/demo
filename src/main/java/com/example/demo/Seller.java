package com.example.demo;


import javax.persistence.Entity;

@Entity
public class Seller extends Customer{

    private String linkToPropertyAd;


    public String getLinkToPropertyAd() {
        return linkToPropertyAd;
    }

    public void setLinkToPropertyAd(String linkToPropertyAd) {
        this.linkToPropertyAd = linkToPropertyAd;
    }
}
