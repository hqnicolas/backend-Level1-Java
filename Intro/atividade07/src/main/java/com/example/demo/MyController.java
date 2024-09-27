package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/recomendar")
    public String recommendMovie(@RequestParam("genero") String genre, @RequestParam("ambiente") String environment) {
        if (genre.equals("acao")) {
            return "Homens de Preto";
        } else if (genre.equals("aventura")) {
            return "Jumanji: The Next Level";
        } else if (genre.equals("terror")) {
            return "A Quiet Place 2";
        } else if (genre.equals("comedia") && environment.equals("medieval")) {
            return "Shrek";
        } else if (genre.equals("comedia") && environment.equals("futurista")) {
            return "Vingadores: Ultimato";
        } else {
            return "Não encontrei filmes com esses gêneros e ambientes!";
        }
    }
}
