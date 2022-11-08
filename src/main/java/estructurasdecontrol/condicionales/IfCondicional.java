package estructurasdecontrol.condicionales;

public class IfCondicional {
    public static void main(String[] args) {

        int edad = 17;
        //otra forma es crear una variable boolean esMayor = edad >=18;
        //if(esMayor)
        if (edad >= 18) { //true
            System.out.println("Es mayorde edad");
        } else {//false
            System.out.println("Es menor de edad: ");
        }


    }
}
