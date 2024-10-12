package br.net.venson;

public class MyBook implements PlataformaSocial {

  @Override
  public void compartilharPostagem(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no MyBook.");
  }

  @Override
  public void compartilharImagem(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no MyBook.");
  }

  @Override
  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou uma postagem no MyBook.");
  }
}
