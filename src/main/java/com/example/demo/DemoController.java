package com.example.demo;

import com.example.demo.dao.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private User user;

    @RequestMapping("/")
    public User home() {
        // User user = new User(); // User.builder().name("nemo").build();
        return user;
    }
}
