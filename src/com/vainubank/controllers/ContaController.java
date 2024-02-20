package com.vainubank.controllers;


import com.vainubank.models.ContaCorrente;
import com.vainubank.models.ContaPoupanca;
import com.vainubank.models.Conta;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ContaController {
    public static Conta criarConta() {
        int agencia = 002;
        int numero = ControllerNumeroConta.gerarNumeroConta();

        Conta conta = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Digite o CPF do titular da conta:");
        String cpf = scanner.next();

        System.out.println("Digite o saldo inicial da conta:");
        double saldo = coletarSaldo();

        System.out.println("Qual o tipo da conta que deseja criar?" + "\n1 - Conta Corrente" + "\n2 - Conta Poupança");
        int tipoConta = scanner.nextInt();

        try {
            switch (tipoConta) {
                case 1:
                    conta = new ContaCorrente(numero, agencia, titular, cpf, saldo);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    // Data da criação da conta poupança
                    Date dataDeCriacao = new Date();
                    conta = new ContaPoupanca(numero, agencia, titular, cpf, saldo, dataDeCriacao);
                    System.out.println("Conta criada com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida! Você deve escolher entre 1 e 2.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao criar a conta: " + e.getMessage());
        }
        return conta;
    }

    public static void excluirConta() {
    }

    public static void editarConta() {
    }

    public static void visualizarTodasAsContas(HashMap contas) {
        for(Object conta : contas.values()) {
            System.out.println(conta.toString());
        }
    }

    // Coletar o valor do saldo inicial da conta
    public static double coletarSaldo() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            double saldo = scanner.nextDouble();
            if (saldo < 0) {
                System.out.println("O saldo inicial da conta não pode ser negativo!");
            } else {
                return saldo;
            }
        }
    }
}
