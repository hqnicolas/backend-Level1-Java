package com.example.demo.controllers;

import com.example.demo.models.Marca;
import com.example.demo.models.Pessoa;
import com.example.demo.services.SobreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class DemoController {
    private RestClient cliente = RestClient.create("https://parallelum.com.br");

    @Autowired
    SobreService sobreService;

    @GetMapping("/mundo")
    public String ola(@RequestParam String nome, @RequestParam String sobrenome) {
        return "Olá, " + nome + " " + sobrenome;
    }

    @PostMapping("/mundo")
    @ResponseBody
    public Pessoa postOla(@RequestBody Pessoa pessoa) {
        pessoa.setSobrenome("Gaúcho");
        return pessoa;
    }

    @GetMapping("/sobre")
    @ResponseBody
    public Marca sobre() {
        ArrayList<Marca> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas")
                .retrieve()
                .body(ArrayList.class);
        return resposta.get(0);
    }
}
