import java.util.Scanner;

public class Arrays2DEx2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int arr[][] = new int[3][3];

            // Reading 2-D Array Value
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print("Enter Values: " + r + " " + c + " ");
                    arr[r][c] = input.nextInt();
                }
                System.out.println();
            }

            // Printing 2-D Array Value
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(arr[r][c] + "\t");
                }
                System.out.println();
            }
        }
    }
}