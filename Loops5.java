public class Loops5 {
    public static void main(String[] args) {
        System.out.println("x\tx*2\tx*3");

        int x = 3;

        for (x = 5; x <= 15; x += 5) {
            System.out.println(x + "\t" + x * 2 + "\t" + x * 3);
        }
    }
}