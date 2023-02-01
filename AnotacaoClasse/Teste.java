package AnotacaoClasse;

public class Teste {
    public static void main(String args[]){
        String str = "Texto para imprimir";
        LetrasMaiusculas maiusculas = new LetrasMaiusculas();

        if(maiusculas.getClass().isAnnotationPresent(AnotacaoMaiuscula.class)){
            maiusculas.imprimir(str.toUpperCase());
        } else {
            maiusculas.imprimir(str);
        }
    }
}
