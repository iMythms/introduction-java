import java.util.Scanner;

public class ArraysEx2 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Declare Arrays of size 10:
            int arr[] = new int[10];
            int sum = 0;

            // Reading Elements
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Elements: ");
                arr[i] = input.nextInt();
            }

            // Printing even numbers:
            // Calculate the sum of even numbers:
            System.out.println("Even Numbers: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                    sum += arr[i];
                }
            }

            System.out.println("\nThe Sum of Even Numbers: " + sum);
        }
    }
}