import java.util.Scanner;

public class RectangleHeight 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            double height;
            double width;

            System.out.println("Enter height: ");
            height = input.nextDouble();

            System.out.println("Enter width: ");
            width = input.nextDouble();

            double area = height * width;
            double perimeter = 2 * (height + width);

            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);
        }
    }
}
