package com.transactions.banc;

public class TransacaoResponseDTO {
    private ContaDTO origem;
    private ContaDTO destino;
    private Double valor;

    public TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public ContaDTO getOrigem() {
        return origem;
    }

    public ContaDTO getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }
}