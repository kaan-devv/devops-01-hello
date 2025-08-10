package com.example.devops01hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


//     http://localhost:8080/
@RestController
@RequestMapping

public class DevOpsController {

    @GetMapping
    public String devopsHello(){
        return "Selam Merhaba: " + LocalDateTime.now();
    }

    @GetMapping("info")
    public String devopsHi(){
        return " DevOps Hi " + LocalDateTime.now();
    }
}
