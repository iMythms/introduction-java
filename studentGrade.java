import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter student grade: ");
            int grade = input.nextInt();

            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("F");
                    break;
                default:
                    grade = 0;
                    System.out.println("Invalid input");
            }
        }
    }
}
