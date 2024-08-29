package org.example;

import java.util.ArrayList;

public class Mercado {
    String nome;
    ArrayList<Produto> estoque;

    public Mercado(String nome) {
        this.nome = nome;
        this.estoque = new ArrayList<Produto>();
        estoque.add(new Produto("Queijo", 12.90));
        estoque.add(new Produto("Alface", 1.20));
        estoque.add(new Produto("Arroz", 6.00));
        estoque.add(new Produto("Frigideira", 32.90));
    }

    public Produto pesquisarProduto(String nome) {
        for (Produto item : estoque) {
            if (item.getNome() == nome) return item;
        }
        return null;
    }
}
