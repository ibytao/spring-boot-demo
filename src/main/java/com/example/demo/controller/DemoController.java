package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // @Autowired
    // private User user;

    @RequestMapping("/")
    public User home() {
        User user = User.builder().name("buck").build();
        return user;
    }
}
