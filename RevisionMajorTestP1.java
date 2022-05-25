//Ex5 Q2

import java.util.Scanner;

public class RevisionMajorTestP1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Value 1");
            int value1 = input.nextInt();
            System.out.println("Enter Value 2");
            int value2 = input.nextInt();

            double Addition = value1 + value2;
            double Subtraction = value1 - value2;
            double Multiplication = value1 * value2;
            double Division = value1 / value2;

            System.out.println("Choose a Method Number:");
            System.out.println("a. Addition");
            System.out.println("s. Subtraction");
            System.out.println("m. Multiplication");
            System.out.println("d. Division");

            char calculationMethod = input.next().charAt(0);

            if (calculationMethod == 'a' || calculationMethod == 'A')
                System.out.println("Your result: " + Addition);
            else if (calculationMethod == 's' || calculationMethod == 'S')
                System.out.println("Your result: " + Subtraction);
            else if (calculationMethod == 'm' || calculationMethod == 'M')
                System.out.println("Your result: " + Multiplication);
            else if (calculationMethod == 'd' || calculationMethod == 'D')
                System.out.println("Your result: " + Division);
        }
    }
}