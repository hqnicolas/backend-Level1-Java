package com.example.demo_semana09.services;

import com.example.demo_semana09.dtos.JogadorRequestDto;
import com.example.demo_semana09.dtos.JogadorResponseDto;
import com.example.demo_semana09.mappers.JogadorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JogadorService {
    @Autowired
    JogadorMapper jogadorMapper;

    public JogadorResponseDto insereJogador(JogadorRequestDto jogadorRequestDto) {
        Random random = new Random();
        Integer habilidadeAleatoria = random.nextInt(1, 100);
        /*
        JogadorModel jogadorModel = new JogadorModel();
        jogadorModel.setNome(jogadorRequestDto.nome());
        jogadorModel.setApelido(jogadorRequestDto.apelido());
        jogadorModel.setHabilidade(habilidadeAleatoria);
        return jogadorModel;
         */
        return jogadorMapper.toDto(jogadorRequestDto, habilidadeAleatoria);
    }
}
