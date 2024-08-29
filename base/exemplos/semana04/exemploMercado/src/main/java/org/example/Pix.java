package org.example;

public class Pix implements Pagamento {
    private Double saldo;

    @Override
    public void pagar(Double quantidade) throws Conflito {
        Double saldoFinal = this.saldo - quantidade;
        if(saldoFinal < 0.0) {
            throw new Conflito("Erro ao pagar!");
        }
        this.saldo = saldoFinal;
    }

    @Override
    public String getNome() {
        return "Pix";
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
