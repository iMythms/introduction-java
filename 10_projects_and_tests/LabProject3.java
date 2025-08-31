import java.util.Scanner;

public class LabProject3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // All Variables
            String name;
            int cprNumber;
            double bloodSugar;
            double sum = 0;

            // Outer Loop for 5 Patient
            for (int outer = 1; outer <= 5; outer++) {
                System.out.println("Enter Your Name: ");
                name = input.next();
                System.out.println("Enter Your CPR Number: ");
                cprNumber = input.nextInt();
                sum = 0;

                // Inner Loop for Blood Test readings
                for (int inner = 1; inner <= 4; inner++) {
                    System.out.println("Enter Reading: ");
                    bloodSugar = input.nextDouble();

                    // Find if the reading inside the range
                    if (bloodSugar < 80 || bloodSugar > 150) {
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    sum += bloodSugar;
                } // End of Inner Loop

                // Define the Average and Print the Average
                double average = sum / 4;
                System.out.println("Average: " + average);

                // Check which condition suites the Average
                if (average >= 80 && average <= 100) {
                    System.out.println("Normal.");
                } else if (average >= 101 && average <= 125) {
                    System.out.println("Impaired Glucose.");
                } else {
                    System.out.println("Diabetic!");
                }
            } // End of Outer Loop
        }
    }
}