package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            /*
            String[] posicao = new String[4];
            posicao[0] = "atacante";
            posicao[1] = "meia";
            posicao[2] = "zagueiro";
            posicao[3] = "goleiro";
            */
            String[] vetorPosicoes = { "atacante", "meia", "zagueiro", "goleiro" };

            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o primeiro nome: ");
            String primeiroNome = leitor.nextLine();

            if (primeiroNome.isEmpty()) return;

            System.out.println("Digite o segundo nome: ");
            String segundoNome = leitor.nextLine();

            Random geradorAleatorio = new Random();
            Integer numeroAleatorio = geradorAleatorio.nextInt(10, 100);

            Integer indiceAleatorio = geradorAleatorio.nextInt(vetorPosicoes.length);
            String posicao = vetorPosicoes[indiceAleatorio];

            System.out.println(primeiroNome + segundoNome + numeroAleatorio + posicao);
        }
    }
}