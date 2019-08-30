package com.intellidigest.example.intellisolved.controller;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.repository.orders.OrderRepository;
import com.intellidigest.example.intellisolved.repository.products.ProductRepository;
import com.intellidigest.example.intellisolved.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @PutMapping(value = "/{id}")
    public void updateAddOrder(@PathVariable long id){
        Order order = orderRepository.getOne(id);
        orderRepository.save(order);
    }


}
