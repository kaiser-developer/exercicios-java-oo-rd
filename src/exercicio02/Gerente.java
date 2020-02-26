package exercicio02;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioMensal, double bonus) {
        super(nome, salarioMensal);
        this.bonus = bonus;
    }

    // TODO: implemente o código desta classe

    @Override
    double retornarSalarioAnual() {
        return super.retornarSalarioAnual() +  (getSalarioMensal() * this.bonus);
    }
}
