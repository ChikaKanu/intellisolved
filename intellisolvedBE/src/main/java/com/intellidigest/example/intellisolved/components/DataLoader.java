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


        User user1  = new User("Chika", "Kanu", "chika.kanu@yahoo.com", "chikallo", "HydSxpy", "08035457997", "10 Hal rd", "Edinburgh", "EH142ER" );
        userRepository.save(user1);
        User user2  = new User("Chikamso", "Kanu", "chikallo@yahoo.com", "chikakanu", "hello34533", "08035457996", "11 Hal rd", "Edinburgh", "EH162ER" );
        userRepository.save(user2);
        User user3  = new User("Chikamma", "Kanu", "chika.kanu@outlookcom", "coolMan", "Hcatap0laiydSxpy", "08035457909", "12 Hal rd", "Edinburgh", "EH177ER" );
        userRepository.save(user3);
        User user4  = new User("Chikadibia", "Kanu", "chika.kanu@gmail.com", "Konkoli", "My0miewds", "08098457997", "103Hal rd", "Edinburgh", "EH182ER" );
        userRepository.save(user4);
        User user5  = new User("Chikaatara", "Kanu", "chika.kanu@procompletionscom", "Rasheedy", "Johnsky202", "08038645997", "14 Hal rd", "Edinburgh", "EH192ER" );
        userRepository.save(user5);

        Order order1 = new Order("NO254", user1, "complete");
        orderRepository.save(order1);
        Order order2 = new Order("NO264", user1, "incomplete");
        orderRepository.save(order2);
        Order order3 = new Order("NO2475", user1, "incomplete");
        orderRepository.save(order3);
        Order order4 = new Order("NO282", user1, "complete");
        orderRepository.save(order4);
        Order order5 = new Order("NO293", user1, "complete");
        orderRepository.save(order5);

        Product product1 = new Product("milk", "Fresh cow milk", "m000232", "picture1", 20, 30, user1, order1);
        productRepository.save(product1);
        Product product2 = new Product("butter", "Camman butter", "m000452", "picture2", 3, 20, user2, order3);
        productRepository.save(product2);
        Product product3 = new Product("chocolate", "Dark switzerland best offer", "m000672", "picture3", 6, 60, null, null);
        productRepository.save(product3);
        Product product4 = new Product("pizza", "stone base meat and mushroom pizza", "m000522", "picture4", 14, 5, user2, order4);
        productRepository.save(product4);
        Product product5 = new Product("bread", "buttered soft bread", "m000012", "picture5", 1, 50, user5, order5);
        productRepository.save(product5);

        Store store1 = new Store("Codeclan", "2/3 Queens Street", "EH147BA", "Edinburgh", user1);
        storeRepository.save(store1);
        Store store2 = new Store("Nucleus", "12 Halaw Street", "EH727BA", "Edinburgh", user2);
        storeRepository.save(store2);
        Store store3 = new Store("Tesco", "76 Princess Street", "EH162ER", "Edinburgh", user2);
        storeRepository.save(store3);
        Store store4 = new Store("Sheraton Hotel", "2/3 Queens Street", "EH177ER", "Edinburgh", user3);
        storeRepository.save(store4);
        Store store5 = new Store("KFC", "2/3 Queens Street", "EH237BA", "Edinburgh", null);
        storeRepository.save(store5);
        Store store6 = new Store("Johnny Restaurant", "2/3 Queens Street", "EH627HA", "Edinburgh", null);
        storeRepository.save(store6);

    }



}
