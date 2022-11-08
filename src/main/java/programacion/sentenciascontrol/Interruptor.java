package programacion.sentenciascontrol;

public class Interruptor {

    public static void main(String[] args) {
        var estacion = "verano";

        switch (estacion) {
                case "verano":
                    System.out.println("es verano");
                    break;
                case "Invierno":
                    System.out.println("es invierno");
                    break;
               default:
                    System.out.println("estoy default");
        }

        var hoy_es = "sabado";
        switch (hoy_es){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "viernes":
                System.out.println("Hoy es laborable");
                break;
            default:
                System.out.println("no es laborable");

        }
    }
}
