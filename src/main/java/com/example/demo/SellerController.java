package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/sellers")
    public String sellers(Model model) {
        List<Seller> sellers = sellerRepository.findAll();
        model.addAttribute("sellers", sellers);
        return "sellers";
    }
}
