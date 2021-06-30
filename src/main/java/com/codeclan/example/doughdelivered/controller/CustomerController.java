package com.codeclan.example.doughdelivered.controller;

import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.repositories.CustomerRepository;
import com.codeclan.example.doughdelivered.repositories.ItemRepository;
import com.codeclan.example.doughdelivered.repositories.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

//    GET ALL CUSTOMERS
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
//    GET CUSTOMER DETAILS BY CUSTOMER ID
    @GetMapping(value="/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }
    // CREATE - ADDING A CUSTOMER TO DATABASE
    @PostMapping("/customers")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

//     UPDATE CUSTOMER

    @PutMapping(value ="/{id}")
    public ResponseEntity<Customer> putCustomer(@RequestBody Customer customer, @PathVariable Long id){
        Customer foundCustomer = customerRepository.findById(id).get();
        foundCustomer.setFirstName(customer.getFirstName());
        foundCustomer.setLastName(customer.getLastName());
        foundCustomer.setEmail(customer.getEmail());
        foundCustomer.setOrders(customer.getOrders());
        foundCustomer.setAddress(customer.getAddress());
        customerRepository.save(foundCustomer);
        return new ResponseEntity<>(foundCustomer, HttpStatus.OK);
        }

//        DELETE CUSTOMER

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);

    }

//      GET A PARTICULAR CUSTOMER ORDERS
    @GetMapping(value = "/customers/{customerId}/orders")
    public ResponseEntity<List<Order>> getOrdersForCustomer(@PathVariable Long customerId) {
            return new ResponseEntity<>(orderRepository.findAllByOrdersCustomerId(customerId), HttpStatus.OK);
    }


    }
