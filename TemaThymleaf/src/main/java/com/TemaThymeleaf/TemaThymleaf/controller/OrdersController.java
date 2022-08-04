package com.TemaThymeleaf.TemaThymleaf.controller;

import com.TemaThymeleaf.TemaThymleaf.model.Orders;
import com.TemaThymeleaf.TemaThymleaf.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @GetMapping("{id}")
    public Orders getById(@PathVariable Integer id){
        return ordersService.getById(id);
    }

    @PostMapping
    public Orders saveOrders(@RequestBody Orders orders){
        return ordersService.saveOrders(orders);
    }

    @DeleteMapping("{id}")
    public void deleteOrders(@PathVariable Integer id){
        ordersService.deleteById(id);
    }
}
