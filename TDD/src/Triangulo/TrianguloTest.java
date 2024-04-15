package Triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Triangulo.Triangulo;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Escaleno", Triangulo.verificarTipoTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Isósceles", Triangulo.verificarTipoTriangulo(3, 3, 4));
    }

    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Equilátero", Triangulo.verificarTipoTriangulo(5, 5, 5));
    }

    @Test
    public void testIsoscelesValidoPermutacao1() {
        assertEquals("Isósceles", Triangulo.verificarTipoTriangulo(3, 4, 3));
    }

    @Test
    public void testIsoscelesValidoPermutacao2() {
        assertEquals("Isósceles", Triangulo.verificarTipoTriangulo(4, 3, 3));
    }

    @Test
    public void testValorZero() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(0, 4, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(-3, 4, 5));
    }

    @Test
    public void testSomaDoisLadosIgualTerceiroLadoPermutacao1() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(1, 2, 3));
    }

    @Test
    public void testSomaDoisLadosIgualTerceiroLadoPermutacao2() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(2, 1, 3));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiroLadoPermutacao1() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(1, 2, 6));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiroLadoPermutacao2() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(2, 1, 6));
    }

    @Test
    public void testTodosValoresZero() {
        assertEquals("Inválido", Triangulo.verificarTipoTriangulo(0, 0, 0));
    }
}
