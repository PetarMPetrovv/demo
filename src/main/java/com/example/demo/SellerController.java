package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/add-seller")
    public String showAddSellerForm(Model model) {
        int nextId = sellerRepository.getNextAvailableId();
        model.addAttribute("nextId", nextId);

        // Pre-filling with empty strings for new seller
        model.addAttribute("sellerName", "");
        model.addAttribute("sellerPhoneNumber", "");
        model.addAttribute("sellerLinkToPropertyAd", "");

        return "add-seller";
    }

    @PostMapping("/save-seller")
    public String saveSeller(Seller seller) {
        sellerRepository.save(seller);
        return "redirect:/sellers";
    }
}
