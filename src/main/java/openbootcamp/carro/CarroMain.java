package openbootcamp.carro;

public class CarroMain {
    public static void main(String[] args) {

        String carro = "Fiat";
        //instanciado una clase

        Carro carro1 = new Carro("Rojo", "land",500000.00 );

        carro1.acelerar(50);

        System.out.println(carro1);


        CarroElectrico   carroElectrico1 = new CarroElectrico();

        carroElectrico1.motorElectrico = "motor_litio";
           carroElectrico1.modelo = "Tesla";
           carroElectrico1.peso = 300000.00;
           carroElectrico1.color = "azul";
           carroElectrico1.velocidad = 120;
        System.out.println(carroElectrico1);

        CarroElectrico   carroElectrico2 = new CarroElectrico("Negro", "ty",50000.1, "aguab");

        System.out.println(carroElectrico2);

        carroElectrico2.acelerar(50);
        System.out.println(carroElectrico2);
    }
}
