package com.example.demo.authservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {  

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Admin dashboard";
    }
}
