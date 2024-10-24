package com.example.demo_rest.controllers;

import com.example.demo_rest.services.FipeService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DemoController {
    @Autowired
    FipeService fipeService;

    @GetMapping("/mundo")
    public String olaMundo() {
        return "Ola mundo!";
    }

    @PostMapping("/fipe")
    @ResponseBody
    public Object fipe() throws IOException, InterruptedException {
        return fipeService.getValor();
    }
}
