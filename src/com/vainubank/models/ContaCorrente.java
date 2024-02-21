package com.vainubank.models;

public class ContaCorrente extends Conta {

    private  Double limeteDeCredito;

    public ContaCorrente(int numero, int agenia, String tituar, String cpf, double saldo, double limeteDeCredito) {
        super(numero, agenia, tituar, cpf, saldo);
        this.limeteDeCredito = limeteDeCredito;
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

    public double getLimeteDeCredito() {
        return limeteDeCredito;
    }

    public void setLimeteDeCredito(double limeteDeCredito) {
        this.limeteDeCredito = limeteDeCredito;
    }

    @Override
    public double transferir(double valorDaTransferencia, int agencia, int contaDestino) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo da conta: ContaCorrente" +
                "\nLimite de crédito: " + limeteDeCredito.toString();
    }
}
