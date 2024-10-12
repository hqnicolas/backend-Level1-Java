package br.net.venson;

public class Fotogram implements PlataformaSocial {
  @Override
  public void compartilharPostagem(Postagem postagem) {
    throw new UnsupportedOperationException("Esta rede social não suporta o compartilhamento de texto.");
  }

  @Override
  public void compartilharImagem(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no Fotogram.");
  }

  @Override
  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no Fotogram.");
  }
}
