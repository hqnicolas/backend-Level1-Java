package com.example.demo_turma04.services;

import com.example.demo_turma04.dtos.JogadorRequestDto;
import com.example.demo_turma04.dtos.JogadorResponseDto;
import com.example.demo_turma04.mappers.JogadorMapper;
import com.example.demo_turma04.models.Jogador;
import com.example.demo_turma04.repositories.JogadorRepository;
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

    public JogadorResponseDto inserirJogador(JogadorRequestDto jogadorRequestDto) {
        // gerando a habilidade aleatoria
        Integer habilidadeAleatoria = new Random().nextInt(1, 100);
        // gerando o jogador
        Jogador jogador = new Jogador();
        jogador.setNome(jogadorRequestDto.nome());
        jogador.setApelido(jogadorRequestDto.apelido());
        jogador.setPosicao(jogadorRequestDto.posicao());
        jogador.setIdade(jogadorRequestDto.idade());
        jogador.setHabilidade(habilidadeAleatoria);
        // salvar o jogador
        jogadorRepository.save(jogador);
        return jogadorMapper.toDto(jogador);
    }
}
