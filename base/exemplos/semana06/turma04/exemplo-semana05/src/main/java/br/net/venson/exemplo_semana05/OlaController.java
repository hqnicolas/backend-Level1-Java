package br.net.venson.exemplo_semana05;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/mundo")
public class OlaController {
    @GetMapping("/ola")
    public String olaMundo(
            @RequestParam String aluno, @RequestParam(value = "") String sobrenome) {
        return "Olá, " + aluno + " " + sobrenome + "!";
    }

    @GetMapping("/ola-mundo")
    public String olaMundo() {
        return "Olá, Mundo!";
    }

    @GetMapping("/sobre")
    @ResponseBody
    public Object sobre(){
        HashMap<String, String> dadosProjeto = new HashMap<>();
        dadosProjeto.put("estudante", "Ramon Venson");
        dadosProjeto.put("projeto", "Calculadora de Carros");
        return dadosProjeto;
    }
}
