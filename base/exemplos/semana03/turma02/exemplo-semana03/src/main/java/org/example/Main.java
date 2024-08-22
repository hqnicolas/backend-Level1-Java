package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Personagem[] listaInimigos = new Personagem[5];

        listaInimigos[0] = new Personagem();
        listaInimigos[1] = new Personagem();
        listaInimigos[2] = new Personagem();
        listaInimigos[3] = new Personagem();
        listaInimigos[4] = new Personagem();

        listaInimigos[0].nome = "Steve";
         */

        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 10;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Herobrine";

        Creeper verdao = new Creeper();
        verdao.nome = "Creeper";

        jogador.atacar(inimigo);
        verdao.atacar(jogador);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Herobrine: " + inimigo.vida);
        System.out.println("Creeper: " + verdao.vida);
    }
}