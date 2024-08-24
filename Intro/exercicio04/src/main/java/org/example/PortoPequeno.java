package com.exemplo;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            barcosAtracados.add(barco);
            System.out.println(barco.getNome() + " atracado no porto pequeno.");
            return true;
        }
        return false;
    }
}
