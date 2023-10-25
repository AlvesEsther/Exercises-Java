public class Application {
    public static void main(String[] args) {
     BankAccount p1 = new BankAccount();
     p1.setNumAccount(01);
     p1.setOwner("Esther");
     p1.openAccount("CC");

     BankAccount p2 = new BankAccount();
     p2.setNumAccount(02);
     p2.setOwner("Vitor");
     p2.openAccount("CP");

     p1.deposit(100);
     p2.deposit(500);
     p2.withdraw(100);




     p1.CurrentState();
     p2.CurrentState();
    }
}
