package Salario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSalarioTest {

    @Test
    public void testCalculaSalarioDesenvolvedorLimiteSuperior() {
        Funcionario desenvolvedor = new Funcionario("João", "joao@example.com", 3000.00, Cargo.DESENVOLVEDOR);
        assertEquals(2700.00, CalculadoraSalario.calculaSalario(desenvolvedor), 0.01);
    }

    @Test
    public void testCalculaSalarioDesenvolvedorLimiteInferior() {
        Funcionario desenvolvedor = new Funcionario("Maria", "maria@example.com", 2999.99, Cargo.DESENVOLVEDOR);
        assertEquals(2699.99, CalculadoraSalario.calculaSalario(desenvolvedor), 0.01);
    }

    @Test
    public void testCalculaSalarioDBALimiteSuperior() {
        Funcionario dba = new Funcionario("Pedro", "pedro@example.com", 2000.00, Cargo.DBA);
        assertEquals(1700.00, CalculadoraSalario.calculaSalario(dba), 0.01);
    }

    @Test
    public void testCalculaSalarioDBALimiteInferior() {
        Funcionario dba = new Funcionario("Ana", "ana@example.com", 1999.99, Cargo.DBA);
        assertEquals(1699.99, CalculadoraSalario.calculaSalario(dba), 0.01);
    }

    @Test
    public void testCalculaSalarioTestadorLimiteSuperior() {
        Funcionario testador = new Funcionario("Carlos", "carlos@example.com", 2000.00, Cargo.TESTADOR);
        assertEquals(1700.00, CalculadoraSalario.calculaSalario(testador), 0.01);
    }

    @Test
    public void testCalculaSalarioTestadorLimiteInferior() {
        Funcionario testador = new Funcionario("Paula", "paula@example.com", 1999.99, Cargo.TESTADOR);
        assertEquals(1699.99, CalculadoraSalario.calculaSalario(testador), 0.01);
    }

    @Test
    public void testCalculaSalarioGerenteLimiteSuperior() {
        Funcionario gerente = new Funcionario("Carlos", "carlos@example.com", 5000.00, Cargo.GERENTE);
        assertEquals(3500.00, CalculadoraSalario.calculaSalario(gerente), 0.01);
    }

    @Test
    public void testCalculaSalarioGerenteLimiteInferior() {
        Funcionario gerente = new Funcionario("Paula", "paula@example.com", 4999.99, Cargo.GERENTE);
        assertEquals(3499.99, CalculadoraSalario.calculaSalario(gerente), 0.01);
    }

}
