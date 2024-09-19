package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMusica emule = new RepositorioMusica();

        emule.adicionarMusica("Fear of the dark", "Iron Maiden");
        emule.adicionarMusica("Numb", "Linkin Park");
        emule.adicionarMusica("Cogumelo Azul", "Ventania");
        emule.adicionarMusica("Voando pro Pará", "Joelma");
        emule.adicionarMusica("Fundo da Grota", "Baitaca");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome da musica: ");
            String termo = scanner.nextLine();
            try {
                Musica musicaPesquisada = emule.buscarMusica(termo);
                System.out.println(musicaPesquisada.getTitulo() + " - " + musicaPesquisada.getArtista());
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}