package programacion.sentenciascontrol;

public class Condicionales {
    public static void main(String[] args) {
        //condicionales comparam
        //condiciones logicas "Y" && amabas deben cimplir  "O" || por lo menos una de la condicion debe cumplirse

        //condiconales comparativos
        //>, <, >=, and <=, == doble igual, != distinto pudiendo tener solo dos resultados true or false
        //primero los parentesis
        // si "if" sentencia imperativa

        String estacion = "primavera";

        if(estacion == "primavera") {
            System.out.println("Es primavera");

        } else if (estacion == "verano") {
            System.out.println("es verano");

        }else{
            System.out.println("es otra estación");
        }

    }

}
