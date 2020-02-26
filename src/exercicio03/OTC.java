package exercicio03;

public class OTC extends Produto {
    private double precoPromocional;

    public OTC(int codigo, String nome, double precoVenda, double desconto, double precoPromocional) {
        super(codigo, nome, precoVenda, desconto);
        this.precoPromocional = precoPromocional;
    }
}
// TODO: implemente o código-fonte de OTC.java
