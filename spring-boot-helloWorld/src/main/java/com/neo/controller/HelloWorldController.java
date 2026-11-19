package com.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping(value = "/test/hello", produces = "text/plain;charset=UTF-8")
    public String testHello() {
        return "hello word";
    }
}
