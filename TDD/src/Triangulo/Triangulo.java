package Triangulo;

public class Triangulo {

    public static String verificarTipoTriangulo(int lado1, int lado2, int lado3) {
        // Lados Validos
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
            return "Inválido";
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)
            return "Inválido";

        // Tipo triangulo
        if (lado1 == lado2 && lado2 == lado3)
            return "Equilátero";
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "Isósceles";
        else
            return "Escaleno";
    }
}
