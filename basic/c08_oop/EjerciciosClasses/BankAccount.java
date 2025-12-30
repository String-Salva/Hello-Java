package basic.c08_oop.EjerciciosClasses;

public class BankAccount {
  double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }
  public double getBalance() {
    return this.balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposito(double dinero) {
    setBalance(getBalance() + dinero);

  }

  public static void main(String[] args) {
    BankAccount salvorio = new BankAccount(456.25);


    salvorio.deposito(20.5);

    System.out.println(salvorio.getBalance());
  }
  
}
