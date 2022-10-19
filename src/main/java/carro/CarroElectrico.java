package carro;

public class CarroElectrico extends Carro{

    String motorElectrico;

    public CarroElectrico() {
        this.motorElectrico = motorElectrico;
    }

public CarroElectrico(String color, String modelo, Double peso, String motorElectrico) {

        super(color, modelo, peso);
        this.motorElectrico = motorElectrico;
}

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada); //clase superior
    }

    @Override
    public String toString() {
        return "CarroElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}

