package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {
    private double ladoAncho; 
    private double ladoLongitud; 

    public Rectangulo(String nombre, String color, double ladoAncho, double ladoLongitud) {
        super(nombre, color); 
        this.ladoAncho = ladoAncho;
        this.ladoLongitud = ladoLongitud;
    }

    // Complejidad: O(1)
    @Override
    public double obtenerArea() {
        return ladoAncho * ladoLongitud; 
    }

    // Complejidad: O(1)
    @Override
    public double obtenerPerimetro() {
        return 2 * (ladoAncho + ladoLongitud);
    }

    // Complejidad: O(1)
    public double getLadoAncho() {
        return ladoAncho;
    }

    // Complejidad: O(1)
    public void setLadoAncho(double ladoAncho) {
        this.ladoAncho = ladoAncho;
    }

    // Complejidad: O(1)
    public double getLadoLongitud() {
        return ladoLongitud;
    }

    // Complejidad: O(1)
    public void setLadoLongitud(double ladoLongitud) {
        this.ladoLongitud = ladoLongitud;

    }
}
