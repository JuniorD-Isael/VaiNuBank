package com.vainubank.models;

import java.util.Date;

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
        System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valorDoSaque);
        System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
    }

    @Override
    public void depositar(double valorDoDeposito) {
        setSaldo(getSaldo() + valorDoDeposito);
    }

    @Override
    public double transferir(double valorDaTransferencia, int agencia, int contaDestino) {
        return 0;
    }

    @Override
    public String toString() {

        return super.toString() + "\nTipo da conta: ContaPoupanca" +
                "\nAniversario de criação da conta: " + aniversario.toString();

    }
}
