import java.util.Scanner;
public class PrintFEx 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.println("Enter your First Name: ");
            String EmpFName = input.nextLine();

            System.out.println("Enter your Last Name: ");
            String EmpLName = input.nextLine();

            System.out.println("Enter your Position: ");
            String Position = input.nextLine();

            System.out.println("Enter your Department: ");
            String Department = input.nextLine();

            System.out.println("Enter your working hours per week: ");
            double WorkingH = input.nextDouble();
            
            double Salary = WorkingH * 4.7 * 4.0;

            String EmpFullName = EmpFName.substring(0, 1).toUpperCase() + EmpFName.substring(1).toLowerCase() + " " + 
                              EmpLName.substring(0, 1).toUpperCase() + EmpLName.substring(1).toLowerCase();
            
            System.out.printf("Welcome %s \n%s in the %s Department \nYour salary this month is BD%.2f", EmpFullName, Position, Department, Salary);
        }
    }    
}
