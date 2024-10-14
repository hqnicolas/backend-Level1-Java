package com.player.webplayer;

public record JogadorResponseDTO(String nome, String apelido, int habilidade) {

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
