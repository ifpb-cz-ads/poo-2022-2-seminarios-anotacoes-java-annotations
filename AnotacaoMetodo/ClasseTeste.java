package AnotacaoMetodo;

public class ClasseTeste {

    @Anotacao(vezes = 3)
    public void imprimir(){
        System.out.println("Método anotado");
    }

    public void outroImprimir(){
        System.out.println("Método não anotado");
    }

    @Anotacao
    public void ultimoImprimir(){
        System.out.println("Método anotado com valor padrão");
    }

}
