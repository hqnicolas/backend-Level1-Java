package com.player.webplayer;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@RestController
public class Controller {
    
    @Autowired
    private Services services;

    @PostMapping("/jogador")
    public JogadorResponseDTO criarJogador(@RequestBody JogadorRequestDTO request) {
        return this.services.criarJogador(request);
    }

    @GetMapping("/jogadores")
    public List<JogadorResponseDTO> getJogadores() {
        return this.services.getJogadores();
    }
}
