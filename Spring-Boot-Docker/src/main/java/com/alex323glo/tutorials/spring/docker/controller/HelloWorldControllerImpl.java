package com.alex323glo.tutorials.spring.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    @GetMapping("/hello/{name}")
    @Override
    public String getHelloMessage(
            @PathVariable(required = false) String name
    ) {
        return String.format(
                "Hello, %s!",
                Optional.ofNullable(name).orElse("World")
        );
    }

}
