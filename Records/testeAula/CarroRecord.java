package testeAula;

public record CarroRecord( String marca, String modelo, double preco) {
    public CarroRecord{
        if(marca != null && modelo != null && preco>0){
            vendido();
        }
        
    }

    public CarroRecord(String marca, String modelo, String preco){
        this(marca, modelo, Double.valueOf(preco));
    }

    public void vendido(){
        System.out.println("Obrigado por comprar na Shelby motors");
    }
}
