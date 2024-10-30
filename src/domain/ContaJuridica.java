package domain;

import domain.domain.Taxa;

public class ContaJuridica extends Conta {

    private Taxa taxa;

    public ContaJuridica(String nome, int numero, double saldo) {
        super(nome, numero, saldo);
    }

    @Override
    public double sacar(double valor) {
        return super.sacar(valor + (Taxa.CONTA_JURIDICA.calcularTaxa(valor)));
    }
}
