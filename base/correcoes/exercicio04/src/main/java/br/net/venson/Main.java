package br.net.venson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicCloud cloud = new MusicCloud();
        cloud.cadastrarMusica("musica1", "artista1");
        cloud.cadastrarMusica("musica2", "artista2");
        cloud.cadastrarMusica("musica3", "artista3");
        cloud.cadastrarMusica("musica4", "artista4");
        cloud.cadastrarMusica("musica5", "artista5");
        cloud.cadastrarMusica("musica6", "artista6");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da Playlist");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.println("Digite o nome da música");
            String nomeMusica = scanner.nextLine();
            if (nomeMusica.isEmpty()) break;
            try {
                Musica musica = cloud.buscarMusica(nomeMusica);
                playlist.adicionarMusica(musica);
            } catch (RuntimeException ex) {
                System.out.println("Erro ao encontrar sua musica");
            }
        }

        playlist.imprimirPlaylist();
    }
}