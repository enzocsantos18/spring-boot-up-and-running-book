package com.springur.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringUpRunningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUpRunningApplication.class, args);
    }

}
