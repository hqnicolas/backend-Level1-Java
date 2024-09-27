package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.println("Digite o nome da playlist:");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.println("\n\nDigite o título da música ou digite 'SAIR' para terminar:");
            String tituloMusica = scanner.nextLine().toUpperCase();

            if ("SAIR".equals(tituloMusica)) {
                break;
            }

            System.out.println("Digite o artista da música:");
            String artistaMusica = scanner.nextLine().toUpperCase();

            boolean musicaExiste = musicCloud.pesquisarMusica(tituloMusica, artistaMusica);

            if (musicaExiste) {
                System.out.println("Parabéns " + tituloMusica + " de " + artistaMusica + " Foi encontrada!");
            } else {
                System.out.println("A música " + tituloMusica + " de " + artistaMusica + " não está disponível.");
            }
        }

        scanner.close();

        System.out.println("\n\nPlaylist:");
        for (Musica musica : playlist.getMusicas()) {
            System.out.println(musica.titulo + " - " + musica.artista);
        }
    }
}
