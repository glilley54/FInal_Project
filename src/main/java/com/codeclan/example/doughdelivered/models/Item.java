package com.codeclan.example.doughdelivered.models;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Long id;

    private String type;
    private String description;
    private Double price;
    private List<Order> orders;

    public Item() {
    }

    public Item(String type, String description, Double price, List<Order> orders) {

        this.type = type;
        this.description = description;
        this.price = price;
        this.orders = new ArrayList<Order>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
