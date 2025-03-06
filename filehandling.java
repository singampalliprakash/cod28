import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileHandling {
    public static void main(String[] args) {
        String fileName = "test.txt";

        // Write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, Java File Handling!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Read from the file
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
