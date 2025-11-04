package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args)
            {
                Scanner teclado = new Scanner(System.in);

                System.out.println("--- REGISTRO DE ESTUDIANTE SIMPLE ---");

                System.out.print("Código del alumno: ");
                String codigo = teclado.nextLine();

                System.out.print("Nombre completo: ");
                String nombre = teclado.nextLine();

                System.out.print("Edad (solo número): ");
                int edad = teclado.nextInt();
                teclado.nextLine();

                teclado.close();

                Estudiante miAlumno = new Estudiante(codigo, nombre, edad);

                System.out.println("\n--- DATOS GUARDADOS ---");
                System.out.println("Código: " + miAlumno.getCodigo());
                System.out.println("Nombre: " + miAlumno.getNombre());
                System.out.println("Edad: " + miAlumno.getEdad() + " años");

               }
    }
