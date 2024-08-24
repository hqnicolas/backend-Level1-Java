package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePorto {
    private String nome;
    protected List<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public abstract boolean atracarBarco(Barco barco);

    public boolean desatracarBarco(Barco barco) {
        return barcosAtracados.remove(barco);
    }

    public List<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }
}
