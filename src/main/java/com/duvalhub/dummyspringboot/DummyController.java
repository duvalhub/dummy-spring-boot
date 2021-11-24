package com.duvalhub.dummyspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dummy")
public class DummyController {
    @Value("${dummy.hello:hello}")
    private String message;

    @GetMapping
    public String hello() {
        return String.format("Hello, I'm dummy spring boot! Dummy says %s", message);
    }
}
