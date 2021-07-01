package com.codeclan.example.doughdelivered.controller;

import antlr.ASTNULLType;
import com.codeclan.example.doughdelivered.models.Customer;
import com.codeclan.example.doughdelivered.models.Item;
import com.codeclan.example.doughdelivered.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;


    //    GET ALL ITEMS
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }

    // GET ITEM BY ID
    @GetMapping(value = "/items/{id}")
    public ResponseEntity getShip(@PathVariable Long id) {
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);

    }
}