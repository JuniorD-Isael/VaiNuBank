package com.vainubank.controllers;

import com.vainubank.exceptions.ContaExceptions;
import com.vainubank.models.Conta;
import com.vainubank.models.ContaCorrente;
import com.vainubank.models.ContaPoupanca;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ContaController {

    public static Conta criarConta() throws ContaExceptions.ContaInvalidaException {
        int agencia = 002;
        int numero = ControllerNumeroConta.gerarNumeroConta();

        Conta conta = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Digite o CPF do titular da conta:");
        String cpf = scanner.next();

        //Coletar o saldo inicial da conta
        double saldo = coletarSaldo();

        System.out.println("Qual o tipo da conta que deseja criar?" + "\n1 - Conta Corrente" + "\n2 - Conta Poupança");
        int tipoConta = scanner.nextInt();

        try {
            switch (tipoConta) {
                case 1:
                    double limiteDeCredito;

                    if (saldo > 0) {
                        limiteDeCredito = saldo * 0.5;
                    } else {
                        limiteDeCredito = 0;
                    }

                    conta = new ContaCorrente(numero, agencia, titular, cpf, saldo, limiteDeCredito);
                    System.out.println("Conta corrente criada com sucesso!");
                    break;
                case 2:
                    // Data da criação da conta poupança
                    Date dataDeCriacao = new Date();
                    conta = new ContaPoupanca(numero, agencia, titular, cpf, saldo, dataDeCriacao);
                    System.out.println("Conta poupança criada com sucesso!");
                    break;
                default:
                    throw new ContaExceptions.ContaInvalidaException("Opção inválida! Você deve escolher entre 1 e 2.");
            }
        } catch (ContaExceptions.ContaInvalidaException e) {
            System.out.println("Ocorreu um erro ao criar a conta: " + e.getMessage());
            throw e; // Re-lança a exceção para ser tratada em um nível superior, se necessário
        }

        return conta;
    }

    public static void excluirConta(HashMap<Integer, Conta> contas) throws ContaExceptions.ContaNaoEncontradaException {
        // Excluir conta por número da conta
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número da conta que deseja excluir:");
            int numero = scanner.nextInt();
            if (contas.containsKey(numero)) {
                contas.remove(numero);
                System.out.println("Conta excluída com sucesso!");
            } else {
                throw new ContaExceptions.ContaNaoEncontradaException("Conta não encontrada!");
            }
        } catch (ContaExceptions.ContaNaoEncontradaException e) {
            System.out.println("Ocorreu um erro ao excluir a conta: " + e.getMessage());
            throw e; // Re-lança a exceção para ser tratada em um nível superior, se necessário
        }
    }

    public static void editarConta() {
    }

    public static void visualizarTodasAsContas(HashMap<Integer, Conta> contas) {
        System.out.println("---------------------------------------------------");
        for (Conta conta : contas.values()) {
            System.out.println(conta.toString());
        }
    }

    // Coletar o valor do saldo inicial da conta
    public static double coletarSaldo() {
        Scanner scanner = new Scanner(System.in);
        double saldo;
        while (true) {
            System.out.println("Digite o saldo inicial da conta:");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                if (saldo < 0) {
                    System.out.println("O saldo inicial da conta não pode ser negativo!");
                } else {
                    return saldo;
                }
            } else {
                System.out.println("Por favor, insira um valor válido.");
                scanner.next(); // Limpar o buffer do Scanner
            }
        }
    }
}
