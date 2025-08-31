public class MyRectangle 
{
    public static void main(String[] args) 
    {
        double base;
        double height;
        double sideA;
        double sideB;
        double sideC;

        base = 6.2;
        height = 3.4;
        sideA = 2.0;
        sideB = 3.1;
        sideC = 2.9;

        double area = 0.5 * (base * height);
        double perimeter = sideA+sideB+sideC;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }    
}
