import java.util.Scanner;

public class selectMonth {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Month ID: ");
            int month = input.nextInt();

            /*
             * switch (month) {
             * case 1:
             * case 3:
             * case 5:
             * case 7:
             * case 8:
             * case 10:
             * case 12:
             * System.out.println("31 Days");
             * break;
             * case 2:
             * System.out.println("28 or 29 Days");
             * break;
             * case 4:
             * case 6:
             * case 9:
             * case 11:
             * System.out.println("30 Days");
             * break;
             * default:
             * System.out.println("Invalid input");
             * }
             */

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println("31 Days");
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                System.out.println("30 Days");
            else if (month == 2)
                System.out.println("28 or 29 Days");
        }
    }
}