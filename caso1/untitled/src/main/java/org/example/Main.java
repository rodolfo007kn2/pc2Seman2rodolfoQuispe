package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre  ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad  ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su sueldo  ");
        double sueldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\n--- Resumen de Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.printf("Sueldo: S/ %.2f\n", sueldo);
    }


    }
