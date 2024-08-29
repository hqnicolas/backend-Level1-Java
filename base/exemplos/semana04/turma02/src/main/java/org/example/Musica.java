package org.example;

// POJO de Música
public class Musica {
    private String nome;
    private String artista;

    // Construtor
    public Musica(String nome, String artista) {
        System.out.println("Construtor iniciado");
        this.nome = nome;
        this.artista = artista;
    }

    // Getter
    public String getNome() {
        return this.nome;
    }

    public String getArtista() {
        return this.artista;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
