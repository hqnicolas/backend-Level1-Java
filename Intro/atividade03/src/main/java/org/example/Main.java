package com.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos barcos deseja adicionar?");
        int numBarcos = scanner.nextInt();

        limparTela();

        List<Barco> barcos = new ArrayList<>();
        for (int i = 1; i <= numBarcos; i++) {
            System.out.println("Digite o tamanho do Barco " + i + ":");
            int tamanho = scanner.nextInt();
            barcos.add(new Barco("Barco " + i, tamanho));
        }
        limparTela();

        BasePorto portoPequeno = new PortoPequeno("Porto Pequeno");
        BasePorto portoGrande = new PortoGrande("Porto Grande");

        for (Barco barco : barcos) {
            if (!portoPequeno.atracarBarco(barco)) {
                portoGrande.atracarBarco(barco);
            }
        }

        if (!portoPequeno.getBarcosAtracados().isEmpty()) {
            System.out.println("\nBarcos atracados no Porto Pequeno:");
            for (Barco barco : portoPequeno.getBarcosAtracados()) {
                System.out.println(barco.getNome());
            }
        }

        if (!portoGrande.getBarcosAtracados().isEmpty()) {
            System.out.println("\nBarcos atracados no Porto Grande:");
            for (Barco barco : portoGrande.getBarcosAtracados()) {
                System.out.println(barco.getNome());
            }
        }
    }
    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}