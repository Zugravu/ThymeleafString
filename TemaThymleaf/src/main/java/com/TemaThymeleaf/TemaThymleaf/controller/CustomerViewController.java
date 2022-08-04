package com.TemaThymeleaf.TemaThymleaf.controller;

import com.TemaThymeleaf.TemaThymleaf.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerViewController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.getAllCustomer());
        return "customers";
    }

    @GetMapping("{id}")
    public String getCustomersById(Model model, @PathVariable Integer id){
        model.addAttribute("customers", customerService.getById(id));
        return "customers";
    }

    @GetMapping("/filter")
    public String getCustomersFilter(Model model){
        model.addAttribute("customersFilter", customerService.getAllCustomer());
        return "customersFilter";
    }


}
