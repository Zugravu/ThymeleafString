package com.TemaThymeleaf.TemaThymleaf.service;

import com.TemaThymeleaf.TemaThymleaf.model.Orders;
import com.TemaThymeleaf.TemaThymleaf.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final OrdersRepository ordersRepository;

    public List<Orders> getAllOrders(){
        return ordersRepository.findAll();
    }

    public Orders getById(Integer id){
        return ordersRepository.findById(id).get();
    }

    public Orders saveOrders(Orders orders){
        return ordersRepository.save(orders);
    }

    public void deleteById(Integer id){
        ordersRepository.deleteById(id);
    }
}
