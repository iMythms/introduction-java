import java.util.Scanner;

public class MajorTestMytham {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String X = new String("This is just for test");
            boolean VarX = X.endsWith("test");

            System.out.println(VarX);

            System.out.println("Enter A number: ");
            int z = input.nextInt() / 3;

            if (z == 6)
                System.out.println("Hi");
            else if (z == 10)
                System.out.println("Bye");
            else
                System.out.println("Thanks");
        }

        int y = 4;

        System.out.println(Math.sqrt(y));
    }
}