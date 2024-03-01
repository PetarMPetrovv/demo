package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Seller {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    @ElementCollection
    private List<String> callNotes;
    private String linkToPropertyAd;


}
