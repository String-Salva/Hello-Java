package basic.c08_oop.EjerciciosClasses;
// 4. Crea una clase Car con atributos brand y model y un método showData().
public class Car {
  String brand;
  String model;

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }
  public void showData() {
    System.out.println("Marca --> " + brand + " Modelo --> " + model);
  }
  public static void main(String[] args) {
    Car micoche = new Car("BMW","Serie 4");

    micoche.showData();
  }
}
