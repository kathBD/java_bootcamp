package estructurasdecontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String day = "Martes";
        //comparación cadenas numeros de la
       // boolean resltado = CompararNumero = 5 == 5;
        boolean result = day.equals("Martes");

        //if else if

        if(day.equals("Lunes")){
            System.out.println("Animo tendremos mundial!!");

        } else if (day.equals("Martes")) {
            System.out.println("Marte con M de Me besas!");

        }else if (day.equals("Miercoles")) {
            System.out.println("El obligo de la semana!");

        }else if (day.equals("Jueves")) {
            System.out.println("Es #TBT");

        }else if (day.equals("Viernes")) {
            System.out.println("SIIII viernes");
        }else{
            System.out.println("no es laborable es fin de semana Yuupi");
        }


    }
}
