package funciones;

public class While {

    public static void main(String[] args) {
        //condicion
      //  boolean check = true;
        int count =0;

        while (count <10){
            count++;//condicion

            if (count == 6)
                //continue;
                break;
            System.out.println("Hola mundo " + count);

        }
        System.out.println("fin");

    }
}
