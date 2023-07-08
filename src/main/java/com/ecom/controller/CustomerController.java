package com.ecom.controller;

import com.ecom.models.Customer;
import com.ecom.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ecomapp")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerServices customerServices;

    // Add Customer
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServices.addNewCustomer(customer);
    }

    // Get Customer By Id
    @GetMapping("/getCustomer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerServices.getCustomerById(id);
    }

    // Update Customer
    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerServices.addNewCustomer(customer);
    }

    // Delete Customer By Id
    @DeleteMapping("removeCustomer/{id}")
    public String deleteCustomerById(@PathVariable Long id){
        customerServices.removeCustomerById(id);
        return "deleted";
    }

    // Get All Customers
    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerServices.getAllCustomers();
    }
}
