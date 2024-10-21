package com.mycompany.figurasgeometricas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // TODO: Tu código va aquí

        // Complejidad: O(1)
        Scanner sc = new Scanner(System.in);

        // Complejidad: O(1)
        System.out.println("Ingrese el nombre de la figura:");

        // Complejidad: O(N) 
        String nombre = sc.nextLine();

        // Complejidad: O(1)
        System.out.println("Ingrese el color de la figura:");

        // Complejidad: O(N) 
        String color = sc.nextLine();

        // Complejidad: O(1)
        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");

        // Complejidad: O(1)
        int tipo = sc.nextInt();

        // Complejidad: O(1)
        FiguraGeometrica figura = null;

        // Complejidad del switch: O(1)
        switch (tipo) {
            case 1:
                // Complejidad: O(1)
                System.out.println("Ingrese el radio del circulo:");

                // Complejidad: O(1)
                double radio = sc.nextDouble();

                // Complejidad: O(1)
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                // Complejidad: O(1)
                System.out.println("Ingrese el ancho del rectangulo:");

                // Complejidad: O(1)
                double ladoAncho = sc.nextDouble();

                // Complejidad: O(1)
                System.out.println("Ingrese la longitud del rectangulo:");

                // Complejidad: O(1)
                double ladoLongitud = sc.nextDouble();

                // Complejidad: O(1)
                figura = new Rectangulo(nombre, color, ladoAncho, ladoLongitud);
                break;
            case 3:
                // Complejidad: O(1)
                System.out.println("Ingrese el lado del triangulo equilatero:");

                // Complejidad: O(1)
                double lado = sc.nextDouble();

                // Complejidad: O(1)
                figura = new Triangulo(nombre, color, lado);
                break;
            default:
                // Complejidad: O(1)
                System.out.println("Opcion invalida");
                return;
        }

        // Complejidad: O(1) 
        System.out.println("Area: " + figura.obtenerArea());

        // Complejidad: O(1)
        System.out.println("Perimetro: " + figura.obtenerPerimetro());
    }
}
