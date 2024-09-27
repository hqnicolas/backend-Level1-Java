package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();

        this.musicasDisponiveis.add(new Musica("BOHEMIAN RHAPSODY", "QUEEN"));
        this.musicasDisponiveis.add(new Musica("DONT STOP ME NOW", "QUEEN"));
        this.musicasDisponiveis.add(new Musica("WE WILL ROCK YOU", "QUEEN"));
    }

    public boolean pesquisarMusica(String titulo, String artista) {
        for (Musica musica : musicasDisponiveis) {
            if (musica.titulo.equals(titulo) && musica.artista.equals(artista)) {
                return true;
            }
        }
        return false;
    }
}
