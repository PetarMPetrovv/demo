package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerController {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerController(
            CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @RequestMapping(value="/{customer}", method=RequestMethod.GET)
    public String customers(
            @PathVariable("customer") String customer,
            Model model) {
        List<Customer> customers =
                customerRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

}
