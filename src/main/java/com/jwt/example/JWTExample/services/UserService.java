package com.jwt.example.JWTExample.services;

import com.jwt.example.JWTExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();
    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Malav Shah","malav@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Dhruv Panchal","dhruv@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Devansh Trivedi","devansh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sumit Goswami","sumit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Utsav Dawda","utsav@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
