import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "E:\\MCA Pre\\PW\\PW\\Timepass\\Round 2\\source.txt";
        String destinationFile = "E:\\MCA Pre\\PW\\PW\\Timepass\\Round 2\\destination.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            // Read lines from the source file and write to the destination file
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}