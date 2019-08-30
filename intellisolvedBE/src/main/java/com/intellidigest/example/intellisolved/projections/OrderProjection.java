package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Order.class)
public interface OrderProjection {
   long getId();
   String getOrderNumber();
   String getStatus();
   User getUser();
   Product getProducts();
}
