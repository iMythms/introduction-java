import java.util.Scanner;

public class LabTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // defining variables
            int tickets, age, cpr;
            double childCount = 0;
            double childPrice = 5;
            double adultPrice = 7;
            double bill = 0;
            double discount;

            // read no. of tickets
            System.out.println("Number of tickets: ");
            tickets = input.nextInt();

            // Loop
            for (int i = 1; i <= tickets; i++) {
                System.out.println("Customer CPR: ");
                cpr = input.nextInt();

                System.out.println("Customer Age: ");
                age = input.nextInt();

                if (age <= 13) {
                    System.out.println("Price = " + childPrice);
                    bill += childPrice;
                    childCount += childPrice;
                } else {
                    System.out.println("Price = " + adultPrice);
                    bill += adultPrice;
                }
            } // End of the loop

            // Print the first bill
            System.out.println("Bill = " + bill);

            // Apply VAT
            if (bill >= 20) {
                System.out.println("VAT = " + (bill * 0.1));
            } else {
                System.out.println("VAT = " + (bill * 0.05));
            }

            // calculate discount
            discount = childCount * 0.15;
            if (childCount >= 15) {
                System.out.println("Discount = " + discount);
            } else {
                System.out.println("Discount = 0.0");
            }
            // total bill
            System.out.println("Total bill = " + (bill - discount));
        }
    }
}