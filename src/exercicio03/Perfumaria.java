package exercicio03;

public class Perfumaria extends Produto{
    private double precoPromocional;
    private int quantidade;
    private double precoLmpm;

    public Perfumaria(int codigo, String nome, double precoVenda, double desconto, double precoPromocional, int quantidade, double precoLmpm) {
        super(codigo, nome, precoVenda, desconto);
        this.precoPromocional = precoPromocional;
        this.quantidade = quantidade;
        this.precoLmpm = precoLmpm;
    }
}
// TODO: implemente o código-fonte de Perfumaria.java
