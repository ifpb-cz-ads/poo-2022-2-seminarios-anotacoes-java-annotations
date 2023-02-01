public record ProdutoRecord(String nome, String descricao, Double preco) {

    public ProdutoRecord {
        if (preco < 100) {
            throw new IllegalArgumentException();
        }
    }

    public ProdutoRecord(String nome, String descricao, String preco) {
        this(nome, descricao, Double.valueOf(preco));
    }

    public String nomeEPreco() {
        return this.nome + " - " + this.preco;
    }

}
// tudo que foi declarado esta como private e final para impedir as alteracoes
// construtor padrão
// é imutavel
