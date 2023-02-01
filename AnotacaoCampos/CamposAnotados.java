package AnotacaoCampos;

public class CamposAnotados {

    public String atributo1;

    @AnotacaoCampos
    public String atributo2;

    @AnotacaoCampos(importancia = 1)
    public String atributo3;

    public CamposAnotados(String atributo1, String atributo2, String atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
}
