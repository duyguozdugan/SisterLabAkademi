package com.sistersLab.sistersLabcustomer.controller;

import com.sistersLab.sistersLabcustomer.model.Customer;
import com.sistersLab.sistersLabcustomer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;
    public Customer addCustomer(Customer customer) {
     return customerRepository.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            log.info("Customer not found");
            return null;
        }
    }

    public String createCustomerById(Long id, Customer customer) {
        Optional<Customer> customerId = customerRepository.findById(id);
        if(customerId.isPresent()){
            Customer oldCustomer= customerId.get();
            oldCustomer.setFirstName(customer.getFirstName());
            customerRepository.save(oldCustomer);
            return "Success";
        }
     return null;
    }

    public void deleteCustomerId(Long id) {
        customerRepository.deleteById(id);
    }
}
