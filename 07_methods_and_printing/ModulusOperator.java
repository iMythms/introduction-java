public class ModulusOperator 
{
    public static void main(String[] args) 
    {
        int a = 16;
        int b = 4;
        int c = 2;
        
        System.out.println(a/b);
        System.out.println(a/c);

        //Remainder after dividing 16/3 = 1
        //System.out.println(a-a/c*c);

        System.out.println(a%c);
        System.out.println(16%16);
        System.out.println(16%15);
        System.out.println(15%16);
        System.out.println(15%4);
        System.out.println(7%14);
    }
}
