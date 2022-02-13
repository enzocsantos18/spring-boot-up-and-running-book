package com.springur.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Value("${greeting-name: Mirage}")
    private String name;

    @Value("${greeting-coffee: ${greeting-name} is drinking Cáfe Ganador}")
    private String coffee;

    @GetMapping
    String getGreeting() {
        return "Welcome " + name + " :)";
    }

    @GetMapping("/coffee")
    String getNameAndCoffee() {
        return coffee;
    }
}
