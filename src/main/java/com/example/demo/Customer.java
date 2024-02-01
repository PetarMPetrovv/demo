package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String phoneNumber;
    private String linkToPropertyAd;
    @ElementCollection
    private List<String> callNotes;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLinkToPropertyAd() {
        return linkToPropertyAd;
    }

    public void setLinkToPropertyAd(String linkToPropertyAd) {
        this.linkToPropertyAd = linkToPropertyAd;
    }

    public List<String> getCallNotes() {
        return callNotes;
    }

    public void setCallNotes(List<String> callNotes) {
        this.callNotes = callNotes;
    }
}
