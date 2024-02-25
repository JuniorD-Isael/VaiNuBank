package com.vainubank.services;

public interface ServicoBancario {
    public abstract void sacar(double valorDoSaque);

    public abstract void depositar(double valorDoDeposito);

    public abstract double transferir(double valorDaTransferencia, int agencia, int contaDestino);
}
