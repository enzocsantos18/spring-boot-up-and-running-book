package com.springur.demo.controllers;

import com.springur.demo.domain.Coffee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CoffeeController {
    private List<Coffee> coffees = new ArrayList<>();

    public CoffeeController() {
        coffees.addAll(List.of(
                new Coffee("Café Cereza"),
                new Coffee("Café Ganador"),
                new Coffee("Café Lareño"),
                new Coffee("Café Três Pontas")
        ));
    }

    @GetMapping(value = "/coffees")
    Iterable<Coffee> getCoffees() {
        return coffees;
    }

    @GetMapping(value = "/coffees/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        return coffees
                .stream()
                .filter(coffee -> coffee.getId().equals(id))
                .findFirst();
    }

    @PostMapping(value = "/coffees")
    Coffee getCoffeeById(@RequestBody Coffee coffee) {
        coffees.add(coffee);
        return coffee;
    }

}