package com.vainubank.exceptions;

public class ContaExceptions {
    // Exceção para conta já existente ou com dados invalidos
    public static class ContaInvalidaException extends Exception {
        public ContaInvalidaException(String message) {
            super(message);
        }
    }

    // Exceção para conta não encontrada
    public static class ContaNaoEncontradaException extends Exception {
        public ContaNaoEncontradaException(String message) {
            super(message);
        }
    }
}
