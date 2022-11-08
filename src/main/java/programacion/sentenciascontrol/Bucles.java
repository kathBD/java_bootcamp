package programacion.sentenciascontrol;

public class Bucles {

    public static void main(String[] args) {
        //bucles un fragmento de codigo se va a ejecutar un numero determinado o no de veces, se ejecuta mientras se cumpla una condición
         //mientras While
        /* var contador =0
        * mientras(contador mayor a cero)
        * restar uno a contador
        * sigo por aqui
        * */

        int contador = 10;
        while (contador > 0){
            System.out.println(contador);
           //contador=contador-1; //valor actual de contador
            contador--; //iterar
        }

//Do while
        /**var contador= 10
         * haz
         * resta uno al contador
         *mientras(contador sea mayor que 10) sew ejecuta como una vez
        */

        int contador2 = 10;
        do{
            System.out.println(contador2);
            contador = contador - 1;
        }while (contador > 10);


        //bucle for para Array o tipos de datos compuestos por

        //declaracion-inicializacion; comparacion;  accion

        for(int i=1; i<=10; i++){
            System.out.println(i);
            //despues de esta linea se ejecuta la accion del bicle for
        }


       // int valores[] = new int[5];
        int valores [] ={10, 20, 30, 40, 50};
         //0<5
        //1<5
        //2<5
        //3<5
        //4<5
        //5<5 !!esta no
        for (int i = 0; i<valores.length; i++){
            System.out.println(valores[i]);
        }

    }
}
