package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ramon");
        Cartao cartao = new Cartao(1500.0);
        Pix pix = new Pix();
        pix.setSaldo(1500.0);
        Mercado mercado = new Mercado("SuperBudega");
        Carrinho carrinho = new Carrinho(mercado, cliente);

        carrinho.adicionarProduto("Queijo");
        carrinho.adicionarProduto("Alface", 2);
        carrinho.adicionarProduto("Arroz", 5);
        carrinho.adicionarProduto("Sapato");
        carrinho.adicionarProduto("Frigideira");

        carrinho.mostrarCarrinho();
        carrinho.finalizarCompra(cartao);
        carrinho.finalizarCompra(pix);
    }
}