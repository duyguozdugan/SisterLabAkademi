package com.sistersLab.sistersLabcustomer.controller;

import com.sistersLab.sistersLabcustomer.model.Customer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

   private final CustomerService customerService;

   @PostMapping("/create")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/get")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable Long id){
       return customerService.getCustomerById(id);
    }

    @PutMapping("/update/{id}")
    public String createCustomerById(@PathVariable Long id , @RequestBody Customer customer){
       return customerService.createCustomerById(id,customer);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        customerService.deleteCustomerId(id);
    }

}
