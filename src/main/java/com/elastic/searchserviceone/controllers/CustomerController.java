package com.elastic.searchserviceone.controllers;

import com.elastic.searchserviceone.models.Customer;
import com.elastic.searchserviceone.repository.CustomerRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {


    private final CustomerRepository repository;


    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save/customer")
    public  int saveCustomer(@RequestBody List<Customer> customers){
        repository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/all")
    public Iterable<Customer> findAllCustomers(){
        return repository.findAll();
    }


    @GetMapping("/name/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String  firstName){
        return repository.findByFirstName(firstName);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return repository.save(customer);
    }


    @GetMapping("/count")
    public long count(){
        return repository.count();
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        repository.deleteById(id);
        return "Customer deleted";
    }

}
