package com.intellidigest.example.intellisolved.controller;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.User;
import com.intellidigest.example.intellisolved.repository.orders.OrderRepository;
import com.intellidigest.example.intellisolved.repository.products.ProductRepository;
import com.intellidigest.example.intellisolved.repository.stores.StoreRepository;
import com.intellidigest.example.intellisolved.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    OrderRepository orderRepository;

    @PutMapping(path = "/{id}")
    public void updateAddUser(@PathVariable long id){
        User user = userRepository.getOne(id);
        userRepository.save(user);
    }

    @PutMapping(path = "/{id}/order/{order_id}/product/{product_id}")
    public void updateAddUser(@PathVariable long id, @PathVariable long order_id, @PathVariable long product_id){
        User user = userRepository.getOne(id);
        Order order = orderRepository.getOne(order_id);
        Product product = productRepository.getOne(product_id);
        productRepository.save(product);
        orderRepository.save(order);
        userRepository.save(user);
    }

}
