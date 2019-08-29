package com.intellidigest.example.intellisolved.components;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.models.User;
import com.intellidigest.example.intellisolved.repository.orders.OrderRepository;
import com.intellidigest.example.intellisolved.repository.products.ProductRepository;
import com.intellidigest.example.intellisolved.repository.stores.StoreRepository;
import com.intellidigest.example.intellisolved.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){};


    public void run(ApplicationArguments arg){


        User user1  = new User("Chika", "Kanu", "chika.kanu@yahoo.com", "chikallo", "HydSxpy", "08035457997", "10 Hal rd", "Edinnbuirgh", "EH142ER" );
        userRepository.save(user1);

        Order order1 = new Order("NO245", user1, "complete");
        orderRepository.save(order1);

        Product product1 = new Product("milk", "Fresh cow milk", "m000232", "picture", 20, 30, user1, order1);
        productRepository.save(product1);

        Store store1 = new Store();

    }



}
