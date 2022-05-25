import java.util.Scanner;

public class controlStatement3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1;
            System.out.println("Enter a number 1: ");
            number1 = input.nextInt();

            int number2;
            System.out.println("Enter a number 2: ");
            number2 = input.nextInt();

            if (number1 % 2 == 0 && number2 % 2 == 0)
                System.out.println("Sum = " + (number1 + number2));

            else
                System.out.println("Product = " + (number1 * number2));
        }
    }
}