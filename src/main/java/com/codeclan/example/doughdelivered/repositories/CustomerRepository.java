package com.codeclan.example.doughdelivered.repositories;

import com.codeclan.example.doughdelivered.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public List<Customer> findAllByOrdersItemId(Long itemId);
}
