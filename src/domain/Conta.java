package domain;

import java.io.*;

public abstract class Conta {
    private String nome;
    private int numero;
    private double saldo;


    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        System.out.println("Conta criada com sucesso!");
    }

    public double getSaldo() {
        return saldo;
    }


    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        if (this.saldo >= valor) {
            return this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return 0;
    }

    public void verificarSaldo() {
        if (!(saldo >= 0)) {
            System.out.println("Saldo atualizado com sucesso!");
            System.out.println("-" + getSaldo());
        }
        System.out.println("Saldo atualizado com sucesso!");
        System.out.println("+" + getSaldo());
    }


    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
