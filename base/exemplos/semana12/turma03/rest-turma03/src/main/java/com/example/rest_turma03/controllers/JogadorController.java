package com.example.rest_turma03.controllers;

import com.example.rest_turma03.dtos.JogadorRequestDto;
import com.example.rest_turma03.dtos.JogadorResponseDto;
import com.example.rest_turma03.services.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JogadorController {
    @Autowired
    JogadorService jogadorService;

    @PostMapping("/jogadores")
    @ResponseBody
    public JogadorResponseDto insereJogador(@RequestBody @Valid JogadorRequestDto jogadorDto) {
        return jogadorService.insereJogador(jogadorDto);
    }

    @GetMapping("/jogadores")
    @ResponseBody
    public List<JogadorResponseDto> listaJogadores() {
        return jogadorService.retornaJogadores();
    }
}
