package com.exemplo;

public class PortoGrande extends BasePorto {

    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() > 10) {
            barcosAtracados.add(barco);
            System.out.println(barco.getNome() + " atracado no porto grande.");
            return true;
        }
        return false;
    }
}
