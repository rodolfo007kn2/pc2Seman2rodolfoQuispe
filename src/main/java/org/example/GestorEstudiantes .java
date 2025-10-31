package org.example;

import java.util.ArrayList;

class GestorEstudiantes {
    private ArrayList<Estudiante> lista = new ArrayList<>();

    // Agregar un estudiante
    public void agregar(Estudiante e) {
        lista.add(e);
    }

    // Listar todos los estudiantes
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : lista) {
                System.out.println(e);
            }
        }
    }

    // ?? Sobrecarga: buscar por código
    public Estudiante buscar(int codigo) {
        for (Estudiante e : lista) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }

    // ?? Sobrecarga: buscar por nombre
    public Estudiante buscar(String nombre) {
        for (Estudiante e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}
