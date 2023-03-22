package edu.iu.p565.customerservice.controller;
import edu.iu.p565.customerservice.model.Customer;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List <Customer> findAll(){
        return null;
    }
}