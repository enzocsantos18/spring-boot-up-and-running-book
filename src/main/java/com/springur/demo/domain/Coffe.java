package com.springur.demo.domain;

import java.util.UUID;

public class Coffe {
    private final String id;
    private String name;

    public Coffe(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffe(String name) {
        this(UUID.randomUUID().toString(), name);
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
