public class Loops3Pt1 {
    public static void main(String[] args) {
        System.out.println("X   X*2    X*3");

        int x = 5;
        while (x  <= 15) {
            System.out.println(x + "\t" + x*2 + "\t" + x*3);
            x+=5;
        }
    }
}