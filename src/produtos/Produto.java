package produtos;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "        Produto: " + this.getNome() + "     Valor R$" + this.getPreco() + "\n";
    }

    @Override
    public int compareTo(Produto produto) {
        return this.getNome().compareTo(produto.getNome());
    }
}