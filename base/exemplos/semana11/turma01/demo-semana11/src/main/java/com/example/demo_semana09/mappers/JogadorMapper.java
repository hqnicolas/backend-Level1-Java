package com.example.demo_semana09.mappers;

import com.example.demo_semana09.dtos.JogadorResponseDto;
import com.example.demo_semana09.models.JogadorModel;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDto toDto(JogadorModel jogador) {
        return new JogadorResponseDto(
                jogador.getApelido(),
                jogador.getHabilidade()
        );
    }
}
