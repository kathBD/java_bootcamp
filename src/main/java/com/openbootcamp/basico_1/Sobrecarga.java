package com.openbootcamp.basico_1;
/**
 * La sobrecarga permite duplicar un metodo siempre y cuando tengan diferentes  numero/tipo de parametros
 * */

public class Sobrecarga {
    public static void main(String[] args) {


    }
    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2+ num3;
    }

}
