package com.TemaThymeleaf.TemaThymleaf.controller;

import com.TemaThymeleaf.TemaThymleaf.model.Product;
import com.TemaThymeleaf.TemaThymleaf.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product orders){
        return productService.saveProduct(orders);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.deleteById(id);
    }
}
