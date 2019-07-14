package com.intellidigest.example.intellisolved.repository.orders;

import com.intellidigest.example.intellisolved.models.Order;
import com.intellidigest.example.intellisolved.projections.OrderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom{
}
