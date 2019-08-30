package com.intellidigest.example.intellisolved;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.models.User;
import com.intellidigest.example.intellisolved.repository.orders.OrderRepository;
import com.intellidigest.example.intellisolved.repository.products.ProductRepository;
import com.intellidigest.example.intellisolved.repository.stores.StoreRepository;
import com.intellidigest.example.intellisolved.repository.users.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntellisolvedApplicationTests {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	StoreRepository storeRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}


	@Test
	public void getBasicTestsPass(){
		User user1  = new User("Chika", "Kanu", "chika.kanu@yahoo.com", "chikallo", "HydSxpy", "08035457997", "10 Hal rd", "Edinburgh", "EH142ER" );
		userRepository.save(user1);
		Order order1 = new Order("NO254", user1, "complete");
		orderRepository.save(order1);
		Product product1 = new Product("milk", "Fresh cow milk", "m000232", "picture1", 20, 30, user1, order1);
		productRepository.save(product1);
		Store store1 = new Store("Codeclan", "2/3 Queens Street", "EH147BA", "Edinburgh", user1);
		storeRepository.save(store1);
		order1.addProduct(product1);
		user1.addOrder(order1);
		user1.addPreferredProduct(product1);
		user1.addStore(store1);
		assertEquals(user1, order1.getUser());
		assertEquals(user1, product1.getUser());
		assertEquals(user1, store1.getUser());
		assertEquals(1, user1.getOrders().size());
		assertEquals(1, user1.getPreferredProducts().size());
		assertEquals(1, user1.getPreferredStore().size());
		assertEquals(1, order1.getProducts().size());
		assertEquals("m000232", product1.getProductId());
		assertEquals(17, order1.getId(), 2);
		assertEquals("ORD000017", order1.getOrderNumber());
	}

}
