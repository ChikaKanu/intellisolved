package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Order;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Order.class)
public interface OrderProjection {
}
