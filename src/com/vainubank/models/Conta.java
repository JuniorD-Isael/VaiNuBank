package com.vainubank.models;

import com.vainubank.services.ServicoBancario;

public abstract class Conta implements ServicoBancario {

    private int numero;
    private int agenia;
    private String tituar;
    String cpf;
    double saldo;

    public Conta(int numero, int agenia, String tituar, String cpf, double saldo) {
        this.numero = numero;
        this.agenia = agenia;
        this.tituar = tituar;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgenia() {
        return agenia;
    }

    public String getTituar() {
        return tituar;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + "\nAgenia: " + agenia + "\nTituar: " + tituar + "\nCPF: " + cpf + "\nSaldo: R$" + saldo;
    }

    public String getTitular() {
        return tituar;
    }
}
