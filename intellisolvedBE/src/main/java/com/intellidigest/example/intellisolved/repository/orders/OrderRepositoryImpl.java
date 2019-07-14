package com.intellidigest.example.intellisolved.repository.orders;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class OrderRepositoryImpl implements OrderRepositoryCustom{
    @Autowired
    EntityManager entityManager;
}
