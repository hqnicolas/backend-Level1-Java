package br.net.venson.spring_semana05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    //localhost:8080/ola?nome=ramon&sobrenome=venson
    @GetMapping("/ola")
    public String olaMundo(String nome, String sobrenome) {
        return "Olá, " + nome + " " + sobrenome + "!";
    }
}
