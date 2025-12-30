package basic.c08_oop.EjerciciosClasses;

public class Student {
  int score;


  public Student(int score) {
    this.score = score;
  }

  public static boolean aprobado(Student random) {
    if (random.score >= 60) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Student salva = new Student(80);

    if (aprobado(salva)) {
      System.out.println("Tiene una nota de " + salva.score + " por lo que SÍ está aprobado");
    } else {
      System.out.println("Tiene una nota de " + salva.score + " por lo que NO está aprobado");
    }
  }
}
