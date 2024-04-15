package Salario;

public class CalculadoraSalario {
    public static double calculaSalario(Funcionario funcionario) {
        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                return calculaDesconto(funcionario, 3000.00, 0.2, 0.1);
            case DBA:
            case TESTADOR:
                return calculaDesconto(funcionario, 2000.00, 0.25, 0.15);
            case GERENTE:
                return calculaDesconto(funcionario, 5000.00, 0.3, 0.2);
            default:
                throw new IllegalArgumentException("Salario.Cargo não suportado");
        }
    }

    private static double calculaDesconto(Funcionario funcionario, double limite, double descontoMaior, double descontoMenor) {
        if (funcionario.getSalarioBase() >= limite) {
            return funcionario.getSalarioBase() * (1 - descontoMaior);
        } else {
            return funcionario.getSalarioBase() * (1 - descontoMenor);
        }
    }
}