package estructurasdecontrol.condicionales;

public class SentenciaSwich {
    public static void main(String[] args) {

        String dia = "Lunes";

        switch (dia) {
            case "Lunes":
            System.out.println("En este día animo!!!");
            break; //rompe el flujo de evaluacion de switch
            case "Martes":
                System.out.println("En este día ni te cases ni te embarques!!!");
                break;
            case "Miercoles":
                System.out.println("En este día vamos por la mitad!");
                break;
            default:
                System.out.println("En este día no es valido");
        }
    }
}
