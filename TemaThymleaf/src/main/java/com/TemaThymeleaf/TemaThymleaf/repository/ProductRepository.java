package com.TemaThymeleaf.TemaThymleaf.repository;

import com.TemaThymeleaf.TemaThymleaf.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
