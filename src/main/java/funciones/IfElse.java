package funciones;

public class IfElse {

    public static void main(String[] args) {
        //estructuras de control
        boolean check = true;

        boolean mayor = 5<2;

        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        int num4 = 9;

        if (check){
            System.out.println("Verdadero");
        }

        if(num1 < num2){
            System.out.println("verdadero");
        }
        //&& debe incluie ambas

        if(num1 < num2 && num2 >num3){
            System.out.println("verdadero");
        }
    }
}
