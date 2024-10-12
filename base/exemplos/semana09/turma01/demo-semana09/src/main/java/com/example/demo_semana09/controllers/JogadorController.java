package com.example.demo_semana09.controllers;

import com.example.demo_semana09.dtos.JogadorRequestDto;
import com.example.demo_semana09.dtos.JogadorResponseDto;
import com.example.demo_semana09.models.JogadorModel;
import com.example.demo_semana09.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorController {
    @Autowired
    JogadorService jogadorService;

    @PostMapping("/jogador")
    @ResponseBody
    public JogadorResponseDto insereJogador(@RequestBody JogadorRequestDto jogadorRequestDto) {
        return jogadorService.insereJogador(jogadorRequestDto);
    }
}
