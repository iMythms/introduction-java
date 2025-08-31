import java.util.Scanner;

public class controlStatement2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("Enter a number, and check if it's EVEN or ODD:");
            number = input.nextInt();

            if (number % 2 == 0)
                System.out.println("EVEN");

            else
                System.out.println("ODD");
        }
    }
}