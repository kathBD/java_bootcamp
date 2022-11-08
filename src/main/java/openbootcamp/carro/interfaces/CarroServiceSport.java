package openbootcamp.carro.interfaces;

import openbootcamp.carro.Carro;
import openbootcamp.carro.CarroElectrico;

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
