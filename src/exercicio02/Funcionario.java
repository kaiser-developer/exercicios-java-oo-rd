package exercicio02;

public abstract class Funcionario {
    private String nome;
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    // TODO: implemente o código desta classe
    double retornarSalarioAnual() {
        return salarioMensal * 13;
    }
}
