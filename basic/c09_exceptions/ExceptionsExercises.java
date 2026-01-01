package basic.c09_exceptions;

/*
Clase 72 - Ejercicios: Excepciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=29721
*/

public class ExceptionsExercises {

    public static void dividir(int a, int b) {
        try {
            double resultado = a / b;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Números no dividibles");
        } catch (Exception m) {
            System.out.println("System error bróh");
        } finally {
            System.out.println("Satisfecho?");
        }
    }

    public static int convertirTexto(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException formatoNumerico) {
            String resultado = "";
            for (int i = 0; i < texto.length(); i++) {
                char prueba = texto.charAt(i);
                if (Character.isDigit(prueba)) {
                    resultado += prueba;
                }
            }
            return Integer.parseInt(resultado);
        } finally {
            System.out.println("Cómo te quedas?");
        }
    }
    public static class TemperatureChecker {
        IllegalArgumentException temperaturaErronea = new IllegalArgumentException();


        }
    }

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por
        // cero con try-catch.

        int a = 5;
        int b = 5;

        dividir(a, b);

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el
        // ArrayIndexOutOfBoundsException.

        int[] arrayEjemplo = { 0, 1, 2 };

        try {
            System.out.println(arrayEjemplo[1]);
        } catch (ArrayIndexOutOfBoundsException falloPorIndice) {
            System.out.println("No existen tantos elementos en el array bro");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
        // NullPointerException.

        String nula = null;

        try {
            System.out.println(nula.length());
        } catch (NullPointerException esNulo) {
            System.out.println("No está inicializada la variable bro!");
        } finally {
            System.out.println("Que coño quieres hacer?");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para
        // manejar entradas no válidas (NumberFormatException).

        System.out.println(convertirTexto("4456456"));

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o
        // no error.

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
        // es negativo.

        int numeroIntroducido = 4;
        if (numeroIntroducido < 0) {
            throw new IllegalArgumentException("Tiene que ser un número mayor que 0");

        } else {
            System.out.println(numeroIntroducido);
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
        // la temperatura es menor a -50 o mayor a 50.



        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
        // otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la
        // contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada
        // LoginFailedException si el usuario o contraseña son incorrectos.
    }
}
