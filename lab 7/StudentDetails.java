
import java.io.*;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.println("Enter Roll No, Name, Subject, Marks:");
        String rollNo = scanner.next();
        String name = scanner.next();
        String subject = scanner.next();
        String marks = scanner.next();

        // File name
        System.out.println("Enter the file name to save student details:");
        String fileName = scanner.next();

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(rollNo + "," + name + "," + subject + "," + marks);
            writer.newLine();
        }

        // Reading and displaying file content
        System.out.println("Contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        scanner.close();
    }
}
