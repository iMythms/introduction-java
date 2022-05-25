public class Arrays2DEx1 {
    public static void main(String[] args) {
        int arr[][] = { { 2, 4, 8 }, { 10, 12, 14 }, { 16, 18, 20 } };

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // To print out put diagonally (2, 12, 20)
                if (r == c)
                    System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }
    }
}