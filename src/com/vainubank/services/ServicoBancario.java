package com.vainubank.services;

import com.vainubank.models.Conta;

import java.util.HashMap;

public interface ServicoBancario {
    public abstract void sacar(double valorDoSaque);

    public abstract void depositar(double valorDoDeposito);

    public abstract double transferir(HashMap<Integer, Conta> contas, double valorDaTransferencia, int contaDestino);
}
