package org.example;

public class Personagem {
    public String nome;
    public Integer vida = 10;

    public void verificaSeEstaVivo() {
        if (vida > 0) {
            System.out.println("Está vivo");
        } else {
            System.out.println("Está morto");
        }
    }

    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " atacou " + alvo.nome);
        alvo.vida -= 5;
        vida += 5;
    }
}
