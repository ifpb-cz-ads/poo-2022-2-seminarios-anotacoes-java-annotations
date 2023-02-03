package testeAula;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Palio", 1500.0);
        CarroRecord carro2 = new CarroRecord("Fiat", "Marea 2.4", 0);
        // CarroRecord carro3 = new CarroRecord("Volkswagen", "Paraty", "4500");
        CarroRecord carro3 = new CarroRecord("Volkswagen", "Paraty", "1000");

        carro1.setModelo("Strada");

        System.out.println(carro1.toString());

        System.out.println(carro2.toString());

        System.out.println(carro3.toString());

        System.out.println(carro1.getMarca());

        System.out.println(carro2.marca());

        System.out.println(carro3.modelo());

        carro3.vendido();
    }
}
