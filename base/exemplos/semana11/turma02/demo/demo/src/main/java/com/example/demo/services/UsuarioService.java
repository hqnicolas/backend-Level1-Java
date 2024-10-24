package com.example.demo.services;

import com.example.demo.dtos.UsuarioRequisicaoDto;
import com.example.demo.dtos.UsuarioRespostaDto;
import com.example.demo.models.UsuarioModelo;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public UsuarioRespostaDto insereUsuario(UsuarioRequisicaoDto usuarioRequisicaoDto) {
        // Salva o usuario no banco de dados
        UsuarioRespostaDto usuarioRespostaDto = new UsuarioRespostaDto(
                usuarioRequisicaoDto.nome(),
                usuarioRequisicaoDto.email()
        );
        return usuarioRespostaDto;
    }
}
