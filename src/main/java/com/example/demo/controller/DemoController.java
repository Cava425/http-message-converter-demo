package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    @GetMapping("/user")
    public User getUser(){
        return User.builder().firstName("liu").lastName("yiyi").build();
    }
}
