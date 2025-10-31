package org.example;

class Estudiante {
    private int codigo;
    private String nombre;
    private double promedio;

    public Estudiante(int codigo, String nombre, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}