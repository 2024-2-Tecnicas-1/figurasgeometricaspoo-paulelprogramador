package com.mycompany.figurasgeometricas;


public class Circulo extends FiguraGeometrica {
    private double radio;

    // Complejidad: O(1)
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerArea() {
        return 3.1415926 * radio * radio;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI* radio;
    }

    // Complejidad: O(1)
    public double getRadio() {
        return radio;
    }

    // Complejidad: O(1)
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
