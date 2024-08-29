package org.example;

import java.util.ArrayList;

public class RepositorioMusica {
    ArrayList<Musica> musicasDisponiveis;

    Musica[] lista = new Musica[10];

    public RepositorioMusica() {
        this.musicasDisponiveis = new ArrayList<Musica>();
    }

    public void adicionarMusica(String nomeMusica, String nomeArtista) {
        Musica musica = new Musica(nomeMusica, nomeArtista);
        musicasDisponiveis.add(musica);
    }

    public Musica buscarMusica(String nome) throws RuntimeException{
        for (Musica item : musicasDisponiveis) {
            if (item.getNome() == nome) return item;
        }
        throw new RuntimeException("A musica não foi encontrada");
    }
}
