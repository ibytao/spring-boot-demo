package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 */
@RestController
@RequestMapping("/rest")
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        return "rest get";
    }

    @PostMapping("/user")
    public String saveUser() {
        return "rest post";
    }

    @DeleteMapping("/user")
    public String deleteUser() {
        return "rest delete";
    }

    @PutMapping("/user")
    public String putUser() {
        return "rest put";
    }
}
