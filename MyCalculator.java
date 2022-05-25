public class MyCalculator 
{
    public static void main(String[] args) 
    {
        //values
        int num1 = 10;
        int num2 = 5;
        int sum;
        int diff;
        int div;
        int prod;
        
        //sum
        sum = num1 + num2;

        //difference
        diff = num1 - num2;

        //division
        div = num1 / num2;

        //product
        prod = num1 * num2;

        //print
        System.out.println("Number 1 = " + num1 + ", Number 2 = " + num2);
        System.out.println("sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Division = " + div);
        System.out.println("Product = " + prod);
    }    
}
