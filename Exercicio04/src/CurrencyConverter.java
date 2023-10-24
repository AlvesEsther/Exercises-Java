public class CurrencyConverter {
    public static final double IOF = 0.06;

    public double valorReais(double price_dollar, double dollar){
       double d = price_dollar * dollar;
       return (d * IOF) + d;
    }




}
