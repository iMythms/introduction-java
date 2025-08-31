import java.util.Scanner;

public class controlStatement4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age;

            System.out.println("How old are you?");
            age = input.nextInt();

            if (age <= 3 && age >= 0)
                System.out.println("Nursery");
            else if (age > 3 && age <= 6)
                System.out.println("Kindergarten");
            else if (age > 6 && age <= 14)
                System.out.println("Primary School");
            else if (age > 14 && age <= 16)
                System.out.println("Intermediate");
            else if (age > 16 && age <= 18)
                System.out.println("High School");
            else if (age >= 18)
                System.out.println("Higher Education");
            else
                System.out.println("Invalid");
        }
    }
}