package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String indexPage() {
        return "/index";
    }

    @GetMapping("/auth-enter")
    public String authEnterPage() {
        return "/auth-enter";
    }

    @GetMapping("/free-enter")
    public String freeEnterPage() {
        return "/free-enter";
    }
}
