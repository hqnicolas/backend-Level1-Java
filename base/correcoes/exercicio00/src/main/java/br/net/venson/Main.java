package br.net.venson;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // Solicita ao usuário que insira seu primeiro nome
        System.out.print("Digite seu primeiro nome: ");
        String nome = leitor.nextLine();

        // Solicita ao usuário que insira seu sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        // Instancia um gerador de números aleatórios
        Random random = new Random();

        // Gera um número aleatório entre 1 e 99
        int numeroAleatorio = random.nextInt(1, 100);

        // Concatena o nome do usuário com o número aleatório
        String nomeUsuario = nome + sobrenome + numeroAleatorio;
        
        // Exibe o nome de usuário completo
        System.out.println("Nome de usuário: " + nomeUsuario);
    }
}