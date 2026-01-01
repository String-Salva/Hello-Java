package basic.c06_loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int i = 1;

        while (i <= 10) {
            System.out.print(i + ", ");
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Salva");
        lista.add("Espe");
        lista.add("Amalia");
        lista.add("Silvia");
        lista.add("Sara");

        int j = 0;
        do {
            System.out.println(lista.get(j));
            j++;
        } while (j < lista.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int q = 1; q <= 50; q++) {
            if (q % 5 == 0) {
                System.out.println(q + ",");
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        int suma = 0;

        int[] numeros = { 5, 5, 10, 10 };

        for (int a : numeros) {
            suma += a;
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        for (int p = 0; p < numeros.length; p++) {
            System.out.print(numeros[p] + ", ");
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        Set<Integer> setDeEnteros = new HashSet<>();

        setDeEnteros.add(5);
        setDeEnteros.add(10);
        setDeEnteros.add(15);
        setDeEnteros.add(20);

        Map<Integer, String> mapaDeStrings = new HashMap();

        mapaDeStrings.put(1, "Salvorio");
        mapaDeStrings.put(0, "Esperanza");
        mapaDeStrings.put(2, "Denver");

        for (Integer a : setDeEnteros) {
            System.out.print(a + ", ");
        }

        System.out.println();

        for (Map.Entry<Integer, String> entry : mapaDeStrings.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (int l = 10; l > 0; l--) {
            System.out.print(l + ", ");
        }
        System.out.println();

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int k = 1; k <= 20; k++) {
            if (k % 3 == 0) {
                continue;
            }
            System.out.print(k + ", ");
        }
        System.out.println();

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.

        int[] m = { 1, 2, 3, 4, 5, -10, 5, 87, 9, 8 };

        for (int a : m) {
            if (a < 0) {
                break;
            }
            System.out.print(a + ", ");
        }

        System.out.println();
        // 10. Crea un programa que calcule el factorial de un número dado.

        int factorial = 1;
        int numeroDado = 10;

        for (int n = 1; n <= numeroDado; n++) {
            factorial *= n;
        }
        System.out.println(factorial);

    }
}
