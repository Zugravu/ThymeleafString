package com.TemaThymeleaf.TemaThymleaf.service;

import com.TemaThymeleaf.TemaThymleaf.model.Customer;
import com.TemaThymeleaf.TemaThymleaf.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public Customer getById(Integer id){
        return customerRepository.findById(id).get();
    }
    public void deleteById(Integer id){
        customerRepository.deleteById(id);
    }

}
