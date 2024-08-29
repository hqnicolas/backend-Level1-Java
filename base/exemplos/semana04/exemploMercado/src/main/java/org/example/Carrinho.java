package org.example;

import java.util.ArrayList;

public class Carrinho {
    Mercado mercado;
    Cliente cliente;
    ArrayList<Produto> produtos;

    public Carrinho(Mercado mercado, Cliente cliente) {
        this.mercado = mercado;
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(String nomeProduto, Integer quantidade) {
        for (int i = 0; i < quantidade; i++) {
            adicionarProduto(nomeProduto);
        }
    }

    public void adicionarProduto(String nomeProduto) {
        Produto produto = mercado.pesquisarProduto(nomeProduto);
        if (produto != null) {
            produtos.add(produto);
        }
    }

    public void mostrarCarrinho() {
        System.out.println(produtos.toString());
    }

    public Double somaTotalCarrinho() {
        Double soma = 0.0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public void finalizarCompra(Pagamento formaPagamento) {
        System.out.println("Finalizando pagamento com " + formaPagamento.getNome() + "... ");
        Double total = this.somaTotalCarrinho();
        try {
            formaPagamento.pagar(total);
            produtos.clear();
            System.out.println("Compra finalizada com sucesso!");
        } catch (Conflito conflito) {
            System.out.println(conflito.getMessage());
        }
    }
}
