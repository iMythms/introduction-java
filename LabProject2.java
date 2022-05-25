import java.util.Scanner;

public class LabProject2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Variables UnitedState, UK, China, Japan
            double priceUS = 6.0;
            double priceUK = 7.0;
            double priceCH = 9.0;
            double priceJA = 12.0;

            System.out.println("Enter a country code from this list:");
            System.out.println("U. United State of America");
            System.out.println("K. United Kingdom");
            System.out.println("C. China");
            System.out.println("J. Japan");

            char Country = input.next().charAt(0);

            System.out.println("How Many Kg you would like to ship?");
            double weight = input.nextDouble();
            double totalUS = priceUS * weight;
            double totalUK = priceUK * weight;
            double totalCH = priceCH * weight;
            double totalJA = priceJA * weight;

            if (Country == 'u' || Country == 'U') {
                System.out.println("Your Shipment Cost will be: " + (totalUS) + "BHD");
                if (totalUS > 100)
                    System.out.println(
                            "You have to pay 10% VAT: " + (totalUS * 1.1));
            } else if (Country == 'k' || Country == 'K') {
                System.out.println("Your Shipment Cost will be: " + (totalUK) + "BHD");
                if (totalUK > 100)
                    System.out.println(
                            "You have to pay 10% VAT: " + (totalUK * 1.1));
            } else if (Country == 'c' || Country == 'C') {
                System.out.println("Your Shipment Cost will be: " + (totalCH) + "BHD");
                if (totalCH > 100)
                    System.out.println(
                            "You have to pay 10% VAT: " + (totalCH * 1.1));
            } else if (Country == 'j' || Country == 'J') {
                System.out.println("Your Shipment Cost will be: " + (totalJA) + "BHD");
                if (totalJA > 100)
                    System.out.println(
                            "You have to pay 10% VAT: " + (totalJA * 1.1));
            }
        }
    }
}
