package com.vainubank.models;

import java.util.HashMap;

public class ContaCorrente extends Conta {

    private  Double limeteDeCredito;

    public ContaCorrente(int numero, int agenia, String tituar, String cpf, double saldo, double limeteDeCredito) {
        super(numero, agenia, tituar, cpf, saldo);
        this.limeteDeCredito = limeteDeCredito;
    }

    @Override
    public void sacar(double valorDoSaque) {
        setSaldo(getSaldo() - valorDoSaque);
    }

    @Override
    public void depositar(double valorDoDeposito) {
        setSaldo(getSaldo() + valorDoDeposito);
    }

    @Override
    public double transferir(HashMap<Integer, Conta> contas, double valorDaTransferencia, int contaDestino) {
        Conta contaDestinoObj = null;
        if (contas.containsKey(contaDestino)) {
            contaDestinoObj = contas.get(contaDestino);
        } else {
            System.out.println("Conta destino não encontrada!");
            return 0;
        }
        if (this.saldo >= valorDaTransferencia) {
            this.saldo -= valorDaTransferencia;
            contaDestinoObj.saldo += valorDaTransferencia;
            return valorDaTransferencia;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

    public double getLimeteDeCredito() {
        return limeteDeCredito;
    }

    public void setLimeteDeCredito(double limeteDeCredito) {
        this.limeteDeCredito = limeteDeCredito;
    }


    @Override
    public String toString() {
        return super.toString() + "\nTipo da conta: ContaCorrente" +
                "\nLimite de crédito: " + limeteDeCredito.toString();
    }
}
