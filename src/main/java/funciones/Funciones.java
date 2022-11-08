package funciones;

public class Funciones {
    public static void main(String[] args) {


        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
        holaMundo();
        holaMundo("Kathe");
        holaMundo("Tsuki");
        holaMundo("Tsuki", "López");
        String saludo = retornaHola();
        System.out.println(saludo);




    }

    private static void holaMundo() {
        System.out.println("Hola Mundo - desde metodo");
        System.out.println("Hola Mundo - metodo");

    }
    private static void holaMundo(String name){
        System.out.println("Hola  " + name);
    }

    private static void holaMundo(String name, String surname){
        System.out.println("Hola  " + name + " " + surname);
    }

    private static String retornaHola(){
        return "Hola desde retorno";
    }
}
