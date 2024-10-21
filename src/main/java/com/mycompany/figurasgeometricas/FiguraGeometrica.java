
package com.mycompany.figurasgeometricas;


public class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Complejidad: O(1)   
 public double obtenerArea() {
        return 0;
    }

    // Complejidad: O(1)
    public double obtenerPerimetro() {
        return 0;
    }

    // Complejidad: O(1)
    public String getNombre() {
        return nombre;
    }

    // Complejidad: O(1)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Complejidad: O(1)
    public void setColor(String color) {
        this.color = color;
    }
}
