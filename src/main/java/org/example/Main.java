package org.example;

public class Main {
    public static void main(String[] args) {

        GestorEstudiantes gestor = new GestorEstudiantes();

        // Agregamos algunos estudiantes
        gestor.agregar(new Estudiante(1, "Ana", 15.5));
        gestor.agregar(new Estudiante(2, "Luis", 14.2));
        gestor.agregar(new Estudiante(3, "María", 17.8));

        System.out.println("=== LISTA DE ESTUDIANTES ===");
        gestor.listar();

        System.out.println("\n=== BÚSQUEDA POR CÓDIGO (2) ===");
        Estudiante e1 = gestor.buscar(2);
        System.out.println(e1 != null ? e1 : "No encontrado");

        System.out.println("\n=== BÚSQUEDA POR NOMBRE (María) ===");
        Estudiante e2 = gestor.buscar("María");
        System.out.println(e2 != null ? e2 : "No encontrado");

    }
}