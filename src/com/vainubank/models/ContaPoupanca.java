package com.vainubank.models;

import java.util.Date;
import java.util.HashMap;

public class ContaPoupanca extends Conta {
    private Date aniversario;

    public ContaPoupanca(int numero, int agencia, String titular, String cpf, double saldo, Date aniversario) {
        super(numero, agencia, titular, cpf, saldo);
        this.aniversario = aniversario;
    }

    @Override
    public void sacar(double valorDoSaque) {
        // Saque com juros de 2% sobre o valor sacado
        setSaldo(getSaldo() - valorDoSaque * 1.02);
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

    @Override
    public String toString() {

        return super.toString() + "\nTipo da conta: ContaPoupanca" +
                "\nAniversario de criação da conta: " + aniversario.toString();

    }
}
