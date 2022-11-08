package programacion;

public class Funciones {
    public static void main(String[] args) {
        //invocar la funcion
        int resultado = 0;
        resultado = suma(4, 5);
        System.out.println(resultado);

        suma2(10, 12);

        var valor = suma3(30, 10);
        System.out.println(valor);

        //paso por refefencia

        Potato miPotato = new Potato();
        //invocar la funcion
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);

    }

    public static int suma(int a, int b) {

        return a + b;
    }

    public static void suma2(int a, int b) {

        System.out.println(a + b);
    }

    public static int suma3(int a, int b) {

        return a + b;
    }

    static class Potato {
        public int brazos = 0;

        public void QuitarBrazo() {
            this.brazos--;
        }
    }

    //funcion recursiva esta crea un bucle infinito

   /* public static int suma5(int a, int b){
        int resultado = a + b;
        System.out.println(a +b);
        return suma5(a, b);
    }*/

    //callback asignar el nombre de una función a una variable
    //miVariable = funcion();
    //mivariable();


}
