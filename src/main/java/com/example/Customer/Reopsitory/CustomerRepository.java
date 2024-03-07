package com.example.Customer.Reopsitory;

import com.example.Customer.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom queries can be added here if needed

    // Example custom query method to find customers by email
    List<Customer> findByEmail(String email);
}

