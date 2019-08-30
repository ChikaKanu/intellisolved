package com.intellidigest.example.intellisolved.repository.users;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class UserRepositoryImpl implements UserRepositoryCustom {
    @Autowired
    EntityManager entityManager;
}
