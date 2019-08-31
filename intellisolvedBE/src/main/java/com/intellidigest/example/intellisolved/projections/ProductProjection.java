package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedded", types = Product.class)
public interface ProductProjection {
   long getId();
   String getName();
   String getDescription();
   String getProductId();
   String getImage();
   double getPrice();
   double getQuantity();
   User getUser();
   Order getOrder();
   Store getStore();
}
