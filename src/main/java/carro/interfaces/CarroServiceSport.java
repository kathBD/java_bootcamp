package carro.interfaces;

import carro.Carro;
import carro.CarroElectrico;

public class CarroServiceSport implements CarroService{


    @Override
    public Carro CrearCarroDemo() {

        System.out.println("Creando Carro carrera");
        return new CarroElectrico();

    }

    @Override
    public void EliminarCarro(Carro carro) {

    }
}
