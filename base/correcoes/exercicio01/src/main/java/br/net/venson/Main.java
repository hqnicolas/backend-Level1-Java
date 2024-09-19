package br.net.venson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um vetor com o nome dos quatro filmes (em ordem)
        String[] filmes = {"Homens de Preto", "Arrival", "Shrek", "Gladiador"};

        // Instancia um Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Faz duas perguntas ao usuário
        System.out.println("Que ambientação você prefere?");
        System.out.println("1. Sci-fi");
        System.out.println("2. Medieval");
        int opcaoAmbientacao = scanner.nextInt();

        System.out.println("Que gênero você prefere?");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        int opcaoGenero = scanner.nextInt();

        // Calcula o índice do filme escolhido com base nas opções do usuário
        int indiceFilme = (opcaoAmbientacao - 1) * 2 + (opcaoGenero - 1);
        String filmeEscolhido = filmes[indiceFilme];

        /* Faz o mesmo usando um IF-Else
         * if (opcaoAmbientacao == 1 && opcaoGenero == 1) {
         *     filmeEscolhido = filmes[0];
         * } else if (opcaoAmbientacao == 1 && opcaoGenero == 2) {
         *     filmeEscolhido = filmes[1];
         * } else if (opcaoAmbientacao == 2 && opcaoGenero == 1) {
         *     filmeEscolhido = filmes[2];
         * } else if (opcaoAmbientacao == 2 && opcaoGenero == 2) {
         *     filmeEscolhido = filmes[3];
         * }
         */

        // Exibe o filme escolhido
        System.out.println("Você deve assistir ao filme: " + filmeEscolhido);

    }
}