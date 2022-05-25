import java.util.Scanner;

public class MyCircle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double radius;

            System.out.println("Enter radius: ");
            radius = input.nextDouble();

            double area = (3.14) * (radius) * (radius);
            System.out.println("Area = PI * r^2 = " + area);

            double perimeter = (2) * (3.14) * (radius);
            System.out.println("Perimeter = 2 * PI * r = " + perimeter);
        }
    }
}