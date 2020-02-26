package exercicio02;

public class AuxiliarEscritorio extends Funcionario {
    private double bonus;

    public AuxiliarEscritorio(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
// TODO: implemente o código desta classe

    @Override
    double retornarSalarioAnual() {
        double salarioAnual = super.retornarSalarioAnual() + bonus;

        return salarioAnual;
    }
}
