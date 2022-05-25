import java.util.Scanner;

public class ArraysEx0 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // This is how we store Arrays:
            int arr[] = new int[4]; // int = type. arr = name. int[4] = Length

            // calculate the Sum of elements + Average
            int sum = 0;
            double Average;

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter value " + i + ": ");
                arr[i] = input.nextInt();
                sum += arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n" + "Sum = " + sum);
            Average = sum / arr.length;
            System.out.println("Average: " + Average);
        }
    }
}