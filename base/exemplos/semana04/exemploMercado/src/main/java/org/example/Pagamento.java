package org.example;

public interface Pagamento {
    public void pagar(Double quantidade) throws Conflito;
    public String getNome();
}
