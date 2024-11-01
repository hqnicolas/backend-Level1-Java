package com.jogador.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    private final JogadorRepository repository;

    @Autowired
    public JogadorService(JogadorRepository repository) {
        this.repository = repository;
    }

    public JogadorResponseDTO criarJogador(JogadorRequestDTO request) {
        Jogador jogador = new Jogador();
        jogador.setNome(request.nome());
        jogador.setApelido(request.apelido());
        jogador.setHabilidade((int) (Math.random() * 101));
        Jogador jogadorSalvo = repository.save(jogador);
        return new JogadorResponseDTO(jogadorSalvo.getId(), jogadorSalvo.getNome(), jogadorSalvo.getApelido(), jogadorSalvo.getHabilidade());
    }

    public List<JogadorResponseDTO> getJogadores() {
        return repository.findAll().stream()
                .map(jogador -> new JogadorResponseDTO(jogador.getId(), jogador.getNome(), jogador.getApelido(), jogador.getHabilidade()))
                .collect(Collectors.toList());
    }
}