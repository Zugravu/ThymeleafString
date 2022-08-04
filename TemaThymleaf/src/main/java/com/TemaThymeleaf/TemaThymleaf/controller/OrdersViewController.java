package com.TemaThymeleaf.TemaThymleaf.controller;


import com.TemaThymeleaf.TemaThymleaf.service.CustomerService;
import com.TemaThymeleaf.TemaThymleaf.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("ordershtml")
public class OrdersViewController {
    private final OrdersService ordersService;

    @GetMapping
    public String getOrders(Model model){
        model.addAttribute("orders", ordersService.getAllOrders());
        return "orders";
    }
}
