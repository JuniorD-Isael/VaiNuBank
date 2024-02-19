package com.vainubank.services;

public interface ServicoBancario {
    public abstract double sacar(double valorDoSaque);

    public abstract void depositar(double valorDoDeposito);

    public abstract double transferir(double valorDaTransferencia, int agencia, int contaDestino);
}
