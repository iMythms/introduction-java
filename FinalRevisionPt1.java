import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Write a Java program to read grades from .txt file.
// Store the grades inside an Array.
// Sum all grades and find the Average.

public class FinalRevisionPt1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/Users/mytham/Developer/Java/ITCS122/FinalRevisionPt1.txt"));

            double sum = 0;
            double grade[] = new double[7];

            while (input.hasNextDouble()) {
                for (int i = 0; i < grade.length; i++) {
                    grade[i] = input.nextDouble();
                    sum += grade[i];
                }

                for (int i = 0; i < grade.length; i++) {
                    System.out.println("Grade= " + grade[i]);
                }
            }

            System.out.println("Sum= " + sum);
            double average = sum / grade.length;
            System.out.println("Average= " + average);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}