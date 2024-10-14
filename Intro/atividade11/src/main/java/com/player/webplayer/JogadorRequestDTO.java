package com.player.webplayer;

public record JogadorRequestDTO(String nome, String apelido)  {
    public String getNome()  {
        return nome;
     }

    public String getApelido()  {
        return apelido;
     }
}
