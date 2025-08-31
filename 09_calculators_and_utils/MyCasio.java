import java.util.Scanner;
public class MyCasio 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            short a, b, c;
            double S1, S2, S3, S4, S5, S6, S7;
            
            System.out.println("Enter a: ");
            a = input.nextShort();

            System.out.println("Enter b: ");
            b = input.nextShort();

            System.out.println("Enter c: ");
            c = input.nextShort();

            S1 = b*b;
            S2 = 4*a*c;
            S3 = S1-S2;
            S4 = Math.sqrt(S3);
            S5 = 2*a;
            S6 = - b + S4;
            S7 = S6/S5;

            System.out.println("The result = " + S7);
        }
    }    
}
