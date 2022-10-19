package com.company;

public class StringMain {
    public static void main(String[] args) {

        //clase string

    /*
    length()
    starsWith(" ")
    endsWith(" ")
    indexOf(" ")
    substring(1,5)
    trim()
    equals(" ")
    compareTo(" ")

     */
        //longitud de la cadena
        String mensaje = "  Hola Mundo  ";

        System.out.println(mensaje.length());
        String mensajeMayusculas = mensaje.toUpperCase();

      //mayusculas
        System.out.println(mensajeMayusculas);
        //elimina espacios
        System.out.println(mensajeMayusculas.trim());
        mensajeMayusculas = mensajeMayusculas.trim();
        //comparar cadenas
        String otro = "HOLA MUNDO";
        if(mensajeMayusculas.equals(otro)){
            System.out.println("verdadero!!!");
        }


    }




}
