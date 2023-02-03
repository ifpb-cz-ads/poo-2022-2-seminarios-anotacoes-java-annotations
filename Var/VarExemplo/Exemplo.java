package VarExemplo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
    
    public void personagem(){
        var nome = "Smigle";
        var classe = "Gollum";
        var hpInicial = 2500;

        System.out.println(nome.getClass());
        System.out.println(classe.getClass());

        var StringouInteger = nome.getClass() == classe.getClass() ? 11 : "Não";
        
        var lista = List.of("Legolas", "Gandalf", "Fuleco");
        // var lista = List.of(11, 12, 13);
        // var array = new ArrayList<String>()
        for(var personagem : lista){
            System.out.println(personagem);
        }
    
        String falaPersonagem = falar();
        

    }

    public String falar(){
        var fala = "Precioso";
        return fala;
    }
}
