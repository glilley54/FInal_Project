package com.codeclan.example.doughdelivered.controller;

import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.models.Order;
import com.codeclan.example.doughdelivered.models.Item;
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
public class OrdersController {


        @Autowired
        CustomerRepository customerRepository;

        @Autowired
        OrderRepository orderRepository;

        @Autowired
        ItemRepository itemRepository;



        //    GET ALL ORDERS
        @GetMapping("/orders")
        public ResponseEntity<List<Customer>> getAllOrders(){

            return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
        }
        //    GET ORDER DETAILS BY ORDER ID
        @GetMapping(value="/{id}")
        public ResponseEntity<Order> getOrder(@PathVariable Long id) {
            return new ResponseEntity<>(orderRepository.findById(id), HttpStatus.OK);
        }

        // CREATE - ADDING AN ORDER TO DATABASE
        @PostMapping("/orders")
        public ResponseEntity<Customer> postCustomer(@RequestBody Order order) {
            orderRepository.save(order);
            return new ResponseEntity<>(order, HttpStatus.CREATED);
        }

//        UPDATE ORDER

        @PutMapping(value ="/orders/{id}")
        public ResponseEntity<Order> putOrder(@RequestBody Order order, @PathVariable Long id){
            Order orderToUpdate = orderRepository.findById(id).get();
            orderToUpdate.setDate(order.getDate());
            orderToUpdate.setCustomer(order.getCustomer();
            orderToUpdate.setItems(order.getItems();
            orderRepository.save(orderToUpdate);
            return new ResponseEntity<>(orderToUpdate, HttpStatus.OK);
        }

//        DELETE ORDER

        @DeleteMapping(value="/{id}")
        public ResponseEntity<Long> deleteOrder(@PathVariable Long id) {
            orderRepository.deleteById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);

        }

        //      GET A PARTICULAR ORDERS ITEMS
        @GetMapping(value = "/orders/{orderId}/items")
        public ResponseEntity<List<Item>> getItemsForOrder(@PathVariable Long orderId) {
            return new ResponseEntity<>(itemRepository.findAllByItemsOrderId(orderId), HttpStatus.OK);
        }


    }

}
