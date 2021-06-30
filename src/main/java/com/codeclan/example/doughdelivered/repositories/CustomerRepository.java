package com.codeclan.example.doughdelivered.repositories;

import com.codeclan.example.doughdelivered.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
