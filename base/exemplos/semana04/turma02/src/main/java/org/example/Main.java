package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMusical spotify = new RepositorioMusical();

        // Cadastrando as musicas
        spotify.adicionarMusica("Hope", "Foo Fighters");
        spotify.adicionarMusica("Pra sempre", "Hero");
        spotify.adicionarMusica("Bota na pipoquinha", "MC Pipoquinha");

        // Pedindo o nome de uma musica pro usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de uma musica: ");
        String termo = scanner.nextLine();

        // Buscando a musica pesquisada
        try {
            Musica musicaPesquisada = spotify.buscarMusica(termo);
            // Imprime a musica que foi encontrada
            System.out.println(musicaPesquisada.getNome() + " - " + musicaPesquisada.getArtista());
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}