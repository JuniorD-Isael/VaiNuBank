package com.vainubank.controllers;

import com.vainubank.models.Conta;

import java.util.HashMap;

public class DbContasControllers {
    private static HashMap<Integer, Conta> dbContas = new HashMap<>();

    private DbContasControllers() {}

    public static HashMap<Integer, Conta> getDbContas() {
        if (dbContas == null) {
            dbContas = new HashMap<>();
        }
        return dbContas;
    }
}