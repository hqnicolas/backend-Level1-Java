package org.example;
import java.util.*;
class Cinema {
    ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    List<Ingresso> ingressosVendidos = new ArrayList<>();

    public void addFilme(String nome, double preco, int idadeMinima) {
        Filme filme = new Filme(nome, preco, idadeMinima);
        this.filmesDisponiveis.add(filme);
    }

    public boolean venderIngresso(Cliente cliente, String assento) throws Exception {
        for (Filme filme : this.filmesDisponiveis) {
            if (assento.startsWith(filme.nome)) {
                int idadeMinima = filme.idadeMinima;

                if (cliente.idade < idadeMinima) {
                    throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
                } else {
                    Ingresso ingresso = new Ingresso(cliente, filme, assento);
                    this.ingressosVendidos.add(ingresso);

                    return true;
                }
            }
        }

        throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
    }
}