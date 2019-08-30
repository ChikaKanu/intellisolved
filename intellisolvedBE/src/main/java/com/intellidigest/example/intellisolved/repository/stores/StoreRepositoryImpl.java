package com.intellidigest.example.intellisolved.repository.stores;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class StoreRepositoryImpl{
    @Autowired
    EntityManager entityManager;
}
