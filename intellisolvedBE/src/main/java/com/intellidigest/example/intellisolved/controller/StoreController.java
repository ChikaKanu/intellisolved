package com.intellidigest.example.intellisolved.controller;

import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.repository.stores.StoreRepository;
import com.intellidigest.example.intellisolved.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    UserRepository userRepository;

    @PutMapping(path = "/{id}")
    public void updateAddStore(@PathVariable long id) {
        Store store = storeRepository.getOne(id);
        storeRepository.save(store);
    }
}
