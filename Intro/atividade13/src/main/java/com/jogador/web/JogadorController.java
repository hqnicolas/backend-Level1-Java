package com.jogador.web;

import com.jogador.web.JogadorDTO;
import com.jogador.web.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@RequestBody @Validated JogadorDTO jogadorDTO) {
        JogadorDTO jogadorCriado = jogadorService.criarJogador(jogadorDTO);
        return new ResponseEntity<>(jogadorCriado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        return new ResponseEntity<>(jogadores, HttpStatus.OK);
    }
}