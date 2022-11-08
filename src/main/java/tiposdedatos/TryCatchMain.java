package tiposdedatos;

import java.util.Scanner;

public class TryCatchMain {
    public static void main(String[] args) {
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }

    }


    /*****
     * Metodo que lee los nombres de consola y verifica q tengan longitud igual o mayor que 8
     * @throw NameFormatException
     */

    private static void leerNombres() throws NameFormatException {

       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        while (teclado.hasNext()){
            String nombre = teclado.nextLine();
            if (nombre.length() < 8){
                teclado.close();
                throw  new NameFormatException("Nombre debe contener minimo 8 caracteres");
            }
        }teclado.close();
    }
}
