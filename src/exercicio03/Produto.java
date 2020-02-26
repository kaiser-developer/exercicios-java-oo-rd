package exercicio03;

public class Produto {
    private int codigo;
    private String nome;
    private double precoVenda;
    private double desconto;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public Produto(int codigo, String nome, double precoVenda, double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.desconto = desconto;
    }
}
// TODO: implemente o código-fonte de Produto.java

