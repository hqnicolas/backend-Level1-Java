package com.example.rest_turma03.services;

import com.example.rest_turma03.dtos.JogadorRequestDto;
import com.example.rest_turma03.dtos.JogadorResponseDto;
import com.example.rest_turma03.mapper.JogadorMapper;
import com.example.rest_turma03.models.JogadorEntidade;
import com.example.rest_turma03.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    @Autowired
    JogadorRepository jogadorRepository;
    @Autowired
    JogadorMapper jogadorMapper;

    public JogadorResponseDto insereJogador(JogadorRequestDto jogadorRequestDto) {
        Integer habilidadeAleatoria = new Random().nextInt(0, 100);
        JogadorEntidade jogador = new JogadorEntidade();
        jogador.setNome(jogadorRequestDto.nome());
        jogador.setApelido(jogadorRequestDto.apelido());
        jogador.setIdade(jogadorRequestDto.idade());
        jogador.setHabilidade(habilidadeAleatoria);
        // Salvar o jogador
        jogadorRepository.save(jogador);
        // Criar o dto de resposta
        return jogadorMapper.toDto(jogador);
    }

    public List<JogadorResponseDto> retornaJogadores() {
        return jogadorRepository.findAll().stream().map(jogadorMapper::toDto).toList();
    }
}
