package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {

    private double lado;

    
    public Triangulo(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerArea() {
        return 0.433 * lado * lado;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerPerimetro() {
        return 3 * lado;
    }

    // Complejidad: O(1)
    public double getLado() {
        return lado;
    }

    // Complejidad: O(1)
    public void setLado(double lado) {
        this.lado = lado;
     }
}
