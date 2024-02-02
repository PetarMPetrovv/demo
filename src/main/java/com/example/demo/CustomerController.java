package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    //I'm not sure if this need to be here ..
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/sellers")
    public String sellers(Model model) {
        List<Customer> sellers = customerRepository.findSellers(); // Replace with your logic to get sellers
        model.addAttribute("sellers", sellers);
        return "sellers";
    }

    @GetMapping("/buyers")
    public String buyers(Model model) {
        List<Customer> buyers = customerRepository.findBuyers(); // Replace with your logic to get buyers
        model.addAttribute("buyers", buyers);
        return "buyers";
    }
}
