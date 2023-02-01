package AnotacaoMetodo;

import java.lang.reflect.Method;

public class Teste {
    public static void main(String args[]){
        ClasseTeste vez = new ClasseTeste();

        for(Method metodo : vez.getClass().getDeclaredMethods()){
            if(metodo.isAnnotationPresent(Anotacao.class)){
                Anotacao an = metodo.getAnnotation(Anotacao.class);
                for(int vezes = 0; vezes < an.vezes(); vezes++){
                    try {
                        metodo.invoke(vez);
                    } catch (Exception e) {
                        System.out.println("Erro");
                    } 
                }
            }
        }
    }
}
