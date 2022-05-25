//Input: First Name, Last Name: String, ID: int
import java.util.Scanner;

public class PrintF 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter First Name: ");
            String fName = input.nextLine();

            System.out.println("Enter Last Name: ");
            String lName = input.nextLine();

            System.out.println("Enter your ID: ");
            int ID = input.nextInt();

            String username;
            username = "@" + fName.substring(0, 1) + lName;
            username = username.toLowerCase();

                              //Name in UpperCase first character + the whole is in lower case
            String fullName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase() + " " + 
                              lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();

            //Regular Println Statement
            //System.out.println("Name: " + fullName + "\nID: " + ID + "\nUsername: " + username);

            // PrintF Statement
            System.out.printf("Name: %s \nID: %d \nUsername: %s", fullName, ID, username);
        }
    }    
}