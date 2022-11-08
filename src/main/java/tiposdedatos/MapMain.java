package tiposdedatos;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {



        Map<String, String> personas = new HashMap<>();

        personas.put("565K", "nombre apellido 1");
        personas.put("565M", "nombre apellido 2");
        personas.put("565T", "nombre apellido 3");

        System.out.println(personas);
//llave
        for (String key : personas.keySet()) {
            System.out.println(key);
        }
//valor
        for (String value : personas.values()) {
            System.out.println(value);
        }
//valor y llave
        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());

        }
        //otro ejemplo

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");		map.put(15, "Ramos");
        map.put(3, "Pique");		map.put(5, "Puyol");
        map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");		map.put(6, "Iniesta");
        map.put(7, "Villa");

// Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }

}
