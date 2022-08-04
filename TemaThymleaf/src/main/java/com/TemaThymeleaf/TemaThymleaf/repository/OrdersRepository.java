package com.TemaThymeleaf.TemaThymleaf.repository;

import com.TemaThymeleaf.TemaThymleaf.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
