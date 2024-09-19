package br.net.venson;

import java.util.ArrayList;

public class MusicCloud {
    private ArrayList<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<Musica>();
    }

    public void cadastrarMusica(String nome, String artista) {
        Musica musica = new Musica(nome, artista);
        musicasDisponiveis.add(musica);
    }

    public Musica buscarMusica(String nome) {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getNome().equals(nome)) return musica;
        }
        throw new RuntimeException("Impossivel encontrar musica");
    }
}
