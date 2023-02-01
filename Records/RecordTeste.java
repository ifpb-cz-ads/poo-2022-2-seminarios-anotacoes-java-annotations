public class RecordTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook Positivo",
                "Notebook da NASA para pessoa que precisam de muito desempenho", 4000.0);

        System.out.println(produto1.toString());

        ProdutoRecord produto2 = new ProdutoRecord("Carro", "Fiat Marea 2001, 2.4 Turbo", 10111.0);

        System.out.println("\n" + produto2);

        ProdutoRecord produto3 = new ProdutoRecord("Celular", "Alcatel ONETOUCH", "1400");

        System.out.println("\n" + produto3);

    }
}
