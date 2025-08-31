import java.util.Scanner;

public class LabProject4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Storing Arrays Method:
            int EmpID[] = new int[6];
            int EmpHours[] = new int[6];

            // Average & Sum & Bonus:
            double average;
            double sum = 0;
            String bonus;

            // Reading Values
            for (int o = 0; o < EmpID.length; o++) {
                System.out.println("Enter Employee ID: ");
                EmpID[o] = input.nextInt();
            }

            for (int i = 0; i < EmpHours.length; i++) {
                System.out.println("Enter Working Hours: ");
                EmpHours[i] = input.nextInt();

                // Find if the value above 0:
                if (EmpHours[i] < 0) {
                    System.out.println("Invalid Input! Please Try Again: ");
                    EmpHours[i] = input.nextInt();
                }

                // Bonus
                if (EmpHours[i] >= 10) {
                    bonus = "yes";
                } else {
                    bonus = "no";
                }
                sum += EmpHours[i];
            }

            // Printing Output
            System.out.println("ID" + "\t" + "Hours" + "\t" + "Bonus");
            for (int p = 0; p < EmpID.length && p < EmpHours.length; p++) {
                System.out.println(EmpID[p] + "\t" + EmpHours[p] + "\t");
            }

            // Printing Average:
            average = sum / 6;
            System.out.println("Average: " + average);
        }
    }
}