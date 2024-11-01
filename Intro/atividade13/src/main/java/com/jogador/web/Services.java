package com.jogador.web;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


@Service
public class Services {

    private List<JogadorResponseDTO> jogadores = new ArrayList<>();

    public JogadorResponseDTO criarJogador(JogadorRequestDTO request)  {
        int habilidade = (int)  (Math.random()  * 101);

        var jogador  = new JogadorResponseDTO(1L, request.getNome(), request.getApelido(), habilidade);

        jogadores.add(jogador);

        return jogador;
    }

    public List<JogadorResponseDTO> getJogadores()  {
        return this.jogadores;
    }
}
