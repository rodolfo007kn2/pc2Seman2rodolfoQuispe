package org.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.printf("Depósito de S/ %.2f realizado.\n", monto);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.printf("Retiro de S/ %.2f realizado.\n", monto);
            } else {
                System.out.printf("ERROR: Saldo insuficiente. Saldo actual: S/ %.2f.\n", saldo);
            }
        } else {
            System.out.println("Error: El monto a retirar debe ser positivo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
