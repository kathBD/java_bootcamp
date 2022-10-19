package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    private static String[] args;

    public  static void main(String[] args) {
        ListMain.args = args;
//lista dinamica creación
        List<String> nombres = new ArrayList<>();

        //agregar elementos a la lista

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);
//iteracion forech
        for (String nombre : nombres) {
            System.out.println(nombre + " ");

        }


        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Fiat"));
        coches.add(new Coche("Honda"));
        coches.add(new Coche("Ford"));

        System.out.println(coches);

        for (Coche coche : coches) {

            System.out.println(coche);
        }


    }
    }

