package br.net.venson;

public class Main {
    public static void main(String[] args) {
        Postagem postagemTexto =  new Postagem("Olá, Mundo!", "Bem-vindo ao meu blog!", TipoPostagem.TEXTO);
        Postagem postagemVideo =  new Postagem("Gangnam Style", "Music Video", TipoPostagem.VIDEO);
        Postagem postagemImagem =  new Postagem("Selfie do Oscar", "Isso é uma foto de famosos batendo fotos", TipoPostagem.IMAGEM);

        PlataformaSocial myBook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anyTube = new AnyTube();

        try {
            myBook.compartilharPostagem(postagemTexto);
            fotogram.compartilharVideo(postagemVideo);
            anyTube.compartilharImagem(postagemImagem);
        } catch  (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}