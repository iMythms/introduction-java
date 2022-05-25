public class NestedLoopsRev1 {
    public static void main(String[] args) {

        for (int outer1 = 5; outer1 >= 1; outer1--) {
            // inner loop: # of stars in each lines
            for (int inner1 = 1; inner1 <= outer1; inner1++) {
                System.out.print("*");
            } // End inner1 loop
            System.out.println();
        } // End outer1 loop
        for (int outer2 = 1; outer2 <= 5; outer2++) {
            // inner loop: # of stars in each lines
            for (int inner2 = 1; inner2 <= outer2; inner2++) {
                System.out.print("*");
            } // End inner2 loop
            System.out.println();
        } // End outer2 loop
    }
}