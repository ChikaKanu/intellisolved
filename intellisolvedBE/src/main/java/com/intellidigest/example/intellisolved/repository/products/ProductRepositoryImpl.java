package com.intellidigest.example.intellisolved.repository.products;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class ProductRepositoryImpl implements ProductRepositoryCustom {
    @Autowired
    EntityManager entityManager;
}
