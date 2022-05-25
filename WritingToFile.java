import java.io.File; // import the file class
import java.io.FileWriter;
import java.io.IOException; //import the IOException class to handle error

public class WritingToFile {
    public static void main(String[] args) {
        // Creating File
        try {
            File create = new File("/Users/mytham/Developer/Java/ITCS122/WritingToFile.txt");
            if (create.createNewFile())
                System.out.println("File Created Successfully! " + create.getName());
            else
                System.out.println("File Already Exists!");

        } catch (IOException e) {
            System.out.println("An Error Occurred! ");
        }

        // Writing Data
        try {
            FileWriter data = new FileWriter("/Users/mytham/Developer/Java/ITCS122/WritingToFile.txt");
            data.write("I love Java!");
            data.close();
            System.out.println("Data Written Successfully!");

        } catch (IOException e) {
            System.out.println("An Error Occurred! ");
        }
    }
}