package com.jwt.example.JWTExample.controllers;

import com.jwt.example.JWTExample.models.User;
import com.jwt.example.JWTExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8082/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting users");
        return this.userService.getUsers();
    }

    //http://localhost:8082/home/current-user
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
