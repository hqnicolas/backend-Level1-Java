package br.net.venson;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> listaMusicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.listaMusicas = new ArrayList<Musica>();
    }

    public void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }

    public void imprimirPlaylist() {
        System.out.println(listaMusicas);
    }


}
