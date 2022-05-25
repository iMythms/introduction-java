public class MathFunction 
{
    public static void main(String[] args) 
    {
        double a = 6.8;
        double b = 2.3;

        //Ready function for PI = 3.14
        System.out.println(Math.PI);

        //Ready function for rounding numbers
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));

        //Ready Ceiling & Flooring function
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));

        System.out.println(Math.ceil(b));
        System.out.println(Math.floor(b));

        //Ready Square root function
        System.out.println(Math.sqrt(9));

        //Power (base value, power value)
        System.out.println(Math.pow(3, 2)); //3^2

        //Max function (will print the highest value)
        System.out.println(Math.max(a, b));

        //Min function (will print the minimum value)
        System.out.println(Math.min(8, Math.min(3, 6)));
    }    
}
