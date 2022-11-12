package programacion.errores;

public class Errores {
    /*
    * Gestión de errores:
	1- Nombre lógico de las variables
	2- Comentarios necesarios
	3- Comentarios sobre entendidos

Errores de programador:
	1. No mantener coherencia en el estilo de codigo, coxistencia
	guia de estilos en las empresas, legibilidad del codigo.
    2. tener un control de versiones(gitlab) gitideaa
    3. no usar formas complicadas si puede hacerse mas simple ej recorrer un array con la forma
Simplificada del for.
	4. Depurador no usar el print (consola)
	5. Crear funciones grandes

	Repercusion de los errores:

	Conversion de tipos:
	1-Castear, int entre un doble se pierde la presicion 9,9 int 9 pierdo 0,9;
	2-out of bouns(off-by-one)-array 5 posiciones - index es hasta 4 comienza en 0,
	Error por uno.
	3.overflow: utilizar el tipo de dato adecuado para lo que va alamacenar
	Optimizar el codigo.

    * */

    public static void main(String[] args) {
        //como llamar una variable
        //ej un contador debe ser logico y entendible al que lee al codigo
        //i viene de index

        //array bidimensional
        int numeros[][]={
                {1,2,3,4,5},
                {10,20, 30, 40, 50}
        };
        //recorremos el array bidemencional numeros y por cda sub array del mismo mostramos los valores
        for (int i=0; i < numeros.length; i++) {
            for (int j=0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+"\t");
            }

        }

        int  arraysimple []={10,20,30,40};
        for (int i : arraysimple) {
            System.out.println(arraysimple[i]);
        }

  //variables temporales
        suma(1,2);




    }
    public  static int suma(int a, int b) {
        var temp = a    +b;
        return temp;

    }
}
