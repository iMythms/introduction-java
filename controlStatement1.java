import java.util.Scanner;

public class controlStatement1 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your weight: ");
            int weight;
            weight = input.nextInt();

            if (weight < 0)
                System.out.println("Error, Invalid input");

            else if (weight > 100)
                System.out.println("Obese");

            else if (weight < 30)
                System.out.println("Underweight");

            else
                System.out.println("Normal");
        }
    }
}
