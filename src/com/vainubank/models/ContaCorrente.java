package com.vainubank.models;

public class ContaCorrente extends Conta {
    Double limeteDeCredito;

    public ContaCorrente(int numero, int agenia, String tituar, String cpf, Double saldo) {
        super(numero, agenia, tituar, cpf, saldo);
    }

    @Override
    public double sacar(double valorDoSaque) {
        valorDoSaque = getSaldo() - valorDoSaque;
        return valorDoSaque;
    }

    @Override
    public void depositar(double valorDoDeposito) {
        setSaldo(getSaldo() + valorDoDeposito);
    }

    @Override
    public double transferir(double valorDaTransferencia, int agencia, int contaDestino) {
        return 0;
    }
}
