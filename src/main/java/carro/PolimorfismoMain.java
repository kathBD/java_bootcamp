package carro;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        CarroElectrico carro2 = new CarroElectrico();

        CarroHibrido carro3 = new CarroHibrido();
        
        //polimorfismo
        
        Carro carro4 = new CarroElectrico();
        Carro carro5 = new CarroHibrido();

        if (carro2 instanceof CarroElectrico){
            System.out.println("Carro Electrico");
        }

        if (carro4 instanceof CarroHibrido){
            System.out.println("Carro Hibrido");
        }

    }
}
