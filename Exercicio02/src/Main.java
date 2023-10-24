import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sn = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("NAME: ");
        employee.Name = sn.nextLine();
        System.out.print("GROSS SALARY: ");
        employee.GrossSalary = sn.nextDouble();
        System.out.print("TAX: ");
        employee.Tax = sn.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary?");
        double percentage = sn.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Employee: " + employee);

        sn.close();




    }
}