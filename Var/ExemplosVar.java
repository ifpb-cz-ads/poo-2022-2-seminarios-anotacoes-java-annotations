import java.util.List;

public class ExemplosVar {
    /* Classe de exemplos de Var
     * Aqui terão exemplos de onde aplicar e onde não aplicar variáveis do tipo Var
     * Para simular isso, usarei de exemplo um personagem de RPG fictício
     * Toda declaração de VAR precisa ser feita dentro de métodos
     */

     /*ONDE NÃO UTILIZAR O VAR
      * Você precisa inicializar a variável, você não pode usar -> var k; ou var k = null;
      * Você não pode usar como argumento de método ou construtores, pois não há como o Java saber qual vai ser o tipo, assim como não pode ter retorno
      * Ele não pode ser atributo, pois ele pode quebrar na mudança do tipo
      * Não pode utilizar em try e catch
      */

      /*ESPECIFICAÇÕES
       * Objetivo principal -> Reduzir repetições de código, um exemplo é instanciando uma classe
       * var não é uma palavra reservada, é um nome de tipo reservado, somente o tipo é reservado, não pode criar uma classe com nome "var"
       */



     public void caracteristicasPersonagens(){
        var nome = "Cegolas"; // -> Var será do tipo String
        var classe = "Arqueiro";
        var hpInicial = 2500; // -> Var será do tipo Int

        System.out.println("SAÍDA DOS TIPOS DAS VARIÁVEIS\n");
        System.out.println("Nome: " + nome.getClass() + "\nClasse: " + classe.getClass() + "\nHPInicial: " + hpInicial + " -> Java gerClass exibe tipos primitivos (int)!");

        //Os exemplos acima demonstram explicitamente o tipo de variáveis, então o uso de var é interessante!

        var falar = fraseDeEfeito();
        System.out.println("Tipo de retorno em falar: " + falar.getClass() + "\n");
        //Usar o retorno para definir o tipo é válido... mas cuidado, não está explícito o tipo da variável

        var equipePersonagem = List.of("Zé Chicote", "Merlin", "Arthur Morgan");
        //Válido e interessante, pois deixa explícito que é uma lista de Strings!

        System.out.println("EQUIPE DO PERSONAGEM");
        for(var personagem: equipePersonagem){
            System.out.println(personagem);
        } // -> Válido, mas cuidado pois o tipo da lista tratada não está explícito!

     }

     public String fraseDeEfeito(){
        String frase = "They're taking the hobbits to isengard!";
        return frase;
     }

    
}

 //Código feito com base da seguinte videoaula -> https://www.youtube.com/watch?v=Cw7jviakYiw&ab_channel=RinaldoDev
