import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.print("What is the dollar price? ");
        double price_dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();
        double reais = currencyConverter.valorReais(price_dollar, dollar);
        System.out.print("Amount to be paid in reais = " + reais);

        sc.close();

    }
}
