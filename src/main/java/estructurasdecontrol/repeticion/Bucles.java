package estructurasdecontrol.repeticion;

public class Bucles {
    public static void main(String[] args) {
        //bucle for
        for (int i = 0; i <= 10; i+=2) { //va de 2 en dos por la asignacion de ir sumando 2
            System.out.println(i + " Hola Mundo");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " Hola Mundo2");
        }

        String[] nombres = {"Juan", "Pepe", "Ana", "Ruperta", "Lola", "Luis"};
          for(int i = 0; i< nombres.length; i++) {
              System.out.println(nombres[i]);
        }
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i< numeros.length; i++) {
            System.out.println(numeros[i]);
        }


    }
}
