package com.vainubank.exceptions;

public class ContaExceptions {
    // Exceção para conta já existente ou com dados invalidos
    public static class ContaInvalidaException extends Exception {
        public ContaInvalidaException(String message) {
            super(message);
        }
    }
}
