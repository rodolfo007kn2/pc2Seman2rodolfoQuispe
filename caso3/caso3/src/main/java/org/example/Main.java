package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- INICIAR CUENTA BANCARIA ---");

        System.out.print("Nombre del titular: ");
        String titular = teclado.nextLine();

        System.out.print("Saldo inicial: S/ ");
        double saldoInicial = teclado.nextDouble();
        teclado.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);
        System.out.printf("Cuenta creada para %s. Saldo: S/ %.2f.\n\n", cuenta.getTitular(), cuenta.getSaldo());

        // Ejemplo de operaciones usando Scanner

        System.out.print("Monto a DEPOSITAR: S/ ");
        double deposito = teclado.nextDouble();
        cuenta.depositar(deposito);
        teclado.nextLine();

        System.out.printf("Saldo actual: S/ %.2f.\n", cuenta.getSaldo());

        System.out.print("\nMonto a RETIRAR: S/ ");
        double retiro = teclado.nextDouble();
        cuenta.retirar(retiro);
        teclado.nextLine();

        System.out.printf("Saldo final: S/ %.2f.\n", cuenta.getSaldo());

        teclado.close();

    }
}