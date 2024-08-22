package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 5;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Java";

        Personagem creeper = new Creeper();
        creeper.nome = "Creeper";
        creeper.vida = 5;

        jogador.atacar(inimigo);
        creeper.atacar(jogador);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Java: " + inimigo.vida);
        System.out.println("Creeper: " + creeper.vida);
    }
}