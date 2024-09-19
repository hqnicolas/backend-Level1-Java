package br.net.venson;

public class Personagem {
  public String nome;
  public int vida;
  public int ataque;

  // Método que remove a vida do objeto que chamou essa função
  public void receberDano(int dano) {
    this.vida -= dano;
    if (this.vida < 0) this.vida = 0;
  }

  // Método que remove a vida do objeto que foi passado como parâmetro
  public void atacar(Personagem alvo) {
    if (alvo.vida > 0) {
      alvo.receberDano(this.ataque);
      System.out.println(this.nome + " atacou " + alvo.nome + " e causou " + this.ataque + " de dano.");
    }
  }
}
