package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedded", types = Product.class)
public interface ProductProjection {
}
