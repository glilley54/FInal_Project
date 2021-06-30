package com.codeclan.example.doughdelivered.components;

import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.models.Item;
import com.codeclan.example.doughdelivered.models.Order;
import com.codeclan.example.doughdelivered.repositories.CustomerRepository;
import com.codeclan.example.doughdelivered.repositories.ItemRepository;
import com.codeclan.example.doughdelivered.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    public DataLoader() {

    }
    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("John","Brown","johnbrown@gmail.com","1 King Road, London,SW4 5PX");
        customerRepository.save(customer1);

        Order order1 = new Order(customer1,"25/06/2021");
        orderRepository.save(order1);

        Item doughballs = new Item("dough balls","12 first class douballs from Italy",24.99);
        itemRepository.save(doughballs);

    }


    }

