package org.example;

public class Main {
    public static void main(String[] args) {
        Object jogador = new Personagem();
        jogador.nome = "Steve";


        Object inimigo = new Personagem();
        inimigo.nome = "Herobrine";

        Object verdao = new Creeper();
        verdao.morrer();

        jogador.atacar(inimigo);
        verdao.atacar(jogador);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Herobrine: " + inimigo.vida);
        System.out.println("Creeper: " + verdao.vida);
    }
}