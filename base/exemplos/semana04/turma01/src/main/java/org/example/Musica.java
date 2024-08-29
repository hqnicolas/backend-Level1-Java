package org.example;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        System.out.println("Construtor iniciado");
        this.nome = nome;
        this.artista = artista;
    }

    public Musica() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
