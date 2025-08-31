import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int i = 1;
			int sum = 0;
			while (i <= 10) {
				System.out.println("Enter a number: ");
				int num = input.nextInt();
				sum += num;
				i++;
			}
			System.out.println("sum = " + sum);
			double avg = sum / 10;
			System.out.println("avg = " + Math.round(avg));
		}
	}
}