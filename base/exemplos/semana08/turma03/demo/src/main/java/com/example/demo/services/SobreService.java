package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SobreService {
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("nome", "Ramon Venson");
        sobre.put("projeto", "Gerador de jogador");
        return sobre;
    }
}
