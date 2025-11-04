package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Lector de Datos Simples con Scanner ---");

        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad (número entero): ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su sueldo (ej. 1500.50): ");
        double sueldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\n--- Resumen de Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.printf("Sueldo: S/ %.2f\n", sueldo);
    }


    }
