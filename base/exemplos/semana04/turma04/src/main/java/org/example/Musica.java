package org.example;

public class Musica {
    private String titulo;
    private String artista;

    public Musica() {
        this.titulo = "Sem titulo";
        this.artista = "Sem artista";
    }

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista () {
        return this.artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
