package com.example.demo_semana08.controllers;

import com.example.demo_semana08.models.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class DemoController {
    @GetMapping("/mundo")
    public String ola(@RequestParam String nome, @RequestParam String sobrenome) {
        return "Olá, " + nome + " " + sobrenome;
    }

    @PostMapping("/mundo")
    public String mundo(@RequestBody Pessoa pessoa) {
        return "Olá, " + pessoa.getNome() + " " + pessoa.getSobrenome();
    }

    @GetMapping("/copiar")
    @ResponseBody
    public String copiar() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
