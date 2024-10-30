package domain;

import domain.Taxa;

public class Contafisica extends Conta {
    private Taxa taxa;

    public Contafisica(String nome, int numero, double saldo) {
        super(nome, numero, saldo);
    }

    @Override
    public double sacar(double valor) {
        return super.sacar(valor + (Taxa.CONTA_FISICA.calcularTaxa(valor)));
    }
}
