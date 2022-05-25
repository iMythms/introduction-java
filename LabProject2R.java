import java.util.Scanner;

public class LabProject2R {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Drink
            String DrinkName = "Mocha";
            System.out.println("Drink Name: " + DrinkName);
            System.out.print("Drink price: ");
            double DrinkPrice = input.nextDouble();
            System.out.print("How many drinks? ");
            double quantity = input.nextDouble();

            // Amount
            double amount = DrinkPrice * quantity;

            // discount
            double Discount = DrinkPrice * 0.05;
            if (DrinkPrice > 2.0)
                System.out.println("Make discount: ");
            else
                System.out.println("No Discount");

            // original bill
            System.out.println("original bill is : " + amount);

            // discounted bill
            System.out.println("Discounted bill is : " + (amount - Discount));
        }
    }
}
