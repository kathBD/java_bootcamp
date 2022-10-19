package carro;

public  class Carro {

    //atributos
    String color;
    String modelo;
    Double peso;
    Integer velocidad =0;



    //contructores

    public Carro(String color, String modelo, Double peso){
        this.color = color;
        this.modelo = modelo;
        this.peso = peso;
    }

    public Carro() {
    }


    //comportamiento

    public  void acelerar(Integer cantidad){
        this.velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocidad en kilometros=" + velocidad +
                '}';
    }
}
