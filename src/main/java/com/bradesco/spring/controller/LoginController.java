package com.bradesco.spring.controller;

import com.bradesco.spring.model.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "API está no ar 🚀";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "Página de login";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return "Parabéns, você está logado!";
    }
}