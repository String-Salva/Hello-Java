package basic.c08_oop;

/*
Clase 66 - Ejercicios: Abstracción
Vídeo: https://youtu.be/JOAqpdM36wI?t=26892
*/

public class AbstractionExercises {

    public static abstract class Shape {
        public void calculateArea() {
        }

    }

    public static class Circle extends Shape implements Drawable {
        public double radio;

        public void draw() {
            System.out.println("Se dibuja un círculo");
        }

        public Circle() {
        }

        public Circle(double radio) {
            this.radio = radio;
        }

        public void calculateArea() {
            System.out.println(
                    "El área de este círculo es " + (Math.PI * Math.pow(this.radio, 2)) + " centímetros cuadrados");

        }

    }

    public static class Rectangle extends Shape {
        public double base;
        public double altura;

        public Rectangle() {
        };

        public Rectangle(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public Rectangle(double base) {
            this.base = base;
            this.altura = base;
        }

        public void calculateArea() {
            System.out.println("El área de este rectángulo es " + (base * altura) + " centímetros cuadrados");
        }
    }

    public interface Playable {
        public void play();
    }

    public static class Guitar implements Playable {

        public void play() {
            System.out.println("Tocar la guitarra");
        }
    }

    public static class Piano implements Playable {
        public void play() {
            System.out.println("Tocar el piano");
        }
    }

    public static abstract class Animal {
        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Guau!");
        }
    }

    public static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Miau!");
        }
    }

    public interface Drawable {
        public void draw();
    }

    public static class Square implements Drawable {
        public void draw() {
            System.out.println("Se dibuja un cuadrado");
        }
    }

    public static class Triangle implements Drawable {
        public void draw() {
            System.out.println("Se dibuja un triángulo");
        }
    }

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
        // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
        // propia área.

        Circle circulo = new Circle(4.3);

        Rectangle rectangulo = new Rectangle(4.5);

        circulo.calculateArea();
        rectangulo.calculateArea();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa
        // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
        // diferente al ejecutarse.

        Guitar guitarra = new Guitar();
        Piano piano = new Piano();
        guitarra.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
        // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
        // mostrar polimorfismo.

        Dog currito = new Dog();
        Cat carrito = new Cat();
        Dog bruno = new Dog();
        Cat falillo = new Cat();

        Animal[] animales = { currito, carrito, bruno, falillo };

        for (Animal a : animales) {
            a.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
        // Triangle que muestren cómo se dibuja cada figura usando draw().

        Circle circulo2 = new Circle();
        Square cuadrado = new Square();
        Triangle triangulo = new Triangle();

        circulo2.draw();
        cuadrado.draw();
        triangulo.draw();


        // 5. Crea una clase abstracta Employee con un método calculateSalary().
        // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
        // calcular el salario.

        

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
        // Robot implementen ese método con comportamientos diferentes.

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
        // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
        // implemente ambas interfaces y muestre cómo puede volar y nadar.

        // 9. Crea una clase abstracta Document con el método print(). Luego crea
        // PDFDocument y WordDocument, cada una con su forma de imprimir.

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las
        // clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
        // diferente.
    }
}
