package com.example.demo_turma04.mappers;

import com.example.demo_turma04.dtos.JogadorResponseDto;
import com.example.demo_turma04.models.Jogador;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDto toDto(Jogador jogador) {
        return new JogadorResponseDto(
                jogador.getApelido(),
                jogador.getHabilidade()
        );
    }
}
