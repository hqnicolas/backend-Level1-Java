package com.example.demo_semana10.controllers;

import com.example.demo_semana10.model.Jogador;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class DemoController {
    @GetMapping("/mundo")
    public String helloWorld(@RequestParam String nomeEstudante, @RequestParam String sobrenomeEstudante) {
        return "Olá, " + nomeEstudante + " " + sobrenomeEstudante;
    }

    @PostMapping("/jogador")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Jogador processaJogador(@RequestBody Jogador jogador) {
        jogador.setNome("Ronaldinho");
        jogador.setSobrenome("Gaucho");
        return jogador;
    }

    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("projeto", "Gerador de Jogadores de Futebol");
        sobre.put("nome", "Ramon Venson");
        sobre.put("codigo", "439875935");
        return sobre;
    }
}