package com.codeclan.example.doughdelivered.models;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Item> items;
    private Long id;
    private Customer customer;
    private String date;


    public Order() {
    }

    public Order( Customer customer, String date) {


        this.customer = customer;
        this.date = date;
        this.items = new ArrayList<Item>();
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}




