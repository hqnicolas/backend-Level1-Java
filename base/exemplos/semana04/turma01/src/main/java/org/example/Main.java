package org.example;

public class Main {
    public static void main(String[] args) {
        RepositorioMusica radio = new RepositorioMusica();
        radio.adicionarMusica(
                "Pintinho Amarelinho",
                "Galinha Pindadinha"
        );
        radio.adicionarMusica(
                "Circles",
                "PostMolone"
        );
        radio.adicionarMusica(
                "Depressão e Tráfico",
                "Brocacito"
        );

        // Pesquisar
        String nomeMusicaPesquisada = "Pintinho Amarelinho";
        try {
            Musica musicaPesquisada = radio.buscarMusica(nomeMusicaPesquisada);
            System.out.println("Nome da Musica: " + musicaPesquisada.getNome());
            System.out.println("Nome do Artista: " + musicaPesquisada.getArtista());
        } catch (RuntimeException conflito) {
            System.out.println("A musica " + nomeMusicaPesquisada + " não foi encontrada");
        }
    }
}