package com.TemaThymeleaf.TemaThymleaf.controller;

import com.TemaThymeleaf.TemaThymleaf.service.OrdersService;
import com.TemaThymeleaf.TemaThymleaf.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductViewController {
    private final ProductService productService;

    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
}
