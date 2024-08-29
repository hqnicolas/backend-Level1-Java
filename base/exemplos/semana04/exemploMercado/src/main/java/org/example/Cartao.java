package org.example;

public class Cartao implements Pagamento{
    private Double saldo;
    private Double limite;

    public Cartao(Double limite) {
        this.saldo = 0.0;
        this.limite = limite;
    }

    @Override
    public void pagar(Double quantidade) throws Conflito {
        Double saldoFinal = this.saldo - quantidade;
        if(saldoFinal < 500.0) {
            throw new Conflito("Erro ao pagar!");
        }
        this.saldo = saldoFinal;
    }

    @Override
    public String getNome() {
        return "Cartão";
    }
}
