package com.example.rest_turma03.mapper;

import com.example.rest_turma03.dtos.JogadorResponseDto;
import com.example.rest_turma03.models.JogadorEntidade;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDto toDto(JogadorEntidade jogador) {
        return new JogadorResponseDto(
                jogador.getApelido(),
                jogador.getHabilidade()
        );
    }
}
