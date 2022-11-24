package programacion.encapsulacion;

public class Privacidad {

    public static void main (String[] args){
        Vehiculo vehiculo = new Vehiculo();
         vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);
        vehiculo.setVelocidadMaxima(80);
        vehiculo.setRapido(true);


         vehiculo.setMotor("Gas natural");
        String motor = vehiculo.getMotor();
        System.out.println(motor);


        Vehiculo moto = new Vehiculo();
        moto.tipo ="motocross";
        moto.setMotor("150cc");
        moto.setVelocidadMaxima(120);
        moto.setRapido(true);

        Vehiculo bicicleta = new Vehiculo();
        bicicleta.tipo="motañera";
        bicicleta.setMotor("electrico");
        bicicleta.setVelocidadMaxima(60);
        bicicleta.setRapido(false);

        System.out.println(moto.getMotor());
        System.out.println(moto.tipo);
        System.out.println(moto.getVelocidadMaxima() + " " + bicicleta.getVelocidadMaxima() );



    }
}

class Vehiculo{
    String tipo; //propiedad publica
    private  String motor;

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    private String sonido;

    private  int velocidadMaxima;
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    private boolean rapido;

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }


    //encapsulacion mediante funciones se obtiene las propiedades privadas
    public void setMotor(String motor){
        this.motor = motor;
    }

    public String getMotor(){
        return this.motor;
    }
}