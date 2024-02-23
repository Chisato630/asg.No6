package com.example.hello;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("hello!");
    }

    @PutMapping("/goodbye")
    public HelloResponse goodbye(){
        return new HelloResponse("goodbye!");
    }
}
