package programacion.herenciayPlimorfismo;

public class Herencia_Polimorfismo {

    public static void main(String[] args){

        Coches coche1 = new Coches();
        coche1.velocidadMaxina = 20;
        coche1.matricula ="jht789";
        System.out.println(coche1.compruebaMatricula("jht789"));

        CocheElectric electrico1 = new CocheElectric();
        electrico1.matricula ="jpt710";


    }

}

class Vehiculo{
     int velocidadMaxina;
     String tipoGasolina;
     String matricula;

     public boolean compruebaMatricula(String matricula){
         if(matricula == "XXX"){
             return true;
         }
         return false;
     }

}
//clase hija
class Coches extends Vehiculo{ } //con final no heredan de la misma

//hereda de la hija y el padre
final class CocheElectric extends Coches{}
