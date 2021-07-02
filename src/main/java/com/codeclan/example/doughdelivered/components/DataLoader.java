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

        Customer customer1 = new Customer("John", "Brown", "johnbrown@gmail.com", "1 King Road, London,SW4 5PX");
        customerRepository.save(customer1);

        Customer customer3 = new Customer("Mike", "Bell", "mikebell@gmail.com", "111 Queen Road, London,SW4 5PX");
        customerRepository.save(customer3);

        Customer customer2 = new Customer("Brian", "Jones", "brianjones@gmail.com", "25 King Road, London,SW4 5PX");
        customerRepository.save(customer2);

        Item doughballs = new Item("Dough balls", "finest dough in the world",16.00,"image");
        itemRepository.save(doughballs);

        Item sauce = new Item("Mozzarella cheese", "finest sauce in the world",7.00,"image");
        itemRepository.save(sauce);

        Item cheese = new Item("Mozzarella cheese", "finest cheese in the world",08.00,"image");
        itemRepository.save(cheese);

        Order order1 = new Order(customer1, "25/06/2021");
        order1.addItem(doughballs);
        orderRepository.save(order1);

        Order order2 = new Order(customer2, "20/03/2021");
        orderRepository.save(order2);






    }

    }

