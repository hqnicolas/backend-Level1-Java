package com.transactions.banc;

public class TransacaoRequestDTO {
    private String origem;
    private String destino;
    private Double valor;

    public TransacaoRequestDTO(String origem, String destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }
}