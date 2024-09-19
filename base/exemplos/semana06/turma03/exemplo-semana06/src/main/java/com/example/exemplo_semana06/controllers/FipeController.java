package com.example.exemplo_semana06.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;

@RestController
@RequestMapping("/fipe")
public class FipeController {
    private RestClient cliente = RestClient.create("https://parallelum.com.br");

    @GetMapping("/valor")
    @ResponseBody
    public HashMap valor(@RequestParam String ano) {
        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/59/modelos/5940/anos/" + ano)
                .retrieve()
                .body(HashMap.class);

        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        respostaPersonalizada.put("nome", "Ramon");
        respostaPersonalizada.put("projeto", "Api da tabela fipe");
        respostaPersonalizada.put("valor", resposta.get("Valor"));

        return respostaPersonalizada;
    }
}
