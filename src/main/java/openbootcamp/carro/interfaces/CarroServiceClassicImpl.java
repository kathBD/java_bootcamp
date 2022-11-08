package openbootcamp.carro.interfaces;

import openbootcamp.carro.Carro;
import openbootcamp.carro.CarroHibrido;

public class CarroServiceClassicImpl implements CarroService {


    @Override
    public Carro CrearCarroDemo() {
        System.out.println("Creando Carro clasico");
        return new CarroHibrido();
    }

    @Override
    public void EliminarCarro(Carro carro) {

        System.out.println("Destruyendo Carro");

    }


}
