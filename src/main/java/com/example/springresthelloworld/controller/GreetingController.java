package com.example.springresthelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Salom mazgi. Qalaysiz bormisiz.";
    }

    @GetMapping("/buy")
    public String sayBuy() {
        return "Bo'ldimi. Yaxshi boring.";
    }
}
