package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            /*
            String[] times = new String[6]; // Cria um vetor com seis posicoes
            times[0] = "criciuma"
            */
            String[] times = { "criciuma", "mibr", "brasil", "vasco", "corinthians", "flamengo" };

            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o primeiro nome: ");
            String primeiroNome = leitor.nextLine();
            if (primeiroNome == "") return;

            System.out.println("Digite o segundo nome: ");
            String segundoNome = leitor.nextLine();

            Random geradorAleatorio = new Random();
            Integer codigoUsuario = geradorAleatorio.nextInt(10, 99);

            int posicaoAleatoria = geradorAleatorio.nextInt(10, 20);
            String timeEscolhido = times[posicaoAleatoria];

            System.out.println(primeiroNome + segundoNome + codigoUsuario + timeEscolhido);
        }
    }
}