package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");//escribir datos
        //introducir datos codifica los datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();

        System.out.println("Nombre  digitado es: "  + nombre);


    }
}
