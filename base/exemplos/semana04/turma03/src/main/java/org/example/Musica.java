package org.example;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String nomeConstrutor, String artistaConstrutor) {
        System.out.println("Construtor Iniciado");
        this.nome = nomeConstrutor;
        this.artista = artistaConstrutor;
    }

    public Musica() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
