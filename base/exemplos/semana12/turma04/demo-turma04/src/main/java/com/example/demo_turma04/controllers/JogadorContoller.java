package com.example.demo_turma04.controllers;

import com.example.demo_turma04.dtos.ErroDto;
import com.example.demo_turma04.dtos.JogadorRequestDto;
import com.example.demo_turma04.dtos.JogadorResponseDto;
import com.example.demo_turma04.services.JogadorService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
public class JogadorContoller {
    @Autowired
    JogadorService jogadorService;

    @PostMapping("/jogadores")
    @ResponseStatus(HttpStatus.CREATED)
    public JogadorResponseDto inserirJogador(@RequestBody @Valid JogadorRequestDto jogadorDto) {
        return jogadorService.inserirJogador(jogadorDto);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErroDto erroValidacao(HttpServletRequest req, MethodArgumentNotValidException exception) {
        return new ErroDto(
                400,
                exception.getAllErrors().get(0).getDefaultMessage()
        );
    }
}
