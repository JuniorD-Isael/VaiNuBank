package com.vainubank.controllers;

public class ControllerNumeroConta {
    // Gera um número de conta aleatório que no podera se repetir
    public static int gerarNumeroConta() {
        return (int) (Math.random() * 100000);
    }
}


