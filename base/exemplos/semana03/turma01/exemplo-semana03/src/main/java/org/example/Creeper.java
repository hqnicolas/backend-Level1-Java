package org.example;

public class Creeper extends Personagem {
    @Override
    public void atacar(Personagem alvo) {
        alvo.vida -= 8;
        this.vida = 0;
    }

    public void morrer() {

    }
}
