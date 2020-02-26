package exercicio02;

public class TecnicoManutencao extends Funcionario {
    private double percentualIns;
    private double bonus;

    public TecnicoManutencao(String nome, double salarioMensal, double percentualIns, double bonus) {
        super(nome, salarioMensal);
        this.percentualIns = percentualIns;
        this.bonus = bonus;
    }

    // TODO: implemente o código desta classe


    @Override
    double retornarSalarioAnual() {
        double totalInsalubridade = (percentualIns * super.retornarSalarioAnual());
        return super.retornarSalarioAnual() + bonus + totalInsalubridade;
    }
}
