package Salario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSalarioTest {

    @Test
    public void testCalculaSalarioDesenvolvedor() {
        Funcionario desenvolvedor = new Funcionario("João", "joao@example.com", 3500.00, Cargo.DESENVOLVEDOR);
        assertEquals(3150.00, CalculadoraSalario.calculaSalario(desenvolvedor), 0.01);
    }

    @Test
    public void testCalculaSalarioDBA() {
        Funcionario dba = new Funcionario("Maria", "maria@example.com", 2200.00, Cargo.DBA);
        assertEquals(1870.00, CalculadoraSalario.calculaSalario(dba), 0.01);
    }

    @Test
    public void testCalculaSalarioTestador() {
        Funcionario testador = new Funcionario("Pedro", "pedro@example.com", 1500.00, Cargo.TESTADOR);
        assertEquals(1275.00, CalculadoraSalario.calculaSalario(testador), 0.01);
    }

    @Test
    public void testCalculaSalarioGerente() {
        Funcionario gerente = new Funcionario("Ana", "ana@example.com", 6000.00, Cargo.GERENTE);
        assertEquals(4200.00, CalculadoraSalario.calculaSalario(gerente), 0.01);
    }
}
