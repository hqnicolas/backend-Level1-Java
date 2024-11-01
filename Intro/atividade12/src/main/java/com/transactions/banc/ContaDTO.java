package com.transactions.banc;

public class ContaDTO {
    private String codigo;
    private String cliente;

    public ContaDTO(String codigo, String cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }
}