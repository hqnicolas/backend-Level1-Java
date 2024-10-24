package com.example.demo.controllers;

import com.example.demo.dtos.ErroDto;
import com.example.demo.dtos.UsuarioRequisicaoDto;
import com.example.demo.dtos.UsuarioRespostaDto;
import com.example.demo.services.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UsuarioRespostaDto insereUsuario(@RequestBody @Valid UsuarioRequisicaoDto usuario) {
        return usuarioService.insereUsuario(usuario);
    }

    @GetMapping("/usuarios")
    public List<UsuarioRespostaDto> retornaUsuarios() {
        return usuarioService.retornaUsuarios();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErroDto erroDeValidacao(HttpServletRequest req, MethodArgumentNotValidException exception) {
        return new ErroDto(
                HttpStatus.BAD_REQUEST,
                exception.getAllErrors().get(0).getDefaultMessage()
        );
    }
}
