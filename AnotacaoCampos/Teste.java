package AnotacaoCampos;

import java.lang.reflect.Field;

public class Teste {
    
    public static void main(String args[]){

        CamposAnotados teste = new CamposAnotados("Campo 1", "Campo 2", "Campo 3");

        for(Field campo : teste.getClass().getDeclaredFields()){
            if(campo.isAnnotationPresent(AnotacaoCampos.class)){
                AnotacaoCampos an = campo.getAnnotation(AnotacaoCampos.class);
                if(an.importancia()==1){
                    try{
                        System.out.println("O campo com o valor '" + campo.get(teste).toString().toUpperCase() + "' está anotado e tem importância 1");
                    } catch (Exception e){
                        System.out.println("Erro");
                    }
                } else {
                    try{
                        System.out.println("O campo com o valor '" + campo.get(teste) + "' está anotado e tem importância 0");
                    } catch (Exception e){
                        System.out.println("Erro");
                    }
                }
                
            } else {
                try{
                    System.out.println("O campo com o valor '" + campo.get(teste) + "' não está anotado");
                } catch (Exception e){
                    System.out.println("Erro");
                }            
            }
        }
    }
}
