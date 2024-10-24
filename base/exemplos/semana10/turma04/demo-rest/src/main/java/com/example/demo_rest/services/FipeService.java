package com.example.demo_rest.services;

import com.example.demo_rest.models.Marca;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FipeService {
    private RestClient client = RestClient.create("https://parallelum.com.br/fipe/api/v1/");

    public Object getValorOne() throws IOException, InterruptedException {
        List<Marca> resposta =  client
                .get()
                .uri("carros/marcas/")
                .retrieve()
                .body(List.class);
        return resposta.get(0);
    }

    public Object getValor() throws IOException, InterruptedException {
        JsonNode resposta =  client
                .get()
                .uri("carros/marcas/")
                .retrieve()
                .body(JsonNode.class);
        return resposta.get(0).findPath("nome").asText();
    }
}
