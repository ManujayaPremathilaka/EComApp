package com.ecom.services;

import com.ecom.models.Customer;
import com.ecom.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepo customerRepo;

    // Add new customer to the DB
    public Customer addNewCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    // Returns a customer by ID
    public Optional<Customer> getCustomerById(Long id){
        return customerRepo.findById(id);
    }

    // Remove a customer fromDB
    public void removeCustomerById(Long id){
        customerRepo.deleteById(id);
    }

    // Returns all the customers
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }
}
