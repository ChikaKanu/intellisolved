package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = User.class)
public interface UserProjection {
   long getId();
   String getFirstName();
   String getSurname();
   String getEmail();
   String getUsername();
   String getPassword();
   String getPhone();
   String getAddress();
   String getCity();
   String getPostcode();
   List<Product> getPreferredProducts();
   List<Order> getOrder();
   List<Store> getPreferredStore();
}
