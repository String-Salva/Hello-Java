package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        int[] array1 = { 1, 2, 5, 3, 45, 8, 7 };
        var array2 = new int[7];

        System.out.println(array1.length);
        System.out.println(array2.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println(array1[1]);
        array1[1] = 3;
        System.out.println(array1[1]);

        // 3. Crea un ArrayList vacío.

        ArrayList<Integer> lista1 = new ArrayList<>();
        var lista2 = new ArrayList<Integer>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        lista1.add(4);
        lista1.add(40);
        lista1.add(2);
        lista1.add(80);
        System.out.println(lista1);
        lista1.remove(3);

        System.out.println(lista1);
        // 5. Crea un HashSet con 2 valores diferentes.

        Set<Integer> set1 = new HashSet();
        var set2 = new HashSet();

        set1.add(4);
        set1.add(10);

        System.out.println(set1);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        set1.add(5);
        System.out.println(set1);
        set1.add(4);
        System.out.println(set1);

        // 7. Elimina uno de los elementos del HashSet.

        set1.remove(4);
        System.out.println(set1);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.

        Map<String, Integer> mapa = new HashMap<>();
        var mapa2 = new HashMap<String, Integer>();

        mapa.put("Salva", 622738530);
        mapa.put("Esperanza", 635072011);
        mapa.put("Sara", 675827699);

        System.out.println(mapa);

        // 9. Modifica uno de los contactos y elimina otro.

        mapa.put("Salva", 622738564);
        mapa.remove("Sara");
        System.out.println(mapa);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        ArrayList<Integer> nuevoArrayList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            nuevoArrayList.add(array1[i]);
        }
        System.out.println(nuevoArrayList);

        Set<Integer> nuevoSet = new HashSet(nuevoArrayList);

        System.out.println(nuevoSet);

        Map<Integer, Integer> nuevoMap = new HashMap<>();

        for (Integer valor : nuevoSet) {
            nuevoMap.put(valor, valor);
        }

        System.out.println(nuevoMap);

        for (Map.Entry<Integer, Integer> valores : nuevoMap.entrySet()) {
            System.out.print(valores.getValue());
        }

    }
}
