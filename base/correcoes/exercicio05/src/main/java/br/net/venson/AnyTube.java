package br.net.venson;

public class AnyTube implements PlataformaSocial {
  @Override
  public void compartilharPostagem(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no AnyTube.");
  }

  @Override
  public void compartilharImagem(Postagem postagem) {
    throw new UnsupportedOperationException("Esta rede social não suporta o compartilhamento de imagens.");
  }

  @Override
  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no AnyTube.");
  }
}
