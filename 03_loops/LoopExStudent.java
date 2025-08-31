import java.util.Scanner;

public class LoopExStudent {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double grade;
            double min = 100, max = 0;
            double sum = 0.0;

            int i;
            for (i = 1; i <= 5; i++) {
                System.out.println("Enter your grade: " + i);
                grade = input.nextDouble();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid");
                    System.exit(0);
                }
                sum += grade;

                grade = Math.min(min, grade);
                grade = Math.max(max, grade);
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);

            double average;
            average = sum / (i - 1);
            System.out.println("Average = " + average);

            if (average >= 60)
                System.out.println("Pass");

            else
                System.out.println("Fail");
        }
    }
}