import java.util.Scanner;

public class Loops3Pt2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i = 1;
            int even = 0;
            int odd = 0;
            double sumEven = 0, sumOdd = 0;

            while (i <= 10) {
                System.out.println("Enter a number");
                int Number = input.nextInt();

                if (Number % 2 == 0) {
                    sumEven += Number;
                    even++;
                } else {
                    sumOdd += Number;
                    odd++;
                }
                i++;
            }
            double AverageEven = sumEven / even;
            System.out.println("Average Even =" + "\t" + AverageEven);

            double AverageOdd = sumOdd / odd;
            System.out.println("Average Odd =" + "\t" + AverageOdd);
        }
    }
}