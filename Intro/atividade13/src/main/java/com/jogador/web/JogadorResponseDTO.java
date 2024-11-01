package com.jogador.web;

public record JogadorResponseDTO(Long id, String nome, String apelido, int habilidade) {

    public static JogadorResponseDTO fromJogadorSalvo(Jogador jogadorSalvo) {
        String nome = jogadorSalvo.getNome();
        String apelido = jogadorSalvo.getApelido();
        int habilidade = jogadorSalvo.getHabilidade();
        return new JogadorResponseDTO(jogadorSalvo.getId(), nome, apelido, habilidade);
    }
    
    public String getNome()  {
        return nome;
    }

    public String getApelido()  {
        return apelido;
    }

    public int getHabilidade()  {
        return habilidade;
    }
}
