package org.example;

import java.util.ArrayList;

public class RepositorioMusica {
    private ArrayList<Musica> listaMusica = new ArrayList<>();

    public void adicionarMusica(String nome, String artista) {
        Musica musica = new Musica(nome, artista);
        listaMusica.add(musica);
    }

    public Musica buscarMusica(String termo) {
        for (Musica item : listaMusica) {
            if(item.getNome().equals(termo)) return item;
        }
        throw new RuntimeException("A música não foi encontrada");
    }
}
