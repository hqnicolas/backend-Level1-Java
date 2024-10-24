package com.example.demo_semana09.services;

import com.example.demo_semana09.dtos.JogadorRequestDto;
import com.example.demo_semana09.dtos.JogadorResponseDto;
import com.example.demo_semana09.mappers.JogadorMapper;
import com.example.demo_semana09.models.JogadorModel;
import com.example.demo_semana09.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    @Autowired
    JogadorMapper jogadorMapper;
    @Autowired
    JogadorRepository jogadorRepository;

    public JogadorResponseDto insereJogador(JogadorRequestDto jogadorRequestDto) {
        Random random = new Random();
        Integer habilidadeAleatoria = random.nextInt(1, 100);

        // Salvar o jogador
        JogadorModel jogador = new JogadorModel();
        jogador.setNome(jogadorRequestDto.nome());
        jogador.setApelido(jogadorRequestDto.apelido());
        jogador.setHabilidade(habilidadeAleatoria);
        jogadorRepository.save(jogador);

        return jogadorMapper.toDto(jogador);
    }

    public List<JogadorResponseDto> recuperaJogadores() {
        return jogadorRepository.findAll().stream().map(jogadorMapper::toDto).toList();
    }
}
