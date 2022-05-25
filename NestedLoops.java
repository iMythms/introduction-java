import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name;
            double grade;
            double sum = 0;
            double average;

            for (int out = 1; out <= 3; out++) {
                System.out.println("Enter Name: ");
                name = input.next();
                sum = 0;

                for (int in = 1; in <= 4; in++) {
                    System.out.print("Enter Grade: ");
                    grade = input.nextDouble();
                    sum += grade;
                }
                average = sum / 4;
                System.out.println("Average= " + average);
                if (average >= 60)
                    System.out.println("Pass");
                else
                    System.out.println("Fail");
            }
        }
    }
}