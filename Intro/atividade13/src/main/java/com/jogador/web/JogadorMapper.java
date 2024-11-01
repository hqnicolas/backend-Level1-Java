package com.jogador.web;

import com.jogador.web.JogadorDTO;
import com.jogador.web.Jogador;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    public Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(100);
        return jogador;
    }

    public JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}