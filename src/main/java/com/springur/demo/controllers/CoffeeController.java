package com.springur.demo.controllers;

import com.springur.demo.domain.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/coffes/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        return coffees
                .stream()
                .filter(coffee -> coffee.getId().equals(id))
                .findFirst();
    }

}
