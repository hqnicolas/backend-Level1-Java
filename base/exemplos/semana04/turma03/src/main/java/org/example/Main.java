package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMusica spotify = new RepositorioMusica();
        spotify.adicionarMusica("O girassol", "Ira");
        spotify.adicionarMusica("Numb", "Linkin Park");
        spotify.adicionarMusica("In the end", "Linkin park");
        spotify.adicionarMusica("Razoes e emoções", "NXzero");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Digite o nome de musica: ");
            String termoPesquisado = scanner.nextLine();

            try {
                Musica musicaPesquisada = spotify.buscarMusica(termoPesquisado);
                System.out.println(musicaPesquisada.getNome() + " - " + musicaPesquisada.getArtista());
            } catch (RuntimeException exception) {
                System.out.println("Erro! " + exception.getMessage());
            }
        }
    }
}