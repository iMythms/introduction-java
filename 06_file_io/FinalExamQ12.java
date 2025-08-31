public class FinalExamQ12 {
    public static void main(String[] args) {
        int arr[][] = { { 3, 8, 2 }, { 1, 0, 2 }, { 7, 2, 6 } };

        int sum = 0;
        for (int out = 0; out < 3; out++) {
            for (int in = 0; in < 3; in++) {
                System.out.print(arr[out][in] + "\t");
                sum = (arr[0][1] + arr[1][0] + arr[1][1] + arr[1][2] + arr[2][1]);
            }
            System.out.println();
        }
        System.out.println("Sum= " + sum);
    }
}