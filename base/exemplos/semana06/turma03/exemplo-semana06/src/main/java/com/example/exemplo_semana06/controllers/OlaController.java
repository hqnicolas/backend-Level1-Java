package com.example.exemplo_semana06.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mundo")
public class OlaController {
    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá, mundo!";
    }
}
