package com.codeclan.example.doughdelivered.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


   @Column(name= "dates")
    private String date;

    @JsonIgnoreProperties(value="orders")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    @JsonIgnoreProperties(value = "orders")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "order_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "item_id", nullable = false, updatable = false)}
    )
    private List<Item> items;




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

    public void addItem(Item item) {
        this.items.add(item);
    }
}




