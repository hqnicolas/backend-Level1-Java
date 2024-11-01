package com.jogador.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService service;

    @Autowired
    public JogadorController(JogadorService service) {
        this.service = service;
    }

    @PostMapping
    public JogadorResponseDTO criarJogador(@RequestBody JogadorRequestDTO request) {
        return service.criarJogador(request);
    }

    @GetMapping
    public List<JogadorResponseDTO> getJogadores() {
        return service.getJogadores();
    }
}