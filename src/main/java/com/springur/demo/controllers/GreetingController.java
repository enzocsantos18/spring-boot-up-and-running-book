package com.springur.demo.controllers;

import com.springur.demo.config.GreetingProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private GreetingProperties greetingProperties;

    public GreetingController(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    @GetMapping
    String getGreeting() {
        return "Welcome " + greetingProperties.getName() + " :)";
    }

    @GetMapping("/coffee")
    String getNameAndCoffee() {
        return greetingProperties.getCoffee();
    }
}
