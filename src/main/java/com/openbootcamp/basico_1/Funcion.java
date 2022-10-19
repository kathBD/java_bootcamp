package com.openbootcamp.basico_1;

public class Funcion {

    public static void main(String[] args) {

        //opcion 1 función sin parametros y sin tipo de retorno:
        showMenu();


        //opcion 2 función sin parametros y con tipo de retorno:
          String menu = getMenu();
          System.out.println("Hola " +  menu);
        System.out.println(getMenu());

       double price = getPrice();
        System.out.println(getPrice());

  //opcion 3: con parametros y sin tipo de retorno

        imprimirSaludoBuenosdias("OpenBootcamp");


        //opcion 4 funcion con parametros y con parametros

        String nombre = "Juan";
        String apellido ="Lope";
        String saludo =    obtenerSaludo(nombre, apellido);
        System.out.println(saludo);



        int resultadoSuma = suma(50,200);
        System.out.println(resultadoSuma);


    }

 static int suma(int num1, int num2) {
    return num1 + num2;
 }

    static void imprimirSaludoBuenosdias(String name) {
        System.out.println("Buenas tardes " + name);
    }


    static double getPrice() {
        return  100.89;

    }
    static String obtenerSaludo(String nombre, String apellido) {
       return "Buenas tardes " + nombre;
    }

    /*void indica que no devuleve nada*/
    static void showMenu(){
        System.out.println("Bienvenidos a E-commerce GT");
        System.out.println("1- Ver Zapatos deportivos GT");
        System.out.println("2- Compar Zapatos deportivos GT");
        System.out.println("3- Salir");

    }

    static String getMenu(){
        return "Bienvenidos a E-commerce GT: \n 1 - ver ropa";
    }
}
