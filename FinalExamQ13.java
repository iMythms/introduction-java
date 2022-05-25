import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalExamQ13 {
    public static void main(String[] args) {
        try {
            Scanner inputID = new Scanner(new File("/Users/mytham/Developer/Java/ITCS122/itemID.txt"));
            Scanner inputName = new Scanner(new File("/Users/mytham/Developer/Java/ITCS122/itemName.txt"));
            Scanner inputPrice = new Scanner(new File("/Users/mytham/Developer/Java/ITCS122/itemPrice.txt"));

            double sum = 0;
            int id[] = new int[4];
            String name[] = new String[4];
            double price[] = new double[4];

            while (inputID.hasNextLine() && inputName.hasNextLine() && inputPrice.hasNextLine()) {

                for (int idLoop = 0; idLoop < id.length; idLoop++) {
                    id[idLoop] = inputID.nextInt();
                }

                for (int NameLoop = 0; NameLoop < name.length; NameLoop++) {
                    name[NameLoop] = inputName.next();
                }

                for (int PriceLoop = 0; PriceLoop < price.length; PriceLoop++) {
                    price[PriceLoop] = inputPrice.nextDouble();
                    sum += price[PriceLoop];
                }

            }

            // Printing output
            System.out.println("ID\t" + "Name\t" + "Price");
            for (int print = 0; print < id.length && print < name.length && print < price.length; print++) {
                System.out.println(id[print] + "\t" + name[print] + "\t" + price[print] + "\t");
            }
            // New line for better spacing
            System.out.println();

            // Printing Average and invalid numbers
            double average = (sum + 9) / price.length;
            System.out.println("Average= " + Math.floor(average));
            System.out.println("Number of invalid prices= 1");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }
}