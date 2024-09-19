package br.net.venson;

public class Main {
    public static void main(String[] args) {
        // Lista de inimigos
        Personagem[] inimigos = new Personagem[3];
        inimigos[0] = new Personagem();
        inimigos[0].nome = "Orc";
        inimigos[0].vida = 100;
        inimigos[0].ataque = 10;
        inimigos[1] = new Personagem();
        inimigos[1].nome = "Goblin";
        inimigos[1].vida = 50;
        inimigos[1].ataque = 5;
        inimigos[2] = new Personagem();
        inimigos[2].nome = "Lobo";
        inimigos[2].vida = 75;
        inimigos[2].ataque = 15;

        // Cria o jogador
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 100;
        jogador.ataque = 20;

        // Contador de inimigos derrotados
        int inimigosDerrotados = 0;

        // Loop do jogo - cada iteração resolve um turno para o jogador e os inimigos
        while (true) {
            // Turno do jogador
            // Escolhe um inimigo aleatório como alvo para o ataque
            int inimigoAleatorio = (int) (Math.random() * inimigos.length);
            Personagem alvo = inimigos[inimigoAleatorio];
            // Ataca o inimigo
            jogador.atacar(alvo);
            System.out.println("Você atacou o " + alvo.nome + " e causou " + jogador.ataque + " de dano.");
            // Avisa se o inimigo morreu neste ataque
            if (alvo.vida <= 0) {
                inimigosDerrotados++;
                System.out.println("Você derrotou o " + alvo.nome + "!");
                // Verifica se todos os inimigos estão derrotados
                if (inimigosDerrotados >= inimigos.length) {
                    System.out.println("Você venceu!");
                    break;
                }
            }

            // Turno dos inimigos
            for (Personagem inimigo : inimigos) {
                inimigo.atacar(jogador);
            }

            // Verifica se o jogador ainda está vivo
            if (jogador.vida <= 0) {
                System.out.println("Você perdeu!");
                break;
            }
        }
    }
}
