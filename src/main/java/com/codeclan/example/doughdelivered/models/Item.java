package com.codeclan.example.doughdelivered.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="items")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="types")
    private String type;

    @Column(name = "descriptions")
    private String description;

    @Column(name = "price")
    private Double price;


    @JsonIgnoreProperties(value = "items")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "orders_items",
            joinColumns = {@JoinColumn(name = "item_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="order_id", nullable = false, updatable = false)}
    )
    private List<Order> orders;

    public Item() {
    }

    public Item(String type, String description, Double price) {

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
