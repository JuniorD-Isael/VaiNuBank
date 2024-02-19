package com.vainubank.controllers;

import com.vainubank.models.ContaCorrente;
import com.vainubank.models.ContaPoupanca;
import com.vainubank.models.Conta;

import java.util.Date;
import java.util.Scanner;

public class ContaController {
    public static void criarConta() {

        int agencia = 002;
        int numero = ControllerNumeroConta.gerarNumeroConta();

        Conta conta = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo da conta que deseja criar?" + "\n1 - Conta Corrente" + "\n2 - Conta Poupança");
        int tipoConta = scanner.nextInt();

        scanner.nextLine(); // Consume a nova linha pendente

        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Digite o CPF do titular da conta:");
        String cpf = scanner.next();

        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        switch (tipoConta) {
            case 1:
                conta = new ContaCorrente(numero, agencia, titular, cpf, saldo);
                break;
            case 2:
                // Data da criação da conta poupança
                Date dataDeCriacao = new Date();
                conta = new ContaPoupanca(numero, agencia, titular, cpf, saldo, dataDeCriacao.toString());
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }


    public static void excluirConta() {
    }

    public static void editarConta() {
    }

    public static void visualizarTodasAsContas() {
    }
}
