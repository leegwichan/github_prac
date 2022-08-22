package com.example.githubDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application";
    }
}
