package programacion.abstracion;

public class ejemploabstracion {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setSonido("brrrrr");
        System.out.println(coche.getSonido());

        Moto moto = new Moto();
        moto.setSonido("motito");
        System.out.println(moto.getSonido());


    }
}

abstract  class  Vehiculos{
    int velocidadMaxima;
    String marca;
    String sonido;

    public Vehiculos(){
        System.out.println("estoy en el constructor de Vehiculo");
    }
    /*public String getSonido() {
        return sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }*/
 abstract public String getSonido();
 abstract public void setSonido(String sonido);
}
//clases derivadas
class  Coche  extends  Vehiculos{
    public String getSonido(){
        return this.sonido;
    }
    public void setSonido(String sonido){
       this.sonido = sonido;
    }

}
class Moto extends Vehiculos{

    public String getSonido() {
        return  this.sonido;
    }


    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}