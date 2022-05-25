import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double amount;
            double euro;
            boolean Exit = false;
            final int Sentinel = -99;

            System.out.println("BHD to EUR Converter");

            do {
                System.out.println("Please enter amount (-99 to quit)");
                amount = input.nextDouble();

                if (amount != Sentinel) {
                    euro = amount * 1.85;
                    System.out.println(amount + "BHD is equal to " + euro + "EUR");
                } else {
                    Exit = true;
                }
            } while (Exit);
        }
    }
}