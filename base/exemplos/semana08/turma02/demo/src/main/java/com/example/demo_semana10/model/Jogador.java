package com.example.demo_semana10.model;

import org.springframework.stereotype.Component;

@Component
public class Jogador {
    private String nome;
    private String sobrenome;

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
