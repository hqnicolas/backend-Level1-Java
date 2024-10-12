package com.example.demo_semana09.mappers;

import com.example.demo_semana09.dtos.JogadorRequestDto;
import com.example.demo_semana09.dtos.JogadorResponseDto;

public class JogadorMapper {
    public JogadorResponseDto toDto(JogadorRequestDto jogadorRequestDto, Integer habilidadeAleatoria) {
        return new JogadorResponseDto(
                jogadorRequestDto.apelido(),
                habilidadeAleatoria
        );
    }
}
