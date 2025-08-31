public class Arrays2DEx0 {
    public static void main(String[] args) {
        int arr[][] = { { 2, 4 }, { 6, 8 } };

        int sum = 0, min = arr[0][0], max = arr[0][0];

        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(arr[r][c] + " ");
                sum += arr[r][c];
                min = Math.min(min, arr[r][c]);
                max = Math.min(min, arr[r][c]);
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}