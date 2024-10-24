package com.example.demo_semana09.controllers;

import com.example.demo_semana09.dtos.ErroDto;
import com.example.demo_semana09.dtos.JogadorRequestDto;
import com.example.demo_semana09.dtos.JogadorResponseDto;
import com.example.demo_semana09.services.JogadorService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JogadorController {
    @Autowired
    JogadorService jogadorService;

    @PostMapping("/jogadores")
    @ResponseBody
    public JogadorResponseDto insereJogador(@RequestBody @Valid JogadorRequestDto jogadorRequestDto) {
        return jogadorService.insereJogador(jogadorRequestDto);
    }

    @GetMapping("/jogadores")
    @ResponseBody
    public List<JogadorResponseDto> retornaJogadores() {
        return jogadorService.recuperaJogadores();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErroDto erro(HttpServletRequest req, MethodArgumentNotValidException excecao) {
        return new ErroDto(
                HttpStatus.BAD_REQUEST,
                excecao.getAllErrors().get(0).getDefaultMessage()
        );
    }
}
