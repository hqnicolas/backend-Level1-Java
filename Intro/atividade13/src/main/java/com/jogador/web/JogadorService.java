package com.jogador.web;

import com.jogador.web.JogadorDTO;
import com.jogador.web.JogadorMapper;
import com.jogador.web.Jogador;
import com.jogador.web.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        jogadorRepository.save(jogador);
        return jogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(jogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}
