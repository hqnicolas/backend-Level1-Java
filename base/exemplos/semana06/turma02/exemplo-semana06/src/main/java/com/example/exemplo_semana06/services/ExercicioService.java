package com.example.exemplo_semana06.services;

import org.springframework.stereotype.Service;

@Service
public class ExercicioService {
    public String recomendaFilme(String ambientacao, String genero) {
        if (ambientacao.equalsIgnoreCase("scifi") && genero.equalsIgnoreCase("comedia"))
            return "Homens de Preto";
        if (ambientacao.equalsIgnoreCase("scifi") && genero.equalsIgnoreCase("drama"))
            return "Arrival";
        if (ambientacao.equalsIgnoreCase("medieval") && genero.equalsIgnoreCase("comedia"))
            return "Shrek";
        if (ambientacao.equalsIgnoreCase("medieval") && genero.equalsIgnoreCase("drama"))
            return "Gladiador";
        return "Nenhum filme";
    }
}
