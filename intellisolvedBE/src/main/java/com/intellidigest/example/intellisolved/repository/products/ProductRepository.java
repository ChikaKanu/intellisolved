package com.intellidigest.example.intellisolved.repository.products;

import com.intellidigest.example.intellisolved.models.Product;
import com.intellidigest.example.intellisolved.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryCustom {
}
