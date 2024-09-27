package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personagem> inimigos = new ArrayList<>();

        System.out.println("Digite o nome do jogador:");
        String nomeJogador = scanner.nextLine();
        System.out.println("Digite a vida do jogador:");
        int vidaJogador = scanner.nextInt();
        System.out.println("Digite o ataque do jogador:");
        int ataqueJogador = scanner.nextInt();
        scanner.nextLine();

        Personagem jogador = new Personagem(nomeJogador, vidaJogador, ataqueJogador);

        while (true) {
            System.out.println("Escolha uma opção:\n1. Adicionar Orc\n2. Adicionar Goblin\n3. Adicionar Lobo\n4. Adicionar Cavaleiro\n5. Adicionar Dragão\n");
            System.out.println("6. Começar batalha");
            System.out.println("7. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();
            limparTela();

            switch (escolha) {
                case 1:
                    inimigos.add(new Personagem("Orc", 100, 10));
                    System.out.println("Orc adicionado.");
                    break;
                case 2:
                    inimigos.add(new Personagem("Goblin", 50, 5));
                    System.out.println("Goblin adicionado.");
                    break;
                case 3:
                    inimigos.add(new Personagem("Lobo", 75, 15));
                    System.out.println("Lobo adicionado.");
                    break;
                case 4:
                    inimigos.add(new Personagem("Cavaleiro", 200, 20));
                    System.out.println("Cavaleiro adicionado.");
                    break;
                case 5:
                    inimigos.add(new Personagem("Dragão", 500, 50));
                    System.out.println("Dragão adicionado.");
                    break;
                case 6:
                    if (inimigos.isEmpty()) {
                        System.out.println("Nenhum inimigo adicionado. Adicione inimigos antes de iniciar a batalha.");
                        break;
                    }
                    iniciarBatalha(jogador, inimigos);
                    return;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static void iniciarBatalha(Personagem jogador, List<Personagem> inimigos) {
        Random random = new Random();

        while (jogador.getVida() > 0 && inimigos.stream().anyMatch(i -> i.getVida() > 0)) {
            Personagem alvo = inimigos.stream()
                    .filter(i -> i.getVida() > 0)
                    .skip(random.nextInt((int) inimigos.stream().filter(i -> i.getVida() > 0).count()))
                    .findFirst()
                    .orElse(null);

            if (alvo != null) {
                jogador.atacar(alvo);
            }

            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador);
                }
            }
        }

        if (jogador.getVida() <= 0) {
            System.out.println("O jogador foi derrotado!");
        } else {
            System.out.println("Todos os inimigos foram derrotados!");
        }
    }
}
