package com.example.demo.services;

import com.example.demo.dtos.UsuarioRequisicaoDto;
import com.example.demo.dtos.UsuarioRespostaDto;
import com.example.demo.mappers.UsuarioMapper;
import com.example.demo.models.UsuarioModelo;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioMapper usuarioMapper;
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioRespostaDto insereUsuario(UsuarioRequisicaoDto usuarioRequisicaoDto) {
        // UsuarioModelo
        UsuarioModelo usuario = new UsuarioModelo();
        usuario.setNome(usuarioRequisicaoDto.nome());
        usuario.setEmail(usuarioRequisicaoDto.email());
        usuario.setPassword(usuarioRequisicaoDto.senha());
        usuario.setEndereco("Rua do limoeiro");
        // Salva o usuario no banco de dados
        // salvar
        usuarioRepository.save(usuario);
        // Mapear o usuario model para usuario resposta dto
        return usuarioMapper.toDto(usuario);
    }

    public List<UsuarioRespostaDto> retornaUsuarios() {
        return usuarioRepository.findAll().stream().map(usuarioMapper::toDto).toList();
    }
}
