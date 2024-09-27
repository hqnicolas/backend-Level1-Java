package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;
    public List<Musica> getMusicas() {
        return musicas;
    }

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }
}
