package com.example.demo.controllers;

import com.example.demo.dtos.UsuarioRequisicaoDto;
import com.example.demo.dtos.UsuarioRespostaDto;
import com.example.demo.models.UsuarioModelo;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UsuarioRespostaDto insereUsuario(@RequestBody UsuarioRequisicaoDto usuario) {
        return usuarioService.insereUsuario(usuario);
    }
}
