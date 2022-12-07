package programacion.polimorfismo;


import tiposdedatos.Coche;

public class Polimorfismo {
    public static void main(String[] args) {

      Auto auto = new Auto();
      auto.diHola();

        Moto moto = new Moto();
        moto.diHola();

        moto.sumaNumeros( 4, 9);
        moto.sumaNumeros(3.4, 5.9);
        moto.sumaNumeros(5.2, 9.9);

    }
}
    class Auto{
        int velocidadMinima;

        public  void diHola(){
            System.out.println("Hola!!!");
        }
    }

    class Moto extends Auto{
        public void diHola(){
            System.out.println("Soy una moto");
            //si la borro imprimi Hola
        }

        public  int sumaNumeros (int a, int b){
            System.out.println("Soy el suma Numeros int");
            return a+ b;
        }

        public float sumaNumeros (float a, float b){
            System.out.println("Soy el suma Numeros float");
            return a + b;
        }
        public void sumaNumeros (double a, double b){
            System.out.println("Soy el suma Numeros double");
            System.out.println("resultado:"  + (a +  b));
        }
    }

