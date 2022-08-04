package com.TemaThymeleaf.TemaThymleaf.repository;

import com.TemaThymeleaf.TemaThymleaf.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
