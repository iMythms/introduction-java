import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/Users/mytham/Developer/Java/ITCS122/ReadingFromFile.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}