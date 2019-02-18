package com.neosuniversity.demomicroservice;

import com.neosuniversity.demomicroservice.persistence.Customer;
import com.neosuniversity.demomicroservice.persistence.CustomerRespository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class Controller {

    private CustomerRespository repo;
    public Controller(CustomerRespository repo) {
        this.repo = repo;
    }

    @RequestMapping("/customer")
    public List<Customer> getAll() {
         return repo.findAll();
    }
 }
