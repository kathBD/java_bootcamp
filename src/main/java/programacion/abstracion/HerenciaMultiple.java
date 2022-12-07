package programacion.abstracion;

public class HerenciaMultiple {
    public static void main(String[] args){

    }
}

class Vehiculo{
    int velocidad;


    public Vehiculo(){
        System.out.println("estoy en Contructor de vehiculo");
    }
}
class Motor{
    String tipoMotor;
    public void Vehiculo(){
        System.out.println("estoy en Contructor de motor");
    }


}
/*class Auto extends Vehiculo, Motor {

}*/