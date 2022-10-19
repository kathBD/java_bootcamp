package carro.interfaces;

import carro.Carro;

public class InterfaceMain {

    public static void main(String[] args) {

        //polimorfismo sobre interfaces

        CarroService service = new CarroServiceClassicImpl();

        CarroService service2 = new CarroServiceSport();


       Carro carro1  = service.CrearCarroDemo();

        Carro carro2  = service2.CrearCarroDemo();


    }

}
