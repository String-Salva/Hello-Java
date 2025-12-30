package basic.c07_functions;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    public static void saludar() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void saludar(String nombre) {
        System.out.println("¡Bienvenido " + nombre + "!");
    }

    public static int restar(int a, int b) {
        return (a - b);
    }

    public static int cuadrado(int n) {
        return n * n;
    }

    public static boolean esPar(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean esMayorDeEdad(int e) {
        if (e >= 18) {
            return true;
        }
        return false;
    }

    public static int longitudDeCadena(String texto) {
        return texto.length();
    }

    public static double mediaArray(int[] a) {
        int suma = 0;
        for (int b : a) {
            suma += b;
        }
        return (double) suma / a.length;
    }

    public static int factorial(int numeroDado) {
        int factorial = 1;
        for (int i = 1; i <= numeroDado; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void mostrarArrayList(ArrayList<String> arrayListPrueba) {
        for (String a : arrayListPrueba) {
            System.out.print("[" + a + "]");
        }
    }

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".

        saludar();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.

        saludar("Salva");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.

        System.out.println(restar(4, 2));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).

        System.out.println(cuadrado(5));

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        int k = 0;
        if (esPar(k)) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).

        int e = 10;
        if (e < 0) {
            System.out.println("Edad errónea");
        } else if (esMayorDeEdad(e)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        String texto = "El perro de San Roque no tiene rabo";

        System.out.println("El texto introducido tiene " + longitudDeCadena(texto) + " caracteres");

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.

        int[] numerosEnteros = { 10, 7, 9, 4, 4, 4, 5, 7 };

        System.out.println("La media de la lista de números es " + mediaArray(numerosEnteros));

        // 9. Escribe un método que reciba un número y retorna su factorial.

        int numeroPrueba = 5;
        System.out.println("El factorial de " + numeroPrueba + " es = " + factorial(numeroPrueba));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.

        ArrayList<String> pruebArrayList = new ArrayList<>(Arrays.asList("Antonio", "Salvorio", "Esperanza", "Sara"));

        mostrarArrayList(pruebArrayList);
    }
}
