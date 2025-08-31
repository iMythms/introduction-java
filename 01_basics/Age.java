import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int thisYear = 2022;
            System.out.println("Enter your birth year: ");
            int birthYear = input.nextInt();

            int age = thisYear - birthYear;

            if (age < 0)
                System.out.println("Invalid input");
            else
                System.out.println("Your age should be: " + age);
        }
    }
}
