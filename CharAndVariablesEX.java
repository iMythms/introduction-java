import java.util.Scanner;

public class CharAndVariablesEX {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your first name: ");
            String fName = input.nextLine();

            System.out.println("Enter your last name: ");
            String lName = input.nextLine();

            System.out.println("Enter your ID: ");
            int ID = input.nextInt();

            System.out.println("Name: " + fName + " " + lName + ".");
            System.out.println("ID: " + ID);

            String username = fName.substring(0, 1) + lName;
            String lowerCase = username.toLowerCase();
            System.out.println("Username: @" + lowerCase);
        }
    }
}
